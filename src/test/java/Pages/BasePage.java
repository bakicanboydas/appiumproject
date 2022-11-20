package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class BasePage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    public BasePage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

}
