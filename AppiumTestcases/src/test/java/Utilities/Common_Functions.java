package Utilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Common_Functions{
    IOSDriver driver = null;

    public IOSDriver setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/janardhan/Downloads/UIKitCatalog.app");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14 Pro Max");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.1");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.COMMAND_TIMEOUTS, 3600);
        desiredCapabilities.setCapability(IOSMobileCapabilityType.CONNECT_HARDWARE_KEYBOARD, true);
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
        return driver;
    }
    public void sendKeys(IOSElement element, String input) {
        element.sendKeys(input);
    }
    public void click(IOSElement element) {
        element.click();
    }

}