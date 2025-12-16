package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
  
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String user, String pass) {
        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(username))
            .sendKeys(user);

        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public boolean isLoginSuccessful() {
        WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("inventory_container")
            ));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
