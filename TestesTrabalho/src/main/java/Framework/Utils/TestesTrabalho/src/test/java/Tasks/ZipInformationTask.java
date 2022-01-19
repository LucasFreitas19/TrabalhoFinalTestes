package Tasks;

import Framework.Browser.Waits;
import Framework.Utils.FakeZipInformation;
import Pages.ProductsPage;
import Pages.ZipInforrmationPage;
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
    }
}
