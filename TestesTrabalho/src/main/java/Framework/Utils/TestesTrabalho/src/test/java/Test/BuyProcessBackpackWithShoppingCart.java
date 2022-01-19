package Test;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class BuyProcessBackpackWithShoppingCart extends Framework.Test {

    private WebDriver browser = this.getBrowser();
    private LoginTask loginTask = new LoginTask(browser);
    private ProductsTask productsTask = new ProductsTask(browser);
    private CheckoutTask checkoutTask = new CheckoutTask(browser);
    private ZipInformationTask zipInformationTask = new ZipInformationTask(browser);
    private LogoutTask logoutTask = new LogoutTask(browser);

    @Test
    public void ProcessoDeCompra(){

        try {

            Report.startReport("Realizar Processo de compras");
            loginTask.RealizeLogin();
            loginTask.SignIn();
            productsTask.AddBackpackToShopping();
            productsTask.VisualizeToShoppingCart();
            checkoutTask.CheckoutGoNextPage();
            zipInformationTask.RealizeForm();
            zipInformationTask.ContinuePage();
            logoutTask.Logout();


        }catch (Exception e){

            Report.extentTest.log(Status.FAIL, e.getMessage() , Screenshot.base64(browser));
        }



    }
}
