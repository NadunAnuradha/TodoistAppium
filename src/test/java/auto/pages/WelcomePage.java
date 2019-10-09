package auto.pages;

import auto.utility.Services;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nil
 * Date: 10/8/19
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class WelcomePage extends Services {

    final static String CurrentDay = "Today";
    String ContinueWithGoogle = "android.widget.Button";
    String ClickaccountName = "android.widget.LinearLayout";
    String VerifyProjectLabel = "android.widget.TextView";
    String CreateProjectbuttonClass = "android.widget.ImageButton";
    String DetectWelcome = "//android.widget.Button[@resource-id='com.todoist:id/empty_help_link']";

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public WelcomePage verifyWelcomePageLabel() throws InterruptedException {
        WaitforElementPresentClasName(ContinueWithGoogle);
        clickOnButtonByClass(ContinueWithGoogle);
        WaitforElementPresentClasName(ClickaccountName);
        clickOnButtonByClass(ClickaccountName);
        WaitforElementPresentXpath(DetectWelcome);

        List<WebElement> list = driver.findElements(By.className(VerifyProjectLabel));
        assertEquals(list.get(2).getText(),CurrentDay);
        return this;
    }


}
