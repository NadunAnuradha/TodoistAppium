package auto.pages;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import auto.utility.Services;
import org.openqa.selenium.interactions.touch.TouchActions;


import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Nadun Ilamperuma
 * Date: 10/4/19
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 *
 */
public class createprojectPage extends Services {



    String Menulistbutton = "android.widget.ImageButton";
    String AddProjectIcon  = "android.widget.ImageButton";
    String ProjectsIcon = "//android.widget.TextView[@resource-id='com.todoist:id/name']";
    String ProjectNamefield = "//android.widget.EditText[@resource-id='com.todoist:id/name']";
    String ProjectAddbutton = "//android.widget.TextView[@resource-id='com.todoist:id/menu_form_submit']";
    String VerifyProjectLabel = "android.widget.TextView";
    final static String NewProjectName = "New Project";



    //WebDriver driver;

    public createprojectPage(WebDriver driver) {
        super(driver);
    }



    public createprojectPage NavigateToNewProject() throws InterruptedException {

        ListClick(0,Menulistbutton);
        WaitforElementPresentXpath(ProjectsIcon);
        ListClick(0,AddProjectIcon);
        return this;
    }


    public createprojectPage CreateNewProject() throws InterruptedException {
       driver.findElement(By.xpath(ProjectNamefield)).sendKeys("New Project");
       driver.findElement(By.xpath(ProjectAddbutton)).click();
       return this;
    }

    public createprojectPage VerifyAddNewProject() throws InterruptedException {
        assertEquals(ListgetText(2,VerifyProjectLabel),NewProjectName);
        return this;
    }

 // public static void main(String args[])throws IOException, XmlPullParserException
 //  {
     //   System.out.println("Hello, World" );
     //   MavenXpp3Reader reader = new MavenXpp3Reader();
     //   Model model = reader.read(new FileReader("pom.xml"));
     //   System.out.println(model.getProperties().getProperty("device.name"));

  // }


}
