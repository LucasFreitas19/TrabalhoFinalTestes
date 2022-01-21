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

        waits.loadElement(loginPage.GetUsename());
        loginPage.GetUsename().sendKeys(fakeLogin.getUsername());
        waits.loadElement(loginPage.GetPassword());
        loginPage.GetPassword().sendKeys(fakeLogin.getPassword());
        validarLogin();

    }

    public void SignIn(){


            waits.loadElement(loginPage.GetLoginButton());
            loginPage.GetLoginButton().click();

        }

    private void validarLogin() {
        try {
                Assertions.assertTrue(loginPage.GetLoginButton().isDisplayed());
                Report.extentTest.log(Status.PASS, "LOGIN COM SUCESSO", Screenshot.capture(browser));
            }catch (Exception e){

                Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL LOGAR" + e.getMessage(), Screenshot.capture(browser));
            }

        }
    }








