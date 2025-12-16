package hooks;

import base.BaseTest;
import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import utils.ScreenshotUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Hooks extends BaseTest {

    private static ExtentReports extent = ExtentManager.getExtentReport();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Before
    public void setUp(Scenario scenario) {
        setup();
        test.set(extent.createTest(scenario.getName()));
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenshotPath = ScreenshotUtil.captureScreenshot(
                    DriverFactory.getDriver(),
                    scenario.getName().replace(" ", "_"));

            test.get()
                .fail("Scenario Failed")
                .addScreenCaptureFromPath(screenshotPath);
        } else {
            test.get().pass("Scenario Passed");
        }

        extent.flush();
        tearDown();
    }
}
