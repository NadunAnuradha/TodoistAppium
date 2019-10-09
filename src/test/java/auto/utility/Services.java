package auto.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nadun Ilamperuma
 * Date: 10/7/19
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Services {

    protected WebDriver driver;
    public Services(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButtonByClass(String Button) {
        driver.findElement(By.className(Button)).click();
    }


    public void clickOnButtonByXapth(String Button) {
        driver.findElement(By.className(Button)).click();
    }
    public boolean isElementPresentByClass(String locator) {
        try {
            driver.findElement(By.className(locator));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean WaitforElementPresentXpath(String locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }


    public boolean WaitforElementPresentClasName(String locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className (locator)));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    public void ListClick   (int indextnum , String locator) {
        List<WebElement> List = driver.findElements(By.className(locator));
        List.get(indextnum).click();

    }

    public String  ListgetText   (int indextnum , String locator) {
        List<WebElement> List = driver.findElements(By.className(locator));
        return List.get(indextnum).getText();
    }

}
