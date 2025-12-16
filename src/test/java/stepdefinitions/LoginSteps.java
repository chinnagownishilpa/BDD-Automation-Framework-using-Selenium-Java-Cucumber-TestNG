package stepdefinitions;

import org.testng.Assert;
import base.DriverFactory;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_on_login_page() {
        DriverFactory.getDriver()
            .get(ConfigReader.get("url"));
    }


    @When("user enters valid credentials")
    public void user_enters_credentials() {
        loginPage.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );
    }

    @Then("user should be logged in successfully")
    public void verify_login() {
        Assert.assertTrue(
            loginPage.isLoginSuccessful(),
            "Login failed: Inventory page not displayed"
        );
    }

}
