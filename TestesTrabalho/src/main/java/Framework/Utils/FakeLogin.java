package Framework.Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FakeLogin {


    private String username;
    private String password;


    public String getUsername(){

        username = "standard_user";
        return username;
    }

    public String getPassword(){

        password = "secret_sauce";
        return password;
    }
}
