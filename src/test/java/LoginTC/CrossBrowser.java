package LoginTC;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import LibraryFiles.UtilityClass;

public class CrossBrowser 
{
	public WebDriver driver;   //execute from testng.xml file
	ExtentSparkReporter htmlReporter;	 
    ExtentReports extent;
    ExtentTest test;
    
    @BeforeMethod
    public void startExtentReport() throws InterruptedException 
    {
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.config().setDocumentTitle("Simple Automation Report");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }
	@Parameters("browserName")
	@BeforeMethod
	public void InitialiseBrowser(String browserName) throws IOException, InterruptedException
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		  driver = new ChromeDriver();	
	    }
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
	    }

		driver.manage().window().maximize();
		driver.get("http://localhost:5173/login");
		//driver.get("https://frontendui-9ba21.web.app");
		//driver.get(UtilityClass.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@DataProvider(name = "dataContainerTFLogin1")
	public Object[][] dataSupply()
	{
		Object[][] data= {{"kiran","tester"},{"Dhaval","UIUX"}};
		return data;
	}
	@Test(dataProvider = "dataContainerTFLogin1")
	public void signIn( String EID, String pwd) throws IOException, InterruptedException
	{
		test = extent.createTest("Crossbrowser Testing", "The test case 1 has passed").assignAuthor("Kiran").pass("details");
	    test.info("start of test");
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(EID);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
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
	        test.addScreenCaptureFromPath("C:\\Users\\PC\\eclipse-workspace\\AdamJayKyc\\Upload Document\\1certOfInc43.png");
	    }
	    else 
	    {
	        test.log(Status.SKIP, result.getTestName());
	    }
	}

	@AfterMethod(enabled =true)
	public void afterInvocation( ITestResult result) 
	{
	    if (result.getThrowable() != null)
	    {
	        if (result.getThrowable() instanceof NoSuchWindowException) {
	            // Handle the NoSuchWindowException here, e.g., log the error or perform cleanup.
	            // You can also decide to retry or take other actions depending on your requirements.
	        }
	    }
	}
	@AfterMethod(enabled =true)
	public void CaptureFailedTCSS(ITestResult s1) throws IOException, InterruptedException
	{
		 
	if(s1.getStatus()==ITestResult.FAILURE)
	{
		UtilityClass.captureSS(driver, "");
	}
	    Thread.sleep(2000);  
	    
	}

	@AfterClass
	public void logOut() throws IOException
	{
		 extent.flush();
	 //  driver.close();
	}
}
