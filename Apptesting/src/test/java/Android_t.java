import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_t {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<WebElement> driverMob;
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY224GGM68");
        cap.setCapability("appPackage","com.google.android.calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        driverMob = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);

        driverMob.findElement(By.id("digit_5")).click();
        driverMob.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_7')]")).click();
        driverMob.findElement(By.id("digit_4")).click();
        driverMob.findElement(By.id("op_mul")).click();
        driverMob.findElement(By.id("digit_5")).click();
        driverMob.findElement(By.id("eq")).click();
        System.out.println(driverMob.findElement(By.id("result_final")).getText());



        //driver.findelement(By.xpath("//android.widget.Button[@text='7']"));
       // List<WebElement> calButtons = driver.findelements(By.xpath("//android.widget.Button"));
        //calButtons.get(1).click();

        /*driver.findelement(By.name("5"));
        driver.findelement(By.className("//android.widget.ImageButton"));
        driver.findelement(By.id("com.android.calculator2:id/digit_5"));
        driver.findelement(By.id("digit_5"));
        driver.findelement(By.xpath("//android.widget.ImageButton"));
        driver.findelement(By.xpath("//android.widget.Button[@content-desc='Delete']"));
        driver.findelement(By.xpath("//android.widget.Button[@text ='5' and @index='4']"));
        driver.findelement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_7') and @text ='7']"));
        driver.findelement(By.xpath("//android.widget.Button[@text='7']"));
        driver.findelement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_7')]"));*/
    }
}
