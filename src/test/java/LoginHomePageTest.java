import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class LoginHomePageTest extends LoginHomePage{
    public LoginHomePageTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    LoginHomePage loginHomePage;

    @Test(priority = 1)
    public void loginHomePageTest(){
        loginHomePage.closeAdvertisement();
    }

}
