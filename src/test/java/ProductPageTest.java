import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class ProductPageTest extends ProductPage{

    public ProductPageTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    ProductPage productPage;

    @Test(priority = 1)
    public void addFavourityProduct(){
        productPage.clickProductImage();
        productPage.verticalScroll();
        productPage.closedImage();
        productPage.setAddFavourites();
    }
}
