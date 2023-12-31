package base;

import driver.AppFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class BaseTest {
    @BeforeMethod
    public void launchApp() throws MalformedURLException {
        System.out.println("before method");
        AppFactory.launchApp();
        //base.AppiumServer.start();
    }

    @AfterMethod
    public void closeApp() throws MalformedURLException {
        //AppDriver.getCurrentDriver().quit();
        //base.AppiumServer.stop();
    }

    @BeforeSuite
    public void serverStart(){
        System.out.println("before suite");
        base.AppiumServer.start();
    }

    @AfterSuite
    public void serverStop(){
        base.AppiumServer.stop();
    }
}
