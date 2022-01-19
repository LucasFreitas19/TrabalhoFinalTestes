package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver browser;

    public CheckoutPage(WebDriver browser){
        this.browser = browser;
    }

    public WebElement GetCheckoutButton(){return this.browser.findElement(By.id("checkout"));}

    public WebElement GetIdProductBackPack(){
        return this.browser.findElement(By.id("item_4_title_link"));
    }
}
