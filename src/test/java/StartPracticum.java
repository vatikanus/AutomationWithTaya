import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartPracticum {
    WebDriver wd;


    @BeforeMethod
    public void preCondition()
    {
        wd = new ChromeDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        //wd.navigate().to("https://www.toolsqa.com");


    }
    @Test
    public void testName()
    {
        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("div"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        for(WebElement e:elements)
        {
            System.out.println(e);
        }

        System.out.println(elements.size());
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("[href = '/login']"));
        wd.findElement(By.cssSelector("[href]"));
        wd.findElement(By.cssSelector("[href ^= '/lo']")); //start
        wd.findElement(By.cssSelector("[href $= 'in']")); //end
        wd.findElement(By.cssSelector("[href *= 'gi']")); // contains

    }

    @Test
    public void testname2()
    {

    }


    @AfterMethod
    public void postCondition()
    {
        wd.close();
        wd.quit();

    }

}

