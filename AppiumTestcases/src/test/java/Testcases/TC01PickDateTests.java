package Testcases;

import ObjectRepo.Homepage;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Utilities.Common_Functions;
import java.net.MalformedURLException;


public class TC01PickDateTests extends Common_Functions {
    Logger log = Logger.getLogger(TC01PickDateTests.class.getName());
    Homepage homepage = null;
    IOSDriver driver = null;

    @BeforeClass
    public void launchBrowser() throws MalformedURLException {
        driver = setUp();
        homepage = new Homepage(driver);
        log.info("app launched successfully");
    }
    @Test(priority = 1)
    public void changeDate(){
        click(homepage.getDate_Picker());
        click(homepage.getDate());
        click(homepage.getMoveToNextMonth());
        Actions a = new Actions(driver);
        a.doubleClick(homepage.getDate6()).perform();
        click(homepage.getFreeSpace());
        log.info("date changed successfully");
    }
    @Test(priority = 2)
    public void changeTime() throws InterruptedException {

        click(homepage.getNextTime());
        click(homepage.getTime());
        click(homepage.getHh());
        Thread.sleep(2000);
        click(homepage.getKeyOne());
        click(homepage.getKeyOne());
        click(homepage.getMm());
        Thread.sleep(2000);
        click(homepage.getKeyFour());
        click(homepage.getKeySix());
        click(homepage.getFreeSpace());
        log.info("changed time successfully");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

