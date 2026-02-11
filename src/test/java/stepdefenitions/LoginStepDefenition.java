package stepdefenitions;


import org.openqa.selenium.WebDriver;


import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import cucumber_test.pageobjects.LandingPage;
import cucumber_test.pageobjects.HomePage;
import cucumber_test.pageobjects.EmailORnoPage;
import org.testng.Assert;


public class LoginStepDefenition {
private LandingPage landingPage;
private EmailORnoPage emailORnopage;
private HomePage homePage;
private WebDriver driver;

// mvn test -PTestng -Dbrowser=chrome -Dheadless=true
@Before
public void setup()  throws Exception {
    driver = DriverFactory.createDriver();
    landingPage = new LandingPage(driver);
    homePage = new HomePage(driver);
    emailORnopage = new EmailORnoPage(driver);
}
@After
public void teardown() {
        System.out.println("AFTER METHOD JALAN");
        if (driver != null) {
            driver.quit();
        }
    }


@Given("user akses halaman landig page")
public void diberikan_user_akses_halaman() {
    homePage.goTo();

}
@When("user sudah berada pada halaman awal, user dapat menerapkan tombol Masuk")
public void ketika_user_sudah_berada_pada_halaman_awal_user_dapat_melihat() {
    homePage.masuk();
}
@And ("user memasukan nomer {string} dan password {string}")
public void dan_user_memasukan_user_name(String string , String pass) {
    emailORnopage.emailORno(string, pass);
}
@And("user menekan tombol masuk")
public void dan_user_memasukan_password() {
    // Write code here that turns the phrase above into concrete actions
    emailORnopage.buttonmasuk();
}
@Then("user dapat melihat snackbar {string}")
public void maka_user_dapat_melihat(String string) {
    Assert.assertEquals(homePage.Successsnackbar(),string);
}

}
