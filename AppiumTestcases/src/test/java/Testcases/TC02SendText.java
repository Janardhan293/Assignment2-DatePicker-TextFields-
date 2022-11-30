package Testcases;

import ObjectRepo.TextFields;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Utilities.Common_Functions;
import java.net.MalformedURLException;



public class TC02SendText extends Common_Functions{
    Logger log = Logger.getLogger(TC02SendText.class.getName());
    TextFields textFields = null;
    IOSDriver driver = null;

    @BeforeClass
    public void launchBrowser() throws MalformedURLException {
        driver = setUp();
        textFields = new TextFields(driver);
        BasicConfigurator.configure();
        log.info("App launched successfully");
    }
    @Test
    public void sendTextsToDefault() {
        click(textFields.getClickTextFields());
        sendKeys(textFields.getDefaultTextField(),"Automation");
        log.info("Successfully passed the data");

    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
        log.info("exited from the app");
    }

}
