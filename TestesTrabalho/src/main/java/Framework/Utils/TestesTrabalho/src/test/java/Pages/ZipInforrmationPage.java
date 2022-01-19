package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZipInforrmationPage {

    private WebDriver browser;

    public ZipInforrmationPage(WebDriver browser){
        this.browser = browser;
    }

    public WebElement GetNameForm(){return this.browser.findElement(By.id("first-name"));}

    public WebElement GetLastNameForm(){
        return this.browser.findElement(By.id("last-name"));
    }

    public WebElement GetZipCodeForm(){
        return this.browser.findElement(By.id("postal-code"));
    }

    public WebElement GetButtonContinue(){return this.browser.findElement(By.id("continue")); }

}
