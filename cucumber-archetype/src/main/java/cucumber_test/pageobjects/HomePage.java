package cucumber_test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber_test.abstractcomponents.abstractComponent;

public class HomePage extends abstractComponent {


    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    
    @FindBy(xpath = "//button[normalize-space()='Masuk']")
    WebElement masuk;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(id = "login")
    WebElement login;

    public void masuk(){
        masuk.click();
    }
    // public void closeBander(){
    //     masuk.click();
    // }

    public void goTo(){
        driver.get("https://vocagame.com/id-id");
    }
}
