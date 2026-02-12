package cucumber_test.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
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
    // @FindBy(xpath = "(//img[contains(@alt,'Mobile Legends: Bang Bang')])[1]")
    // WebElement orderML;
    @FindBy(xpath = "(//*[name()='svg'][@class='lucide lucide-x w-full text-heading-color'])[1]")
    WebElement tomblx;
    @FindBy(xpath = "(//button[normalize-space()='Terima Semua Cookie'])[1]")
    WebElement tomblCookie;
    @FindBy(xpath = "//*[@id='Populer']/ul/li[1]/a/div/div[3]/img")
    WebElement orderML;
    public void masuk(){
        masuk.click();
    }
    public String Successsnackbar(){
       return snackbar.getText();
    }
    public void orderml(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
    orderML.click();
    }
    public void goTo(){
        driver.get("https://vocagame.com/id-id");
        tomblx.click();
        tomblCookie.click();
    }
}
