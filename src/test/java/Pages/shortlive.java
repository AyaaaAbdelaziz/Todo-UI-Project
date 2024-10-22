package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shortlive extends BasePage{
    By task1 = By.id("progress0");
    By task2 = By.id("progress1");
    By task3 = By.id("progress2");

    public shortlive(WebDriver driver) {
        super(driver);
    }

    public void checktasks (){
        
    }

}
