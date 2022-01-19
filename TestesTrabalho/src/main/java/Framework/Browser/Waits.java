package Framework.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    private WebDriver browser;

    public Waits (WebDriver browser){
        this.browser=browser;
    }

    public WebElement Element(By by) {

        WebDriverWait wait = new WebDriverWait(browser, 60);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement loadElement(WebElement element){

        try{

            return new WebDriverWait(browser, 60).until(ExpectedConditions.visibilityOf(element));

        }catch (WebDriverException e){

            return element;
        }


    }
}
