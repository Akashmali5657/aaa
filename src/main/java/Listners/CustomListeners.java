package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomListeners implements ITestListener {

    public void onStart(ITestContext arg){
        System.out.println("Starts Test Execution....."+arg.getName());
    }

    public void onFinish(ITestContext arg){
        System.out.println("Finish Test Execution....."+arg.getName());
    }

    public void onTestSkipped(ITestContext arg0){
        System.out.println("Skipped Test ....."+arg0.getName());
    }

    public void onTestSuccess(ITestContext arg0){
        System.out.println("Success Test ....."+arg0.getName());
    }

    public void onTestFailure(ITestContext arg0){
        System.out.println("Failed Test ....."+arg0.getName());
    }
}
