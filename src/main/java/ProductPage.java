import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends PageBase{
    public ProductPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"ürün fotoğrafı\"])[1]")
    MobileElement productImage;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/productImage")
    MobileElement product;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/leftIcon")
    MobileElement closedBtn;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/product_detail_favourites")
    MobileElement addFavourites;

    public void clickProductImage(){
        productImage.click();
        product.click();
    }

    public void verticalScroll(){
        scroll(814, 1143,231, 1139);
    }

    public void closedImage(){
        closedBtn.click();
    }

    public void setAddFavourites(){
        addFavourites.click();
    }

}
