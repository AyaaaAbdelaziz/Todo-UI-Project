package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage extends BasePage{
    public NewTodoPage(WebDriver driver) {
        super(driver);
    }
    By SubmitTodo=By.cssSelector("[data-testid=\"submit-newTask\"]");
    By TodoItem =By.cssSelector("[data-testid=\"new-todo\"]");
    By TodoText=By.cssSelector("[data-testid=\"todo-text\"]");

    By deleteBtn=By.cssSelector("[data-testid=\"delete\"]");
    By deleteMsg=By.cssSelector("[data-testid=\"no-todos\"]");

    public NewTodoPage AddTodo(String item){
        driver.findElement(TodoItem).sendKeys(item);
        driver.findElement(SubmitTodo).click();
        return this;
    }
public String GetTodoText (){
      return   driver.findElement(TodoText).getText();
}
    public NewTodoPage deleteTodoItem(){
        driver.findElement(deleteBtn).click();
        return this;
    }
    public Boolean GetDeletedTxt(){

        return   driver.findElement(deleteMsg).isDisplayed();
    }
}
