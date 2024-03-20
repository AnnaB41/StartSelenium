import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){

        wd = new ChromeDriver();
        //  wd.get("https://www.w3schools.com/css/css_table.asp");
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void testCSS(){ // выяснить в тесте, что значение Канада в таблице
        String text = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child")).getText();
        Assert.assertEquals(text, "Canada");
        Assert.assertTrue(text.contains("Can"));

    }

    @Test
    public void homeWork(){
        System.out.println(
                wd.findElements(
                        By.xpath("//*[@id='customers']//tr")).size());
        System.out.println(
                wd.findElements(
                        By.xpath("//*[@id='customers']//th")).size());
        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        wd.findElement(By.cssSelector("#customers td:last-child"));
    }

}
