package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.className("shopping_cart_link");
    By checkout = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zip = By.id("postal-code");
    By continueBtn = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutFlow() {
        driver.findElement(addToCart).click();
        driver.findElement(cart).click();
        driver.findElement(checkout).click();
        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(zip).sendKeys("560001");
        driver.findElement(continueBtn).click();
    }
}
