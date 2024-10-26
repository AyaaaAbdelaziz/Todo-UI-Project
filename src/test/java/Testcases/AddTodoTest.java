package Testcases;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTodoTest extends BaseTest {

    @Test
    public void AddTodo(){
        LoginPage loginPageObj =new LoginPage(driver);
    String AddedTodoText=    loginPageObj
                .load()
                .ValidLogin("an@m.com","Aya12345")
                .ClickAddTodo()
                .AddTodo("new item")
                .GetTodoText();
    Assert.assertEquals(AddedTodoText,"new item");


    }
    @Test
    public void ShouldBeDeleteTest(){
        LoginPage loginPage =new LoginPage(driver);
      Boolean IsDeleted=  loginPage
                .load()
                .ValidLogin("an@m.com","Aya12345")
              .ClickAddTodo()
              .AddTodo("new item")
                .deleteTodoItem()
                .GetDeletedTxt();
      Assert.assertTrue(IsDeleted);
    }
}
