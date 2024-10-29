package todoProject.Utils;

import com.github.javafaker.Faker;
import todoProject.Models.UserModel;

public class UserUtils {
    public static UserModel registerData(){
        Faker faker = new Faker();
        String email=faker.internet().emailAddress();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();
        String password="12345678";
        return new UserModel(email,password,firstName,lastName);

    }

}
