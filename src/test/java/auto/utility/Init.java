package auto.utility;

/**
 * Created with IntelliJ IDEA.
 * User: nil (Nadun Ilamperuma)
 * Date: 10/4/19
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Init  {


    public WebDriverWait wait;
    public WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel_API_28");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        //caps.setCapability("app", "c://Users/nil/Downloads/Todoist_v12.8_apkpure.com.apk");
        caps.setCapability("appPackage","com.todoist");
        caps.setCapability("appActivity","com.todoist.activity.HomeActivity");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 20);

    }

    @AfterMethod (alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}
