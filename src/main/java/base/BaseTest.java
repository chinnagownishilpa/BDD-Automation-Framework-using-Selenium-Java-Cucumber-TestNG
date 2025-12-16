package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;

import utils.ConfigReader;
import utils.ExtentManager;
import com.aventstack.extentreports.ExtentReports;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports extent;

    @BeforeMethod
    public void setUp() {
        extent = ExtentManager.getExtent();
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @AfterSuite
    public void flushReport() {
        extent.flush();
    }
}
