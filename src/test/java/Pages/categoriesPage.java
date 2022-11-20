package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class categoriesPage extends BasePage{
    public categoriesPage(AppiumDriver driver) {
        super(driver);
    }
    By secondCategory = By.xpath("//android.view.ViewGroup[@resource-id=\"com.pozitron.hepsiburada:id/layoutRoot\"][2]");
    public void selectCategory() {
        elementHelper.clickToElement(secondCategory);
    }
}
