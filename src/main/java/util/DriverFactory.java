package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initializeDriver(String platform){
        properties = ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();

        if(platform.equals("Android")){
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("udid",properties.getProperty("udid"));
            capabilities.setCapability("appPackage",properties.getProperty("appPackage"));
            capabilities.setCapability("appActivity",properties.getProperty("appActivity"));
        }
        else if(platform.equals("IOS")){
            capabilities.setCapability("platformName","IOS");
            capabilities.setCapability("udid",properties.getProperty("udid"));
            capabilities.setCapability("appPackage",properties.getProperty("appPackage"));
            capabilities.setCapability("appActivity",properties.getProperty("appActivity"));
        }
        try {
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();
    }

    public static AppiumDriver getDriver(){
        return driver;
    }
}
