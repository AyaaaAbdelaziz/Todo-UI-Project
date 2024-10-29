package todoProject.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class driverfactory {
    private WebDriver driver;
String browser = System.getProperty("browser","FIREFOX");

    public WebDriver IntializeDriver() {
        switch(browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case"FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw  new RuntimeException("The browser is not supported");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }
}