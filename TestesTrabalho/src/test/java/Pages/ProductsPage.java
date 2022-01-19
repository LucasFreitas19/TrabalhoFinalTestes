package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {



    private WebDriver browser;

    public ProductsPage(WebDriver browser){
        this.browser = browser;
    }

    public WebElement GetSauceBackpack(){return this.browser.findElement(By.id("item_4_img_link"));}

    public WebElement GetSauceBackpackButton(){return this.browser.findElement(By.id("add-to-cart-sauce-labs-backpack"));}

    public WebElement GetSauceLabsOnesie(){
        return this.browser.findElement(By.id("item_2_img_link"));
    }

    public WebElement GetSauceLabsOnesieButton(){
        return this.browser.findElement(By.id("add-to-cart-sauce-labs-onesie"));}

    public WebElement GetShopButton(){
        return this.browser.findElement(By.className("shopping_cart_link"));
    }


}
