package stepdefenitions;

import org.openqa.selenium.WebDriver;

import driver.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import cucumber_test.pageobjects.LandingPage;
import cucumber_test.pageobjects.HomePage;



public class LoginStepDefenition {
private LandingPage landingPage;
private HomePage homePage;
private WebDriver driver;


@Before
public void setup()  throws Exception {
    driver = DriverFactory.createDriver();
    // landingPage = new LandingPage(driver);
    homePage = new HomePage(driver);
}



@Given("Diberikan  user akses halaman landig page")
public void diberikan_user_akses_halaman() {
    homePage.goTo();

}
@When("Ketika user sudah berada pada halaman awal, user dapat menerapkan tombol Masuk")
public void ketika_user_sudah_berada_pada_halaman_awal_user_dapat_melihat() {
    homePage.masuk();
}
@When("Dan user memasukan UserName {string}")
public void dan_user_memasukan_user_name(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Dan user memasukan password {string}")
public void dan_user_memasukan_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Dan user menekan tombol login")
public void dan_user_menekan_tombol_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Maka user dapat melihat {string}")
public void maka_user_dapat_melihat(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
