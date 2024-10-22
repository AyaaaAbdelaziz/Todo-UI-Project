package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TodoPage extends BasePage{

    public TodoPage(WebDriver driver) {
        super(driver);
    }
    By AddTodoBtn =By.cssSelector("[data-testid=\"add\"]");
    By welcomeMsgTxt=By.cssSelector("[data-testid=\"welcome\"]");
    By deleteBtn=By.cssSelector("[data-testid=\"delete\"]");
    By deleteMsg=By.cssSelector("[data-testid=\"no-todos\"]");

    public Boolean CheckWelcomeTxt(){
      return driver.findElement(welcomeMsgTxt).isDisplayed();


    }
    public NewTodoPage ClickAddTodo(){
        driver.findElement(AddTodoBtn).click();
        return new NewTodoPage(driver);
    }
    public void deleteTodoItem(){
        driver.findElement(deleteBtn).click();
    }
    public void GetDeletedTxt(){
         driver.findElement(deleteMsg).isDisplayed();
    }
}
