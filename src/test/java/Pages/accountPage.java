package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class accountPage extends BasePage{
    public accountPage(AppiumDriver driver) {
        super(driver);
    }
    By accountNameBar = By.id("com.pozitron.hepsiburada:id/tvUserNameFull");
    By myFavoritesPageButton = By.xpath("//android.widget.TextView[@text=\"Beğendiklerim\"]");
    By logOutButton = By.xpath("//android.widget.Button[@text=\"Çıkış yap\"]");
    public void checkToAccountIsLogged(){
        elementHelper.checkElementIfExist(accountNameBar);
    }
    public void goToFavoritesPage() {
        elementHelper.clickToElement(myFavoritesPageButton);
    }
    public void logOutFromAccount() {
        elementHelper.scroolDownUntilFindTheElement(logOutButton);
        elementHelper.clickToElement(logOutButton);
    }
}
