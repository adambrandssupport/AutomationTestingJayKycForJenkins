package KycPageTC;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KYCPage.AClKYCformPage;
import KYCPage.AClLoginPage;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class HP1TC extends BaseClass
{
	
	AClLoginPage lp;
	 AClKYCformPage kp;
	
@BeforeClass
public void openBrowser() throws Throwable 
{
	initialiseBrowser();
	
	lp= new AClLoginPage (driver);
	kp=new AClKYCformPage(driver);
	Thread.sleep(3000);
	
}
@BeforeMethod
public void SignIn() throws IOException, InterruptedException
{

	
	lp.inpLoginPageEmail(UtilityClass.getTD(1, 1));
	lp.inpLoginPagePwd(UtilityClass.getTD(1, 2));
	lp.clickLoginPageLoginBtn();
	lp.drawborderLoginPageToastMsg(driver);
}
@Test
public void KYC() throws IOException, InterruptedException
{
	lp.drawborderLoginPageToastMsg(driver);
	//UtilityClass.scrollDownToElement(driver, certOfIncorp);	
}
@AfterMethod
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
