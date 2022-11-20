package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class locationPage extends BasePage {
    public locationPage(AppiumDriver driver) {
        super(driver);
    }
    By selectCity = By.xpath("//android.widget.ImageView[@content-desc=\"İl seçin\"]");
    By istanbul = By.xpath("//android.widget.TextView[@text=\"İstanbul\"]");
    By selectProvince = By.xpath("//android.widget.ImageView[@content-desc=\"İlçe seçin\"]");
    By kadikoy = By.xpath("//android.widget.TextView[@text=\"Kadıköy\"]");
    By selectStreet = By.xpath("//android.widget.ImageView[@content-desc=\"Mahalle seçin\"]");
    By acibadem = By.xpath("//android.widget.TextView[@text=\"Acıbadem\"]");
    By saveButton = By.id("com.pozitron.hepsiburada:id/button");
    public void selectCityProvinceAndStreet() {
        elementHelper.clickToElement(selectCity);
        elementHelper.scroolDownUntilFindTheElement(istanbul);
        elementHelper.clickToElement(istanbul);
        elementHelper.clickToElement(selectProvince);
        elementHelper.scroolDownUntilFindTheElement(kadikoy);
        elementHelper.clickToElement(kadikoy);
        elementHelper.clickToElement(selectStreet);
        elementHelper.clickToElement(acibadem);
    }
    public void clickToSaveButton() {
        elementHelper.clickToElement(saveButton);
    }


}
