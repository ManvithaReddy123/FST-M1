import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2_Appium {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net");
    }
    @Test
    public void chromeTest() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
                "//android.view.View[@text='Training Support']")));
        String pageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='Training Support']"
        )).getText();
        System.out.println("Heading: " + pageHeading);
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(
                "//android.view.View[@text='About Us']")));
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='About Us']"
        )).getText();
        System.out.println(aboutPageHeading);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}