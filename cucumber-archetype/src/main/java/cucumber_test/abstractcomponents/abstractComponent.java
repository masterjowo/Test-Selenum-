package cucumber_test.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractComponent {

    WebDriver driver;
    public abstractComponent(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath =  "//a[@class='text-foreground-navbar'][normalize-space()='Beranda']")
    WebElement homebutton ;

    @FindBy(css="//a[normalize-space()='Riwayat Pesanan']")
    WebElement orderhistory;

    @FindBy(css="//a[normalize-space()='Kalkulator MLBB']")
    WebElement MLBBcalculator;

    @FindBy(css="//a[normalize-space()='Berita']")
    WebElement news;



    public void waitForVisibilityElement(By findBy){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    // public void goToCart(){
    //     cartButton.click();
    // }

    // public void goToOrderPage() throws InterruptedException{
    //     waitForVisibilityElement(orderHeader);
    //     cartOrders.click();
    // }
}
