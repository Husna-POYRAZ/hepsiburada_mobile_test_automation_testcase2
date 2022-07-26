import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class LoginEmailPageTest extends LoginHomePage{
    public LoginEmailPageTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    LoginEmailPage loginEmailPage;
    @Test
    public void loginEmailTest(){
        loginEmailPage.login();
    }
}
