package todoProject.Testcases;

import io.restassured.http.Cookies;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import todoProject.APIs.UserApis;
import todoProject.Models.UserModel;
import todoProject.Pages.LoginPage;
import todoProject.Utils.UserUtils;
import todoProject.base.BaseTest;

import java.util.List;

public class registerDummy extends BaseTest {
    @Test
    public void canRegister(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.load();
        UserModel user= UserUtils.registerData();
      UserApis userApis=new UserApis();
      userApis.Register(user);
      Cookies resassuredCookies= userApis.getRestassuredCookies();
for(io.restassured.http.Cookie cookie :resassuredCookies){
    Cookie SelniumCookie=new Cookie(cookie.getName(),cookie.getValue());
    driver.manage().addCookie(SelniumCookie);
}
        loginPage.load();

   //     System.out.println( userApis.getRestassuredCookies() );
    }

}
