package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import base.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;

public class TestListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getExtent();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String path = ScreenshotUtil.captureScreenshot(
                DriverFactory.getDriver(),
                result.getMethod().getMethodName()
        );
        test.get().fail(result.getThrowable());
        test.get().addScreenCaptureFromPath(path);
    }
}
