package Testcases;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void ShouldeBeAbleToLogin(){
        LoginPage loginPage=new LoginPage(driver);
      Boolean welcomeMsg =  loginPage
              .load()
              .ValidLogin("an@m.com","Aya12345")
              .CheckWelcomeTxt();
        Assert.assertTrue(welcomeMsg);
    }
}
