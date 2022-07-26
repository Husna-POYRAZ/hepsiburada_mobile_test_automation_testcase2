import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static AppiumDriver driver;
    public WebDriverWait wait;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "11 RP1A.200720.011");
        desiredCapabilities.setCapability("appium:deviceName", "Redmi Note 8 Pro");
        desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appium:udid", "wos4w4rojfbugqs4");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\Dell\\Documents\\MOBVEN\\apk\\Hepsiburada_ Online Alışveriş_5.4.0_apkcombo.com.apk");
        desiredCapabilities.setCapability("appium:autoGrantPermissions", true);

        //URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        //driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        wait = new WebDriverWait(driver,15);
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    }

    public static void tearDown(){
        if (null != driver){
            driver.quit();
        }
    }
}
