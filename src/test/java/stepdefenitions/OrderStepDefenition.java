package stepdefenitions;


import org.openqa.selenium.WebDriver;


import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bm.Maka;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import cucumber_test.tools.*;

import cucumber_test.pageobjects.LandingPage;
import cucumber_test.pageobjects.OrderPage;
import cucumber_test.pageobjects.HomePage;
import cucumber_test.pageobjects.EmailORnoPage;
import org.testng.Assert;


public class OrderStepDefenition {
    private LandingPage landingPage;
    private EmailORnoPage emailORnopage;
    private OrderPage orderPage;
    private HomePage homePage;
    private WebDriver driver;

    // mvn test -PTestng -Dbrowser=chrome -Dheadless=true
    @Before
    public void setup()  throws Exception {
        driver = DriverFactory.createDriver();
        landingPage = new LandingPage(driver);
        homePage = new HomePage(driver);
        emailORnopage = new EmailORnoPage(driver);
        orderPage= new OrderPage(driver);
    }
    @After
    public void teardown() {
            System.out.println("AFTER METHOD JALAN");
            if (driver != null) {
                driver.quit();
            }
        }



    @And("user memilih topup mobile legends")
    public void user_memilih_topup_mobile_legends () {
        homePage.orderml();
    }


    @Maka("user memasukan data user id {string} dan zone id {string}")
    public void user_memasukan_data_user_id_dan_zone_id(String string, String string2) {
        orderPage.CareteUserAndZone(string, string2);
    }
    @Maka("user dapat memastikan nama {string}")
    public void user_dapat_memastikan_nama(String string) {
        Assert.assertEquals(orderPage.Name(),tools.ubahSpasiKePlus(string));
    }


    @Maka("user melakukan pembayaran QRIS")
    public void user_melakukan_pembayaran_qris() {
        orderPage.qris();
    }

    @Maka("user memastikan harga {string}")
    public void user_memastikan_harga(String string) {
        Assert.assertEquals(string,orderPage.priceString());
   
    }

    @Maka("user memilih Weekly Diamond Pass")
    public void user_memilih_weekly_diamond_pass() {
    orderPage.orderitem();
    }
}
