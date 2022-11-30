package ObjectRepo;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class Homepage {
    public Homepage(IOSDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Date Picker']")
    private IOSElement date_Picker;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Date and Time Picker']/XCUIElementTypeButton[@index='0']")
    private IOSElement date;
    @iOSXCUITFindBy(accessibility = "Next Month")
    private IOSElement moveToNextMonth;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Date and Time Picker']/XCUIElementTypeButton[@index='1']")
    private IOSElement nextTime;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='UIKitCatalog']/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]")
    private IOSElement time;
    @iOSXCUITFindBy(accessibility = "7")//XCUIElementTypeStaticText[@name="6"]
    private IOSElement date6;
    @iOSXCUITFindBy(accessibility = "PopoverDismissRegion")
    private IOSElement freeSpace;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]\n")
    private IOSElement hh;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeDatePicker/XCUIElementTypePicker/XCUIElementTypePickerWheel[2]\n")
    private IOSElement mm;


    @iOSXCUITFindBy(accessibility = "1")
    private IOSElement KeyOne;

    @iOSXCUITFindBy(accessibility = "4")
    private IOSElement KeyFour;

    @iOSXCUITFindBy(accessibility = "6")
    private IOSElement keySix;

    public IOSElement getMoveToNextMonth() {
        return moveToNextMonth;
    }
    public IOSElement getDate() {
        return date;
    }
    public IOSElement getDate_Picker() {
        return date_Picker;
    }
    public IOSElement getTime() {
        return time;
    }
    public IOSElement getDate6() {
        return date6;
    }
    public IOSElement getFreeSpace() {
        return freeSpace;
    }
    public IOSElement getNextTime() {
        return nextTime;
    }
    public IOSElement getHh() {
        return hh;
    }
    public IOSElement getMm() {
        return mm;
    }
    public IOSElement getKeyOne() {
        return KeyOne;
    }

    public IOSElement getKeyFour() {
        return KeyFour;
    }

    public IOSElement getKeySix() {
        return keySix;
    }
}



