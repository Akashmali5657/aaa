import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependencyDemo {

    @Test
    void startCar(){
        System.out.println("Car is started");
    }

    @Test(dependsOnMethods = {"startCar"}, alwaysRun = true)
    void driveCar(){
        System.out.println("driving car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car is stopped");
    }

    @Test
    void parkCar(){
        System.out.println("Car is parked");
    }
}
