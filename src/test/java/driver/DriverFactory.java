package driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver createDriver() throws IOException {

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(
                "src/test/java/resources/GlobalData.properties");
        properties.load(fis);

        // System property override > properties file
        String browser = System.getProperty("browser",
                properties.getProperty("browser"));

        WebDriver driver;

        switch (browser.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();

                // Optional headless dari system property
                if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
                    options.addArguments("--headless=new");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--disable-gpu");
                }

                driver = new ChromeDriver(options);
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            default:
                throw new IllegalArgumentException("Browser tidak didukung: " + browser);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().setSize(new Dimension(1440, 832));

        return driver;
    }
}
