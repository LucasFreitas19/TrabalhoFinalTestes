package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    private WebDriver browser;

    public Login(WebDriver browser){
        this.browser = browser;
    }

    public WebElement GetUsename(){
        return this.browser.findElement(By.id("user-name"));
    }

    public WebElement GetPassword(){
        return this.browser.findElement(By.id("password"));
    }

    public WebElement GetLoginButton(){
        return this.browser.findElement(By.id("login-button"));
    }
}
