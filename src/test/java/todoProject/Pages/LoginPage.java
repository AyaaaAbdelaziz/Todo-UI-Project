package todoProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By EmailTxt= By.cssSelector("[data-testid=\"email\"]");
    By passwordTxt= By.cssSelector("[data-testid=\"password\"]");
    By loginBtn= By.id("submit");
    By ErrorMsg=By.cssSelector("[data-testid=\"error-alert\"]");
    By CreateNewAccountLink=By.cssSelector("[data-testid=\"signup\"]");

public LoginPage load(){
    driver.get("https://qacart-todo.herokuapp.com/");

return this;
}

    public TodoPage ValidLogin(String email, String password){

    driver.findElement(EmailTxt).sendKeys(email);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(loginBtn).click();

return new TodoPage(driver);
 }


public Boolean CheckAccountCreated() {
    boolean error = false;
    //  error = driver.findElement(ErrorMsg).getText();

     try{   if (driver.findElement(ErrorMsg).isDisplayed()) {

            driver.findElement(CreateNewAccountLink).click();
            error= true;
        }
     }catch (Exception e){
         System.out.println(e);
        error= false;
    }
    return error;

}
}
