package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchasePageLogout {

    private WebDriver browser;

    public PurchasePageLogout(WebDriver browser){
        this.browser = browser;
    }

    public WebElement GetMenuButton(){return this.browser.findElement(By.id("bm-menu-wrap"));}

    public WebElement GetLogOut(){return this.browser.findElement(By.id("logout_sidebar_link"));}
}
