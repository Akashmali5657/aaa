import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTests {

    WebDriver driver;

    @Test(priority = 1)
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divlogo\"]/img"));
        Assert.assertFalse(logo.isDisplayed(),"Logo not present");
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
