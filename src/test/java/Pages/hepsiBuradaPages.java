package Pages;

import io.appium.java_client.AppiumDriver;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;


public class hepsiBuradaPages extends BasePage {

    By givePermission = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By goToPremium = By.xpath("//android.widget.ImageView[@content-desc=\"Premium'a geç\"]");
    By location = By.id("com.pozitron.hepsiburada:id/textViewLocation");
    By locationSavePopup = By.xpath("//android.widget.TextView[@text=\"Konumunuz kaydedildi.\"]");
    By myCategories = By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategorilerim\"]");
    By allSuperOffers = By.id("com.pozitron.hepsiburada:id/textView_show_all");
    By backButton = By.id("com.pozitron.hepsiburada:id/leftIcon");
    By myAccountButton = By.xpath("//android.widget.ImageView[@content-desc=\"Hesabım\"]");

    public hepsiBuradaPages(AppiumDriver driver) {
        super(driver);
    }

    public void clickPermissionButtons() {
        elementHelper.clickElementIfExists(givePermission);
        elementHelper.clickToElement(goToPremium);
    }

    public void clickLocationPart() {
        elementHelper.clickToElement(location);
    }
    public void checkPopupIsVisible() {
        elementHelper.checkElementIfExist(locationSavePopup);
    }
    public void goToCategories() {
        elementHelper.clickToElement(myCategories);
    }
    public void clickToSuperPrice() {
        elementHelper.clickToElement(allSuperOffers);
    }
    public void goToAccountPage(){
        elementHelper.clickToElement(myAccountButton);
    }
    public void goBack(){
        elementHelper.clickToElement(backButton);
    }
}
//Thanks
