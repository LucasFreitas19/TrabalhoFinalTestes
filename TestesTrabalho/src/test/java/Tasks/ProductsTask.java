package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakeLogin;
import Pages.Login;
import Pages.ProductsPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
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

    public void AddBackpackToShopping(){

        waits.loadElement(productsPage.GetSauceBackpackButton());
        productsPage.GetSauceBackpackButton().click();
        validarAddBackPack();

    }

    private void validarAddBackPack() {
        try {
            Assertions.assertTrue(productsPage.GetSauceBackpackButton().isDisplayed());
            Report.extentTest.log(Status.PASS, "ADICIONADO COM SUCESSO", Screenshot.capture(browser));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ADICIONAR" + e.getMessage(), Screenshot.capture(browser));
        }
    }

    public void AddSauceLabsOnesieToShopping(){

        waits.loadElement(productsPage.GetSauceLabsOnesieButton());
        productsPage.GetSauceLabsOnesieButton().click();
        validarAddSauceLabs();

    }

    private void validarAddSauceLabs() {
        try {
            Assertions.assertTrue(productsPage.GetSauceLabsOnesieButton().isDisplayed());
            Report.extentTest.log(Status.PASS, "ADICIONADO COM SUCESSO", Screenshot.capture(browser));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ADICIONAR" + e.getMessage(), Screenshot.capture(browser));
        }
    }

    public void VisualizeToShoppingCart(){

        waits.loadElement(productsPage.GetShopButton());
        productsPage.GetShopButton().click();
        validarGoToShopping();

    }

    private void validarGoToShopping() {
        try {
            Assertions.assertTrue(productsPage.GetShopButton().isDisplayed());
            Report.extentTest.log(Status.PASS, "DIRECIONADO  COM SUCESSO", Screenshot.capture(browser));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO DIRECIONADO " + e.getMessage(), Screenshot.capture(browser));
        }
    }

    public void GoToSauceLabsDetails(){

        waits.loadElement(productsPage.GetSauceLabsOnesie());
        productsPage.GetSauceLabsOnesie().click();
        validarGoToSauceDetails();
    }

    private void validarGoToSauceDetails() {
        try {
            Assertions.assertTrue(productsPage.GetSauceLabsOnesie().isDisplayed());
            Report.extentTest.log(Status.PASS, "DIRECIONADO  COM SUCESSO", Screenshot.capture(browser));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO DIRECIONADO " + e.getMessage(), Screenshot.capture(browser));
        }
    }


}
