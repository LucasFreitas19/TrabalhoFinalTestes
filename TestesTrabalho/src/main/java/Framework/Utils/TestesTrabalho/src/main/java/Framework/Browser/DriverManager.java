package Framework.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {


    private static WebDriver driver;

    private static WebDriver getManagerDriver(BrowserTips browser){

        switch (browser) {

            case CHROME:

                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;

            case HEADLESS:

                WebDriverManager.chromedriver().setup();
                ChromeOptions headless = new ChromeOptions();
                headless.addArguments("--headless");
                headless.addArguments("--window-size(1024,768)");
                driver = new ChromeDriver(headless);
                break;

            default:
                break;

        }

        return driver;

    }

    public static WebDriver getBrowser(BrowserTips browser){

        if (driver==null){

            driver = getManagerDriver(browser);
        }

        return driver;

    }

    public static void quitDriver(){

        if (driver != null) {

            driver.quit();
            driver = null;
        }

    }



}

