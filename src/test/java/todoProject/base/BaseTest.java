package todoProject.base;
import todoProject.factory.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
