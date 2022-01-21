package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.CheckoutPage;
import Pages.ProductsPage;
import Pages.PurchasePageLogout;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LogoutTask {


    private WebDriver browser;
    private PurchasePageLogout purchasePageLogout;
    private Waits waits;




    public LogoutTask(WebDriver browser){

        this.browser = browser;
        purchasePageLogout = new PurchasePageLogout(this.browser);
        waits = new Waits(this.browser);

    }

    public void Logout(){

        waits.loadElement(purchasePageLogout.GetMenuButton());
        purchasePageLogout.GetMenuButton().click();
        MenuButtonValidation();
        waits.loadElement(purchasePageLogout.GetLogOut());
        purchasePageLogout.GetLogOut().click();
        LogOutValidation();
    }

    private void LogOutValidation() {

        try {
            Assertions.assertTrue(purchasePageLogout.GetLogOut().isDisplayed());
            Report.extentTest.log(Status.PASS, "LOGOUT COM SUCESSO", Screenshot.capture(browser));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL EXECUTAR O LOGOUT" + e.getMessage(), Screenshot.capture(browser));
        }
    }
        private void MenuButtonValidation(){

            try {
                Assertions.assertTrue(purchasePageLogout.GetMenuButton().isDisplayed());
                Report.extentTest.log(Status.PASS, "MENU ACESSADO COM SUCESSO", Screenshot.capture(browser));
            }catch (Exception e){

                Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR O MENU" + e.getMessage(), Screenshot.capture(browser));
            }

    }
}
