package TodoTestcases;

import Pages.CreatNewAccount;
import Pages.LoginPage;
import Pages.NewTodoPage;
import Pages.TodoPage;
import base.BaseTest;
import factory.driverfactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddTodoTest extends BaseTest {

    @Test
    public void AddTodo(){
        LoginPage loginPageObj =new LoginPage(driver);
        CreatNewAccount creatNewAccount=new CreatNewAccount(driver);
        TodoPage todoPageObj = loginPageObj.ValidLogin("an@m.com","Aya12345");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       if( loginPageObj.CheckAccountCreated() == true){
           creatNewAccount.createNewAccount("aaaa","mmmm","an@m.com","Aya12345");
       }
           Assert.assertTrue(todoPageObj.CheckWelcomeTxt());
        NewTodoPage newTodoPageObj= todoPageObj.ClickAddTodo();
       newTodoPageObj.AddTodo("new item");
       todoPageObj.deleteTodoItem();
       todoPageObj.GetDeletedTxt();



    }
}
