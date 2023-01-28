/*
1.Setup
2.Login
3.close
 */

import org.testng.annotations.Test;

public class MySecondTestGrouping {

    @Test(priority = 1, groups = {"Sanity"})
    void setup() {
        System.out.println("This is opening browser");
    }

    @Test(priority = 2, groups = {"Regression"})
    void AddCustomerTest() {
        System.out.println("This is Add Customer Test");
    }

    @Test(priority = 3, groups = {"Functional"})
    void SearchCustomerTest() {
        System.out.println("This is Search Customer Test");
    }

    @Test(priority = 4, groups = {"Regression"})
    void teardown() {
        System.out.println("This is closing browser");
    }
}
