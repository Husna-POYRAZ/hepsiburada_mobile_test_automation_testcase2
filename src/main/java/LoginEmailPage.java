import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginEmailPage extends PageBase{
    public LoginEmailPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public String email = "hbtesting1@mailinator.com";
    public String password = "Hbtesting123.";

    @AndroidFindBy(id = "txtUserName")
    MobileElement emailArea;

    @AndroidFindBy(id = "btnLogin")
    MobileElement loginBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    MobileElement passwordArea;

    @AndroidFindBy(id = "btnEmailSelect")
    MobileElement passwordLoginBtn;

    public void login(){
        emailArea.click();
        emailArea.sendKeys(email);
        loginBtn.click();
        passwordArea.click();
        passwordArea.sendKeys(password);
        passwordLoginBtn.click();
    }



}
