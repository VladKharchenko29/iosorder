package driver;

import base.AppData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.SkipException;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {

    static AppiumDriver driver;

    private static void ios_launchApp() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 15")
                .setPlatformVersion("17.0")
//                .withBrowserName("safari");
                .setBundleId("com.apple.mobilesafari");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
        AppDriver.setDriver(driver);
        System.out.println("IOSDriver is set");
    }

    public static void launchApp() throws MalformedURLException {
        System.out.println("entering into launchapp");
            ios_launchApp();

    }

}
