import base.BaseTest;
import driver.AppDriver;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test() {
        AppDriver.getCurrentDriver().get("https://www.google.com/");
    }
}
