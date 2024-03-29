import org.checkerframework.checker.guieffect.qual.AlwaysSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionExamples {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setUp(String browser, String app){
       if(browser.equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
           driver = new ChromeDriver();
       }
       else if(browser.equalsIgnoreCase("firefox")){
           System.setProperty("webdriver.firefox.driver", "C://geckodriver.exe");
           driver = new FirefoxDriver();
       }
        driver.get(app);
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divlogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test(priority = 2)
    void homePageTitle(){
        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
