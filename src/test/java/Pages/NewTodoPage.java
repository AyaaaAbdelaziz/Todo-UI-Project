package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage extends BasePage{
    public NewTodoPage(WebDriver driver) {
        super(driver);
    }
    By SubmitTodo=By.cssSelector("[data-testid=\"submit-newTask\"]");
    By TodoItem =By.cssSelector("[data-testid=\"new-todo\"]");



    public void AddTodo(String item){
        driver.findElement(TodoItem).sendKeys(item);
        driver.findElement(SubmitTodo).click();
    }
}
