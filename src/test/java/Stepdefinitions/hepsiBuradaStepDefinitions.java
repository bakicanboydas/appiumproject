package Stepdefinitions;

import Pages.hepsiBuradaPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class hepsiBuradaStepDefinitions {

    hepsiBuradaPages hepsiBuradaPages = new hepsiBuradaPages(DriverFactory.getDriver());

    @When("Click location part in main page")
    public void clickLocationPartInMainPage() {
        hepsiBuradaPages.clickLocationPart();
    }

    @When("Select city,province,street and click save button")
    public void selectCityProvinceStreetAndClickSaveButton() {
        hepsiBuradaPages.selectCityProvinceAndStreet();
        hepsiBuradaPages.clickToSaveButton();
    }

    @When("Check the popup about your locaiton has been saved")
    public void checkThePopupAbout() {
        hepsiBuradaPages.checkPopupIsVisible();
    }

    @When("Click to categories from tab bar")
    public void clickToCategoriesFromTabBar() {
        hepsiBuradaPages.goToCategories();
    }

    @When("Select a randomly category and it will direct list page")
    public void selectARandomlyCategoryAndItWillDirectListPage() {
        hepsiBuradaPages.selectCategory();
    }

    @When("Compare location information in list page with which you selected your location from main page")
    public void compareLocationInformationInListPageWithWhichYouSelectedYourLocationFromMainPage() {
        System.out.println("Bu kısım boş bırakılıyor HR ile bu kısım hakkında konuşmuştuk. 'YARIN KAPINDA' menüsü görüntülenmiyor. ");
    }

    @Given("Allow all permissions")
    public void allowAllPermissions() {
        hepsiBuradaPages.clickPermissionButtons();
    }

    @When("Click to super price from mainpage")
    public void clickToSuperPriceFromMainpage() {
        hepsiBuradaPages.clickToSuperPrice();
    }

    @When("Select a product from super price page but product must has two photo at least")
    public void selectAProductFromSuperPricePageButProductMustHasPhotoAtLeast() {
        hepsiBuradaPages.selectAProductWithMoreThanOnePicture();
    }

    @When("Click to product image from product detail page and swipe to left")
    public void clickToProductImageFromProductDetailPageAndSwipeToLeft() {
        hepsiBuradaPages.clickToProductImage();
        hepsiBuradaPages.swipeImages();
    }

    @When("Close image page")
    public void closeImagePage() {
        hepsiBuradaPages.closeImagePage();
    }

    @When("Click favorite button from product details page")
    public void clickFavoriteButtonFromProductDetailsPage() {
        hepsiBuradaPages.clickToFavoriteButton();
    }

    @When("Login from next page and control that you are logged in")
    public void loginFromNextPageAndControlThatYouAreLoggedIn() {
        hepsiBuradaPages.logInToAccount();
        hepsiBuradaPages.goBack();
        hepsiBuradaPages.goToAccountPage();
        hepsiBuradaPages.checkToAccountIsLogged();
    }

    @When("Go to favorites page and check that product added to this page")
    public void goToFavoritesPageAndCheckThatProductAddedToThisPage() {
        hepsiBuradaPages.goToFavoritesPage();
        hepsiBuradaPages.checkProductInFavoritesPage();
    }

    @Then("Delete product from favorites and log out from account")
    public void deleteProductFromFavoritesAndLogOutFromAccount() {
        hepsiBuradaPages.removeProductFromFavorites();
        hepsiBuradaPages.logOutFromAccount();
    }
}