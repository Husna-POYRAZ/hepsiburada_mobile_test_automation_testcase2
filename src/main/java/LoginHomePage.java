import io.appium.java_client.AppiumDriver;

public class LoginHomePage extends PageBase{

    public LoginHomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void closeAdvertisement(){
        scroll(923, 1455,942, 1451);
        scroll(930, 665, 884, 669);
    }

}
