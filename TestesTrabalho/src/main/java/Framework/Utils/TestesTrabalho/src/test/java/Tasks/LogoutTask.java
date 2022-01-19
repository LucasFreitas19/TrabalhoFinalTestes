package Tasks;

import Framework.Browser.Waits;
import Pages.CheckoutPage;
import Pages.ProductsPage;
import Pages.PurchasePageLogout;
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
        waits.loadElement(purchasePageLogout.GetLogOut());
        purchasePageLogout.GetLogOut().click();
    }
}
