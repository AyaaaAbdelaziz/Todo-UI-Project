package todoProject.APIs;



import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import todoProject.Models.UserModel;
import todoProject.data.route;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserApis {
private Cookies restassuredCookies;

    public Cookies getRestassuredCookies() {
        return restassuredCookies;
    }

    public void setRestassuredCookies(Cookies restassuredCookies) {
        this.restassuredCookies = restassuredCookies;
    }

    public  void Register(UserModel userModel){
        Response res= given().baseUri("https://todo.qacart.com/api/")
                .contentType(ContentType.JSON)
                .body(userModel)
                .log().all()
                .when().post(route.Register_Route)
                .then().log().all()
                .extract().response();
        setRestassuredCookies(res.detailedCookies());
    }
}
