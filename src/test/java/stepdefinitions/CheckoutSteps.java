package stepdefinitions;

import io.cucumber.java.en.*;
import pages.CheckoutPage;
import pages.LoginPage;
import config.ConfigReader;
import base.DriverFactory;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());

    @Given("user is logged in")
    public void user_logged_in() {
        DriverFactory.getDriver()
            .get(ConfigReader.get("url"));

        LoginPage loginPage =
            new LoginPage(DriverFactory.getDriver());

        loginPage.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );
    }


    @When("user completes checkout")
    public void complete_checkout() {
        checkoutPage.checkoutFlow();
    }

    @Then("checkout should be successful")
    public void verify_checkout() {}
}
