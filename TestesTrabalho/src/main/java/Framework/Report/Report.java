package Framework.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Report {

    public static WebDriver browser;
    public static String PATH_REPORT = System.getProperty("user.dir") + File.separator + "Report" + File.separator + "Report_" + DateTime.getDateTimeFormat();
    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;


    public static void setExtentReports(){

        CreateFolder.createFolderReport(PATH_REPORT);

        sparkReporter = new ExtentSparkReporter(PATH_REPORT + File.separator + "Execucao_" +
                DateTime.getDateTimeFormat() + ".html");

        sparkReporter.config().setDocumentTitle("Relatório de Execução de Testes Automatizados");
        sparkReporter.config().setReportName("Relatório de Execução Compra");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setEncoding("UTF-8");
        sparkReporter.config().setTimeStampFormat(" EEE , MMMM dd , yyyy , hh:mm a '('zzz')'");

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);

    }

    public static void startReport(String testName){

        extentTest = extentReports.createTest(testName);
    }



    public static void endReport(){

        extentReports.flush();

        if (browser!=null){
            browser.quit();
            browser = null;
        }
    }
}
