import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckLoginPage extends PageBase{
    public CheckLoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    String txt = "Tamam";
    String messageTxt;
    @AndroidFindBy(id = "android:id/autofill_save_no")
    MobileElement saveNoPassword;

    @AndroidFindBy(id = "android:id/button1")
    MobileElement message;

    public void noSavePassword(){
        saveNoPassword.click();
    }

    public boolean Login(String txt){
        messageTxt = message.getText();
        if(messageTxt == txt){
            System.out.println("Successful Login!");
            return true;
        }else {
            System.out.println("Failed Login!");
            return false;
        }
    }
}
