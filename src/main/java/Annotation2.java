import org.testng.annotations.*;

public class Annotation2
{

    @BeforeClass
    void beforeClass(){
        System.out.println("%% This will execute before the class %%");
    }

    @AfterClass
    void afterClass(){
        System.out.println("%% This will execute after the class %%");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute After every method");
    }

    @Test
    void test3(){
        System.out.println("This is test 3 .....");
    }

    @Test
    void test4(){
        System.out.println("This is test 4 .....");
    }

}
