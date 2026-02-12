package cucumber_test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.Keys;




import cucumber_test.abstractcomponents.abstractComponent;

public class EmailORnoPage extends abstractComponent {
    WebDriver driver;
    public EmailORnoPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
    @FindBy(xpath = "//input[@id=':Rlmfnj2f9ejsq:-form-item']")WebElement noORemail;
    @FindBy(xpath = "//button[@type='submit']")WebElement masuk;
    @FindBy(xpath = "//input[@id=':r0:-form-item']")WebElement passs;
    @FindBy(xpath = "//div[text()='Phone Number tidak ditemukan. Harap gunakan data yang valid dan terdaftar']")WebElement datanotvalid;
    
    public void emailORno(String emailORno, String password ){
    noORemail.sendKeys(emailORno);
    noORemail.sendKeys(Keys.ENTER);
    passs.sendKeys( password);
    }


    public String snackbarfail(){
        return datanotvalid.getText();
    }

    public void buttonmasuk(){
    masuk.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        
    }

}
 