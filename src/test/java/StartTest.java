import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){

        wd = new ChromeDriver();
      //  wd.get("https://telranedu.web.app/home");
       wd.navigate().to("https://telranedu.web.app/home");

    }


    @Test
    public void testMethod(){

        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a")); // tagName by CSS selector
        wd.findElement(By.xpath("//a"));// tagName by xpath

        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());
        wd.findElement(By.id("root")); // search by id
        wd.findElement(By.cssSelector("[id='root'"));; // search By.cssSelector
        wd.findElement(By.xpath("//*[@id='root']")); // search by xpath
        wd.findElement(By.className("container")); //search by classname
        wd.findElement(By.cssSelector(".container"));// search By.cssSelector
        wd.findElement(By.xpath("//*[@class='container']"));// search By.xpath
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.xpath("//*[text()='HOME']")); //search by xpath
        wd.findElement(By.xpath("//*[.='HOME']")); //search by xpath краткая запись

        wd.findElement(By.partialLinkText("OM"));

    }

    @Test
    public void testMethod1(){
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.xpath("//*[@href='/login']")); // by xpath наименование
        wd.findElement(By.cssSelector("[href*='og']")); // содержит текст
        wd.findElement(By.xpath("//*[contains(@href,'og')]")); // содержит текст by xpath
        wd.findElement(By.cssSelector("[href^='/log']")); // начинается с текста
        wd.findElement(By.xpath("//*[starts-with(@href,'/log')]")); // начинается с текста by xpath
        wd.findElement(By.cssSelector("[href$='gin']")); // Заканчивается текстом
    }


    @AfterMethod
    public void postCondition(){
    //    wd.close();
    //    wd.quit();

    }
}
