//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.ios.options.XCUITestOptions;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import org.testng.annotations.BeforeClass;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class OLD {
//
//    public IOSDriver driver;
//    public AppiumDriverLocalService service;
//
//    @BeforeClass
//    public void ConfigureAppium() throws MalformedURLException
//    {
//
//        service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();
//
//        XCUITestOptions options = new XCUITestOptions();
//        options.setDeviceName("iPhone 15")
//                .setPlatformVersion("17")
//                .withBrowserName("safari");
//
//
////        .setWdaLaunchTimeout(Duration.ofSeconds(20));
//
//        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
//
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
////    @AfterClass
////    public void tearDown()
////    {
////        driver.quit();
////        service.stop();
////    }
//}
