package base;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    public void setup() {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
    }

    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
