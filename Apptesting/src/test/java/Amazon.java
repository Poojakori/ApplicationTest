import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Amazon {
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver<WebElement> driverMob;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY224GGM68");
        cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        cap.setCapability("appActivity", "com.amazon.mShop.home.web.MShopWebGatewayActivity");
        driverMob = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

    }
}
