import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.testng.annotations.*;

public class Annotation {

    @BeforeSuite
    void beforeSuite() {
        System.out.println("##..This will execute before the Suite..##");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println(".....This will execute before the test.....");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("%% This will execute before the class %%");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every method");
    }

    @Test
    void test1() {
        System.out.println("This is test 1 .....");
    }

    @Test
    void test2() {
        System.out.println("This is test 2 .....");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute After every method");
    }

    @AfterClass
    void afterClass() {
        System.out.println("%% This will execute after the class %%");
    }

    @AfterTest
    void afterTest() {
        System.out.println(".....This will execute after the test.....");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("##..This will execute after the Suite..##");
    }
}
