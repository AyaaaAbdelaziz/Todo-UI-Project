package todoProject.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserModel {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String userID;
    @JsonProperty("access_token")
    private String accessToken;
    private Cookies restassuredCookie;


    public UserModel() {
    }

    public UserModel(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @JsonProperty("access_token")

    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Cookies getRestassuredCookie() {
        return restassuredCookie;
    }

    public void setRestassuredCookie(Cookies restassuredCookie) {
        this.restassuredCookie = restassuredCookie;
    }
}

