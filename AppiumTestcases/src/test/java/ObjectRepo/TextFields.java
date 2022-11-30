package ObjectRepo;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class TextFields {
    public TextFields(IOSDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }
    @iOSXCUITFindBy(accessibility = "Text Fields")
    private IOSElement clickTextFields;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
    private IOSElement defaultTextField;

    public IOSElement getClickTextFields() {
        return clickTextFields;
    }
    public IOSElement getDefaultTextField() {
        return defaultTextField;
    }
}
