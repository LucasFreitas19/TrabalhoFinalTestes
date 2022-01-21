package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.CheckoutPage;
import Pages.ProductsPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private WebDriver browser;
    private CheckoutPage checkoutPage;
    private Waits waits;
    private ProductsPage productsPage;



    public CheckoutTask(WebDriver browser){

        this.browser = browser;
        checkoutPage = new CheckoutPage(this.browser);
        waits = new Waits(this.browser);
        productsPage = new ProductsPage(this.browser);

    }



    public void CheckoutGoNextPage(){

        waits.loadElement(checkoutPage.GetCheckoutButton());
        checkoutPage.GetCheckoutButton().click();
        validarGoToShopping();

    }

    private void validarGoToShopping() {
        try {
            Assertions.assertTrue(checkoutPage.GetCheckoutButton().isDisplayed());
            Report.extentTest.log(Status.PASS, "CHECKOUT  COM SUCESSO", Screenshot.capture(browser));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO CHECKOUT " + e.getMessage(), Screenshot.capture(browser));
        }
    }
}
