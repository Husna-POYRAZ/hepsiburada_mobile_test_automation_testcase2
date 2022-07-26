import io.appium.java_client.AppiumDriver;

public class SuperPricePageTest extends SuperPricePage{
    public SuperPricePageTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    SuperPricePage superPricePage;

    public void superPricePageTest(){
        superPricePage.clickSuperPrice();
    }
}
