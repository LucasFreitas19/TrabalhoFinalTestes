package Framework.Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FakeZipInformation {

    private Faker faker;
    private String firstName;
    private String lastName;
    private Long zipCode;

    public FakeZipInformation(WebDriver driver){

        faker = new Faker(new Locale("pt-BR"));

    }

    public String getFakeFirtName() {

        firstName = faker.name().firstName();
        return firstName;
    }

    public String getFakeLastName() {

        lastName = faker.name().lastName();
        return lastName;
    }

    public Long getFakeZipCode() {

        zipCode = faker.number().randomNumber();
        return zipCode;
    }
}
