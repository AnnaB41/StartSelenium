import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartTest {

    WebDriver webDriver;

    @BeforeMethod
    public void preCondition(){
        webDriver = new ChromeDriver();
    }


    @Test
    public void testMethod(){

    }


    @AfterMethod
    public void postCondition(){

    }
}
