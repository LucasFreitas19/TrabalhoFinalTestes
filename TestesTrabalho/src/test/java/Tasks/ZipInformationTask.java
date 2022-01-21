package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakeZipInformation;
import Pages.ProductsPage;
import Pages.ZipInforrmationPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ZipInformationTask {

    private WebDriver browser;
    private ZipInforrmationPage zipInforrmationPage;
    private Waits waits;
    private FakeZipInformation fakeZipInformation;



    public ZipInformationTask(WebDriver browser){

        this.browser = browser;
        zipInforrmationPage = new ZipInforrmationPage(this.browser);
        waits = new Waits(this.browser);
        fakeZipInformation = new FakeZipInformation(this.browser);

    }

    public void RealizeForm(){

        waits.loadElement(zipInforrmationPage.GetNameForm());
        zipInforrmationPage.GetNameForm().sendKeys(fakeZipInformation.getFakeFirtName());
        waits.loadElement(zipInforrmationPage.GetLastNameForm());
        zipInforrmationPage.GetLastNameForm().sendKeys(fakeZipInformation.getFakeLastName());
        waits.loadElement(zipInforrmationPage.GetZipCodeForm());
        zipInforrmationPage.GetZipCodeForm().sendKeys(fakeZipInformation.getFakeZipCode().toString());
    }

    public void ContinuePage(){

        waits.loadElement(zipInforrmationPage.GetButtonContinue());
        zipInforrmationPage.GetButtonContinue().click();
        validarZipForm();
    }

    private void validarZipForm() {
        try {
            Assertions.assertTrue(zipInforrmationPage.GetButtonContinue().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA CONTINUADA COM SUCESSO", Screenshot.capture(browser));
        }catch (Exception e){

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PROXIMA PAGINA" + e.getMessage(), Screenshot.capture(browser));
        }

    }
}
