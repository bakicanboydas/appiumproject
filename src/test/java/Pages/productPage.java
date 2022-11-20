package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class productPage extends BasePage{
    public productPage(AppiumDriver driver) {
        super(driver);
    }

    By favoriteButton = By.id("com.pozitron.hepsiburada:id/product_detail_favourites_new");
    By backButtonImage = By.id("com.pozitron.hepsiburada:id/leftIcon");
    By productImage = By.id("com.pozitron.hepsiburada:id/productImage");
    public void selectAProductWithMoreThanOnePicture() {
        List<WebElement> listOfImageBars = driver.findElements(By.id("com.pozitron.hepsiburada:id/pi_product_list_item_image"));
        List <WebElement> products = driver.findElements(By.id("com.pozitron.hepsiburada:id/view_product"));
        elementHelper.scroolDownUntilFindTheElement((listOfImageBars.get(0)));
        elementHelper.clickToElement(products.get(0));
        elementHelper.waitForSecond(5);
        elementHelper.clickToElement(favoriteButton);
    }
    public void clickToFavoriteButton() {
        elementHelper.clickToElement(favoriteButton);
    }
    public void closeImagePage() {
        elementHelper.clickToElement(backButtonImage);
    }
    public void clickToProductImage() {
        elementHelper.clickToElement(productImage);
    }
    public void swipeImages() {
        List <WebElement> listOfPlaceHolderImages = driver.findElements(By.id("com.pozitron.hepsiburada:id/placeHolderImage"));
        int swipeTime = listOfPlaceHolderImages.size();
        elementHelper.swipeToLeftNTime(swipeTime-1);
    }
}
