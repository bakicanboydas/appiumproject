package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;


public class hepsiBuradaPages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By givePermission = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By goToPremium = By.xpath("//android.widget.ImageView[@content-desc=\"Premium'a geç\"]");
    By location = By.id("com.pozitron.hepsiburada:id/textViewLocation");

    By selectCity = By.xpath("//android.widget.ImageView[@content-desc=\"İl seçin\"]");
    By istanbul = By.xpath("//android.widget.TextView[@text=\"İstanbul\"]");
    By selectProvince = By.xpath("//android.widget.ImageView[@content-desc=\"İlçe seçin\"]");
    By kadikoy = By.xpath("//android.widget.TextView[@text=\"Kadıköy\"]");
    By selectStreet = By.xpath("//android.widget.ImageView[@content-desc=\"Mahalle seçin\"]");
    By acibadem = By.xpath("//android.widget.TextView[@text=\"Acıbadem\"]");
    By saveButton = By.id("com.pozitron.hepsiburada:id/button");
    By locationSavePopup = By.xpath("//android.widget.TextView[@text=\"Konumunuz kaydedildi.\"]");

    By myCategories = By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategorilerim\"]");
    By secondCategory = By.xpath("//android.view.ViewGroup[@resource-id=\"com.pozitron.hepsiburada:id/layoutRoot\"][2]");

    By allSuperOffers = By.id("com.pozitron.hepsiburada:id/textView_show_all");
    By productImage = By.id("com.pozitron.hepsiburada:id/productImage");
    By backButton = By.id("com.pozitron.hepsiburada:id/leftIcon");
    By favoriteButton = By.id("com.pozitron.hepsiburada:id/product_detail_favourites_new");
    By userName = By.xpath("//android.widget.EditText[@resource-id=\"txtUserName\"]");
    By loginButton = By.xpath("//android.widget.Button[@resource-id=\"btnLogin\"]");
    By password = By.xpath("//android.widget.EditText[@resource-id=\"txtPassword\"]");
    By passwordLoginButton = By.xpath("//android.widget.Button[@resource-id=\"btnEmailSelect\"]");
    By welcomeOkayButton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    By myAccountButton = By.xpath("//android.widget.ImageView[@content-desc=\"Hesabım\"]");
    By accountNameBar = By.id("com.pozitron.hepsiburada:id/tvUserNameFull");
    By myFavoritesPageButton = By.xpath("//android.widget.TextView[@text=\"Beğendiklerim\"]");
    By addToCartButton = By.xpath("//android.widget.Button[@text=\"Sepete ekle\"]");
    By removeCardHamburgerButton = By.xpath("//android.widget.ListView/android.view.View/android.view.View/android.view.View/android.widget.Image");
    By removeCardDeleteFromList = By.xpath("//android.widget.TextView[@text=\"Listeden sil\"]");
    By logOutButton = By.xpath("//android.widget.Button[@text=\"Çıkış yap\"]");



    public hepsiBuradaPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickPermissionButtons() {
        elementHelper.clickElementIfExists(givePermission);
        elementHelper.clickToElement(goToPremium);

    }
    public void clickLocationPart() {
        elementHelper.clickToElement(location);
    }

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

    public void checkPopupIsVisible() {
        elementHelper.checkElementIfExist(locationSavePopup);
    }

    public void goToCategories() {
        elementHelper.clickToElement(myCategories);
    }

    public void selectCategory() {
        elementHelper.clickToElement(secondCategory);
    }


    public void clickToSuperPrice() {
        elementHelper.clickToElement(allSuperOffers);
    }

    public void selectAProductWithMoreThanOnePicture() {
        List <WebElement> listOfImageBars = driver.findElements(By.id("com.pozitron.hepsiburada:id/pi_product_list_item_image"));
        List <WebElement> products = driver.findElements(By.id("com.pozitron.hepsiburada:id/view_product"));
        elementHelper.scroolDownUntilFindTheElement((listOfImageBars.get(0)));
        elementHelper.clickToElement(products.get(0));
        elementHelper.waitForSecond(5);
        elementHelper.clickToElement(favoriteButton);

    }

    public void clickToProductImage() {
        elementHelper.clickToElement(productImage);
    }

    public void swipeImages() {
        List <WebElement> listOfPlaceHolderImages = driver.findElements(By.id("com.pozitron.hepsiburada:id/placeHolderImage"));
        int swipeTime = listOfPlaceHolderImages.size();
        elementHelper.swipeToLeftNTime(swipeTime-1);
    }

    public void closeImagePage() {
        elementHelper.clickToElement(backButton);
    }

    public void clickToFavoriteButton() {
        elementHelper.clickToElement(favoriteButton);
    }

    public void logInToAccount() {
        elementHelper.waitForSecond(5);
        elementHelper.sendKeysToElement(userName,"YOUREMAILADRESS@GMAIL.COM");
        elementHelper.clickToElement(loginButton);
        elementHelper.waitForSecond(3);
        elementHelper.sendKeysToElement(password,"YOUR PASSWORD");
        elementHelper.clickToElement(passwordLoginButton);
        elementHelper.waitForSecond(5);
        elementHelper.clickElementIfExists(welcomeOkayButton);

    }

    public void goToAccountPage(){
        elementHelper.clickToElement(myAccountButton);
    }

    public void checkToAccountIsLogged(){
        elementHelper.checkElementIfExist(accountNameBar);
    }

    public void goToFavoritesPage() {
        elementHelper.clickToElement(myFavoritesPageButton);
    }

    public void checkProductInFavoritesPage() {
        elementHelper.checkElementIfExist(addToCartButton);
    }

    public void removeProductFromFavorites() {
        elementHelper.clickToElement(removeCardHamburgerButton);
        elementHelper.clickToElement(removeCardDeleteFromList);
        elementHelper.deviceGoBack();

    }

    public void logOutFromAccount() {
        elementHelper.scroolDownUntilFindTheElement(logOutButton);
        elementHelper.clickToElement(logOutButton);
    }

    public void goBack(){
        elementHelper.clickToElement(backButton);
    }
}
//Thanks