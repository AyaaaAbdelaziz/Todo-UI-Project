package todoProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatNewAccount extends BasePage {

    public CreatNewAccount(WebDriver driver) {
        super(driver);
    }
    By FirstName= By.cssSelector("[data-testid=\"first-name\"]");
    By LastName= By.cssSelector("[data-testid=\"last-name\"]");
    By NewEmail=By.cssSelector("[data-testid=\"email\"]");
    By NewPassword=By.cssSelector("[data-testid=\"password\"]");
    By ConfirmPassword=By.cssSelector("[data-testid=\"confirm-password\"]");
    By SubmitBtn=By.cssSelector("[data-testid=\"submit\"]");

    public void createNewAccount(String Fname ,String Lname,String email,String password){
        driver.findElement(FirstName).sendKeys(Fname);
        driver.findElement(LastName).sendKeys(Lname);
        driver.findElement(NewEmail).sendKeys(email);
        driver.findElement(NewPassword).sendKeys(password);
        driver.findElement(ConfirmPassword).sendKeys(password);
        driver.findElement(SubmitBtn).click();

    }
}
