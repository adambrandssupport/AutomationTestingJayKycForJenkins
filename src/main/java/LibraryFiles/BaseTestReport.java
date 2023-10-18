package LibraryFiles;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTestReport 
{
	ExtentSparkReporter htmlReporter;	 
    ExtentReports extent;
    ExtentTest test;
    @BeforeSuite
 public void startExtentReport() 
 {
        // initialize the HtmlReporter
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"/test-output/testReport.html");

        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        //configuration items to change the look and feel
        //add content, manage tests etc

        htmlReporter.config().setDocumentTitle("Simple Automation Report");
        htmlReporter.config().setReportName("Test Report");
     //   htmlReporter.config().setChartVisibilityOnOpen(true);
     //   htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
       
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }	
 @AfterMethod		
 public void getResult(ITestResult result) {
     if(result.getStatus() == ITestResult.FAILURE) {
     	
         test.log(Status.FAIL,result.getThrowable());
         test.log(Status.WARNING, result.getTestName());
         test.log(Status.INFO, "TEST FAILED");
     }
     else if(result.getStatus() == ITestResult.SUCCESS) {
         test.log(Status.PASS, result.getTestName());
         test.log(Status.INFO, "TEST PASSED");
         test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
         test.addScreenCaptureFromPath("screenshot.png");
     }
     else {
         test.log(Status.SKIP, result.getTestName());
     }
 }
 @AfterSuite
 public void logOut() throws IOException
 {
   extent.flush();
   //  driver.close();
 }
}
