package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class loginPage extends BasePage{
    public loginPage(AppiumDriver driver) {
        super(driver);
    }
    By userName = By.xpath("//android.widget.EditText[@resource-id=\"txtUserName\"]");
    By loginButton = By.xpath("//android.widget.Button[@resource-id=\"btnLogin\"]");
    By password = By.xpath("//android.widget.EditText[@resource-id=\"txtPassword\"]");
    By passwordLoginButton = By.xpath("//android.widget.Button[@resource-id=\"btnEmailSelect\"]");
    By welcomeOkayButton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    public void logInToAccount() {
        elementHelper.waitForSecond(5);
        elementHelper.sendKeysToElement(userName,"YOUREMAIL@ADRESS.COM");
        elementHelper.clickToElement(loginButton);
        elementHelper.waitForSecond(3);
        elementHelper.sendKeysToElement(password,"YOURPASSWORD");
        elementHelper.clickToElement(passwordLoginButton);
        elementHelper.waitForSecond(5);
        elementHelper.clickElementIfExists(welcomeOkayButton);

    }
}
