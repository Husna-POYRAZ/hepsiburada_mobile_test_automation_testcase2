import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SuperPricePage extends PageBase{
    public SuperPricePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    MobileElement mobileElement;
    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/all")
    MobileElement superPrice;

    public void clickSuperPrice(){
        superPrice.click();
    }
}
