package cucumber_test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import cucumber_test.abstractcomponents.abstractComponent;

public class HomePage extends abstractComponent {


    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
    
    @FindBy(xpath = "//button[normalize-space()='Masuk']")
    WebElement masuk;
    @FindBy(xpath = "//div[text()='ok']")
    WebElement snackbar;

    public void masuk(){
        masuk.click();
    }
    public String Successsnackbar(){
       return snackbar.getText();
    }

    public void goTo(){
        driver.get("https://vocagame.com/id-id");
    }
}
