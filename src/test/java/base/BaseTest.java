package base;

import factory.driverfactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void StartDriver(){
        driver = new driverfactory().IntializeDriver();

    }
    @AfterMethod
   public void TearDown(){
   //     driver.quit();
    }
}
