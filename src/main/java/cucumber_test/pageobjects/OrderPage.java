package cucumber_test.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import cucumber_test.abstractcomponents.abstractComponent;

public class OrderPage extends abstractComponent {

    WebDriver driver;
    public OrderPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
    @FindBy(xpath = "//input[@id=':r1br:-form-item']")WebElement User;
    @FindBy(xpath = "//input[@id=':r1bs:-form-item']")WebElement Zone;
    @FindBy(xpath = "//p[@class='font-bold']")WebElement Name;
    @FindBy(xpath = "//p[@class='text-red-500']")WebElement NotListedName ;
    @FindBy(xpath = "//button[normalize-space()='Rp 27,819']")WebElement OrderItem ;
    @FindBy(xpath = "(//div[@class='flex w-full gap-2 space-x-1 rounded-lg p-2.5'])[1]")WebElement payqris ;
    @FindBy(xpath = "//img[@alt='QRIS']")WebElement qris ;
    @FindBy(xpath = "//button[@id='radix-:rgt:']//span[@class='self-start text-xs md:text-base'][normalize-space()='QRIS']")WebElement Paylis ;
    @FindBy(xpath = "(//span[@class='font-bold'][normalize-space()='Rp 27,819'])[2]")WebElement Price ;

    
    public void CareteUserAndZone(String user, String zone ){
    User.sendKeys(user);
    Zone.sendKeys( zone);
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }

    public String Name (){
        return Name.getText();
    }
    public String notlistedname (){
        return NotListedName.getText();
    }

    public void orderitem (){
        OrderItem.click();
    }
    public void qris(){
        Paylis.click();
        qris.click();
    }
    public String priceString(){
        return Price.getText();
    }
    

}
