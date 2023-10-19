package LoginTC;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForLoginPage;
import LibraryFiles.UtilityClass;
import LoginModulePOM.AClLoginPage;
import net.bytebuddy.utility.RandomString;

public class LoginWithTrueFalseCredential extends BaseClass
{
//	AClHomePage hp;
	AClLoginPage lp;
	SoftAssert soft;
@BeforeMethod
public void openBrowser() throws IOException, InterruptedException
{     Thread.sleep(5000);
     initialiseBrowser();
	lp=new AClLoginPage(driver);
	Thread.sleep(5000);
}
@DataProvider(name = "dataContainerTFLogin" , parallel = true)
public Object[][] dataSupply() throws Throwable
{
	Thread.sleep(5000);
	Object[][] data= {{"kiran","tester"}, {"Dhaval","UIUX"}};
	return data;
	
}

@Test(dataProvider = "dataContainerTFLogin", threadPoolSize = 2)
public void signIn(String EID, String pwd) throws IOException, InterruptedException
{
	Thread.sleep(5000);

	lp.inpAClLoginPageEmail(EID);
	lp.inpAClLoginPagePassword(pwd);
	lp.clickAClLoginPageLoginBtn();
	Thread.sleep(5000);
}
@AfterClass
public void CaptureFailedTCSS(ITestResult s1) throws IOException
{
	String rs= RandomString.make(2);
if(s1.getStatus()==ITestResult.FAILURE)
{
	UtilityClass.captureSS(driver, rs);
}
}

@AfterClass
public void logOut() throws IOException
{
 //  driver.close();
}
}