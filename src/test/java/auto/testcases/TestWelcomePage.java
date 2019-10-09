package auto.testcases;


import auto.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import auto.utility.Init;
import auto.pages.createprojectPage;


/**
 * Created with IntelliJ IDEA.
 * User: Nadun Ilamperuma
 * Date: 10/4/19
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestWelcomePage extends Init{


    @Test(priority = 1)
    public void TestcreateProject () throws InterruptedException {

        WelcomePage WelcomePageinstance = new WelcomePage(driver);
        WelcomePageinstance.verifyWelcomePageLabel();

    }

}
