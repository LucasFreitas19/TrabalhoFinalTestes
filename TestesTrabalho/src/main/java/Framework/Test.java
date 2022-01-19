package Framework;

import Framework.Browser.BrowserTips;
import Framework.Browser.DriverManager;
import Framework.Report.Report;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Test extends DriverManager {

    private static WebDriver browser;

    private String url = "https://www.saucedemo.com/";

    public WebDriver getBrowser(){

        return browser = getBrowser(BrowserTips.CHROME);

    }

    @BeforeEach
    public void setUp(){

        Report.setExtentReports();
        getBrowser().get(url);
    }

    @AfterEach
    public void tearDown(){

        Report.endReport();
        quitDriver();
    }
}
