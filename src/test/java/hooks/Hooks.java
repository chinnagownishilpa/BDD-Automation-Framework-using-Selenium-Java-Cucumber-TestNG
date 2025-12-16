package hooks;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void launchBrowser() {
        DriverFactory.getDriver();
    }

    @After
    public void closeBrowser() {
        DriverFactory.quitDriver();
    }
}
