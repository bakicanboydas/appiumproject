package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class favoritesPage extends BasePage{
    public favoritesPage(AppiumDriver driver) {
        super(driver);
    }
    By addToCartButton = By.xpath("//android.widget.Button[@text=\"Sepete ekle\"]");
    By removeCardHamburgerButton = By.xpath("//android.widget.ListView/android.view.View/android.view.View/android.view.View/android.widget.Image");
    By removeCardDeleteFromList = By.xpath("//android.widget.TextView[@text=\"Listeden sil\"]");
    public void checkProductInFavoritesPage() {
        elementHelper.checkElementIfExist(addToCartButton);
    }
    public void removeProductFromFavorites() {
        elementHelper.clickToElement(removeCardHamburgerButton);
        elementHelper.clickToElement(removeCardDeleteFromList);
        elementHelper.deviceGoBack();
    }
}
