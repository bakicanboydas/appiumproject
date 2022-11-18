package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;

import java.io.FileNotFoundException;
import java.util.Properties;

public class Hooks {
    AppiumDriver driver;
    Properties properties;

    @Before
    public void before() throws FileNotFoundException {
        String platform = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("platform");
        properties = ConfigReader.initializeProperties();
        driver = DriverFactory.initializeDriver(platform);
    }

    @After
    public void after(){
        driver.quit();
    }
}
