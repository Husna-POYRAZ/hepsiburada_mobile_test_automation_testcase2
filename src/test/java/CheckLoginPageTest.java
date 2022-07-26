import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class CheckLoginPageTest extends CheckLoginPage{
    public CheckLoginPageTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    CheckLoginPage checkLoginPage;

    @Test
    public void loginCheckTest(){
        try{
            checkLoginPage.noSavePassword();
        }catch (Exception e){}
        checkLoginPage.Login(txt);
    }
}
