/*
1.Setup
2.Login
3.close
 */

import org.testng.annotations.Test;

public class MyFirstTest {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is opening browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login Test");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("This is closing browser");
    }
}
