package Tasks;

import Framework.Browser.Waits;
import Framework.Utils.FakeLogin;
import Pages.Login;
import Pages.ProductsPage;
import org.openqa.selenium.WebDriver;

public class ProductsTask {

    private WebDriver browser;
    private ProductsPage productsPage;
    private Waits waits;



    public ProductsTask(WebDriver browser){

        this.browser = browser;
        productsPage = new ProductsPage(this.browser);
        waits = new Waits(this.browser);

    }

    public void GoIntoBackpackDetails(){

        waits.loadElement(productsPage.GetSauceBackpack());
        productsPage.GetSauceBackpack().click();

    }

    public void GoIntoSauceLabsOnesieDetails(){

        waits.loadElement(productsPage.GetSauceLabsOnesie());
        productsPage.GetSauceLabsOnesie().click();

    }

    public void AddBackpackToShopping(){

        waits.loadElement(productsPage.GetSauceBackpackButton());
        productsPage.GetSauceBackpackButton().click();

    }

    public void AddSauceLabsOnesieToShopping(){

        waits.loadElement(productsPage.GetSauceLabsOnesieButton());
        productsPage.GetSauceLabsOnesieButton().click();

    }

    public void VisualizeToShoppingCart(){

        waits.loadElement(productsPage.GetShopButton());
        productsPage.GetShopButton().click();

    }

    public void GoToSauceLabsDetails(){

        waits.loadElement(productsPage.GetSauceLabsOnesie());
        productsPage.GetSauceLabsOnesie().click();
    }

    public void AddToCartSauceLabs(){

        waits.loadElement(productsPage.GetSauceLabsOnesieButton());
        productsPage.GetSauceLabsOnesieButton().click();
    }

}
