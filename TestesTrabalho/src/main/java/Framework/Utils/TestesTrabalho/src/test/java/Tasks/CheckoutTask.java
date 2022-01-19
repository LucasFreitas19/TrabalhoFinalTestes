package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Pages.CheckoutPage;
import Pages.ProductsPage;
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

    }
}
