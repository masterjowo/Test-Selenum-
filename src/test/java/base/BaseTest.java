package base;

// import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;


public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
         driver = DriverFactory.createDriver();
    }

    @AfterMethod
    public void teardown() {
        System.out.println("AFTER METHOD JALAN");
        if (driver != null) {
            driver.quit();
        }
    }
}
