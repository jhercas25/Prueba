package TestScenarios;

import drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void openBrowser(){
        driver.get("https://www.weh.com/products/quick-connectors/automation");
    }

    @AfterClass
    public void tearDown(){
        Driver.quit();
    }
}
