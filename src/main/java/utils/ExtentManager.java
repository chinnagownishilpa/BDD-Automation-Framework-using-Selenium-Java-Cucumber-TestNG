package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getExtent() {
        if (extent == null) {
            ExtentSparkReporter reporter =
                    new ExtentSparkReporter("target/ExtentReport.html");

            reporter.config().setReportName("UI Automation Test Report");
            reporter.config().setDocumentTitle("Automation Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}
