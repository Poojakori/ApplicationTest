import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class contacts {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<WebElement> driverMob;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY224GGM68");
        cap.setCapability("appPackage", "com.android.contacts");
        cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        driverMob = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        String sList = "android:id/list";
        String contContains = "Basu";
        MobileElement scroll= (MobileElement) driverMob.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()." +"resourceId(\"" + sList +"\")).scrollIntoView(new UiSelector().textContains(\""+ contContains +"\"))");
        //scroll.click();

        //slide
        TouchAction swipe =new TouchAction(driverMob);
        swipe.press(PointOption.point(185,984))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(1024,1024))
                .release().perform();

    }
}
