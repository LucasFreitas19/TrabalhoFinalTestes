package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakeLogin;
import Pages.Login;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;



public class LoginTask {


    private WebDriver browser;
    private Login loginPage;
    private Waits waits;
    private FakeLogin fakeLogin;


    public LoginTask(WebDriver browser){

        this.browser = browser;
        loginPage = new Login(this.browser);
        waits = new Waits(this.browser);
        fakeLogin = new FakeLogin();
    }

    public void RealizeLogin() {

        loginPage.GetUsename().sendKeys(fakeLogin.getUsername());
        waits.loadElement(loginPage.GetPassword());
        loginPage.GetPassword().sendKeys(fakeLogin.getPassword());

    }

    public void SignIn(){


            waits.loadElement(loginPage.GetLoginButton());
            loginPage.GetLoginButton().click();

        }





    }



