import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class PageBase {
    AppiumDriver driver;
    public static final long WAIT = 10;
    public static  String folderName;
    public static DateFormat df;

    public PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }

    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public void sendText(MobileElement element, String txt){
        waitForVisibility(element);
        element.sendKeys(txt);
    }

    public String getAttribute(MobileElement element, String attribute){
        waitForVisibility(element);
        return  element.getAttribute(attribute);
    }

    public void scroll(int fromX, int fromY, int toX, int toY){
        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(fromX,fromY))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(toX,toY))
                .release()
                .perform();
    }

    public void tapPoint(int x, int y){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y))
                .waitAction(waitOptions(ofMillis(3000)))
                .perform();
    }
/*
    public void takeScreenShot() throws IOException {
        folderName="screenshot";
        File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        df = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ssaa");
        new File(folderName).mkdir();
        String file_name = df.format(new Date())+ ".png";
        FileUtils.copyFile(f, new File(folderName+ "/" + file_name));
    }
 */
}
