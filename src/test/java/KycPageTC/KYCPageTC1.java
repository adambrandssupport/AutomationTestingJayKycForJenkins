package KycPageTC;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.NoSuchWindowException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import KYCPage.AClKYCformPage;
import KYCPage.AClLoginPage;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForKYCForm;
import LibraryFiles.UtilityClass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.utility.RandomString;
	
public class KYCPageTC1 extends BaseClass
{	
	
	AClLoginPage lp;
    AClKYCformPage kp;
	SoftAssert soft;
	ExtentSparkReporter htmlReporter;	 
    ExtentReports extent;
    ExtentTest test;
    String rs;
@BeforeMethod
public void openBrowser() throws Throwable 
{

	initialiseBrowser();      //nullpointer Exception
	//driver.get("https://adam-energy-kyc-m3zi.vercel.app/");
	lp= new AClLoginPage(driver);
	kp=new AClKYCformPage(driver);
	soft=new SoftAssert();	
	rs= RandomString.make(2);

/*	hp.clickHomePageSignInButton();	
	lp.inpLoginPageEmail(UtilityClass.getPFData("EMailID"));
	lp.inpLoginPagePwd(UtilityClass.getPFData("Password"));
	lp.clickLoginPageLoginBtn();*/

}	
@BeforeTest
public void startExtentReport() throws InterruptedException {
	
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
    Thread.sleep(2000);
}	

@Test(dataProvider = "dataContainerKYCForm", dataProviderClass = DataSupplierForKYCForm.class, threadPoolSize = 2)
public void KYCFormFillDataprovider
(
		String Scenario, String iCoName, String ipCoName, String iRAdd,String infCountry, String iCont,String Email, String iWbsite, String iDomain, String iEmp,

		String struType, String sOStr, String natureType, String sOBusi, String CntryOfInc, String dd1,String mm1, String yyyy1, String sRegNo, String sTrdLisc, String dd2,String mm2, String yyyy2, String sVat, 
 
		String bName,String bankCountry, String bAdd, String bSwift, String bAccName,String curency, String bAccNo,String bIban, String bMangName,String bMangCountry, String bMangCont, String bCorBankName, String bCorBankSwift,

		String shrHldName1, String shrHldPrctg1, String shrCountry1, String shrHldName2, String shrHldPrctg2,String shrCountry2,
 
		String cPCName, String cPCDesign, String pcCountry, String cPCPhon, String cPCEmail,
 
		String cCFName, String cCFDesign, String ccfCountry, String cCFPhon, String cCFEmail,

		String cOpName, String cOpDesign, String opCountry, String cOpPhon, String cOpEmail,
 
		String cAccName, String cAccDesign, String acCountry, String cAccPhon, String cAccEmail,
 
		String cPrBusi, String cConPer,
		
		String tRFName1,String trfCountry1, String trfPhon1,String trEmail1, String tRFName2,String trfCountry2, String trfPhon2,String trEmail2,
		
		String upCoI, String upAoA, String upTLC, String upTRC, String upCP, String uURL,String upBR, String upPass,String upSign, String signName, String AdmnURL,String AdmnEmail, String AdmnPwd 
		
		) throws InterruptedException, IOException, AWTException
{
	
	//if (Scenario.equals("Positive"))
	test = extent.createTest("KYC Form Filling for Dataprovider", "The test case 1 has passed").assignAuthor("Kiran").pass("details");
	
//COMPANY INFO
	
	test.info("start of test");
	kp.inpAClKYCformPageIRegCompName(iCoName);
	Thread.sleep(100);	
	kp.inpAClKYCformPageIParCompName(ipCoName);
	Thread.sleep(100);
	kp.inpAClKYCformPageICompRegAddrs(iRAdd);
	Thread.sleep(500);
    kp.selectAClKYCformPageStCountry(infCountry);  
	Thread.sleep(500);
	kp.inpAClKYCformPageIRegCompConNo(iCont);
	Thread.sleep(100);
	kp.inpAClKYCformPageEmail(Email);
	Thread.sleep(100);
    kp.inpAClKYCformPageIRegCompWSite(iWbsite);
    Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompDomain(iDomain);
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompEmployee(iEmp);
	Thread.sleep(100);
	
	test.info("filled company details");
/*	if (Scenario.equals("Alpha")||Scenario.equals("AlphaNum"))
  {
		soft.assertFalse(kp.inpAClKYCformPageIRegCompNameEr());
		soft.assertFalse(kp.inpAClKYCformPageIParCompNameEr());	
		soft.assertFalse(kp.inpAClKYCformPageIRegCompNameEr());
		soft.assertFalse(kp.inpAClKYCformPageIParCompNameEr());	
		soft.assertAll();
	}
	else
	{
		soft.assertTrue(kp.inpAClKYCformPageIRegCompNameEr());
		soft.assertTrue(kp.inpAClKYCformPageIParCompNameEr());	
		soft.assertAll();
	}
	soft.assertFalse(result1);
	
	boolean result2 = kp.inpAClKYCformPageIParCompNameEr();
	soft.assertFalse(result2);
	
	boolean result3 = kp.inpAClKYCformPageICompRegAddrsEr();
	soft.assertFalse(result3);
	
	boolean result4 = kp.inpAClKYCformPageIRegCompConNoEr();
	soft.assertFalse(result4);*/
	
 //boolean result5 = kp.inpAClKYCformPageIRegCompWSiteEr();
//	soft.assertFalse(result5,"error msg not diaplayed");
		
/*	boolean result6 = kp.inpAClKYCformPageIRegCompDomainEr();
	soft.assertFalse(result6);
	
	boolean result7 = kp.inpAClKYCformPageIRegCompEmployeeEr();
	soft.assertFalse(result7);
	soft.assertAll();
	}*/
//COMPANY STRUCTURE	
	
	 kp.selectAClKYCformPageStBusineStructure(struType); 
	if(struType.equals("Others"))
	{
	  kp.inpAClKYCformPageStOtherStructure(sOStr); 
	}
	Thread.sleep(100);
	kp.selectAClKYCformPageStBusineNature(natureType); 
	if(natureType.equals("Others"))
	{
	  kp.inpAClKYCformPageStOtherBusiness(sOBusi); 
	}
	Thread.sleep(100);
	kp.selectAClKYCformPageCountryOfIncorp(CntryOfInc);
	
	Thread.sleep(100);
	kp.inpAClKYCformPageStDateOfIncorporation(dd1, mm1, yyyy1);
	
	Thread.sleep(100);
	kp.inpAClKYCformPageStRegNo(sRegNo);
	Thread.sleep(100);
	kp.inpAClKYCformPageStTradLiscNo(sTrdLisc);
	
	Thread.sleep(100);	
	kp.inpAClKYCformPageStTradLiscExDate(dd2, mm2,yyyy2);
		
	Thread.sleep(100);
	kp.inpAClKYCformPageStVatNo(sVat);
	Thread.sleep(100);
//BankDetails
	kp.inpAClKYCformPageBankName(bName);
	Thread.sleep(100);
	kp.selectAClKYCformPageBankCountry(bankCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAddr(bAdd);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankSwiftCod(bSwift);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccName(bAccName);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankCurrency(curency, driver);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccNo(bAccNo);		
	Thread.sleep(100);
	kp.inpAClKYCformPageBankIBan(bIban); 
	
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccMangName(bMangName);
	
	Thread.sleep(100);
	kp.selectAClKYCformPageBankAccMangCountry(bMangCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccMangConct(bMangCont);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankCorrBnkName(bCorBankName);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankcorrBnkSwift(bCorBankSwift);
	Thread.sleep(100);
	
//Share Holders
	kp.inpAClKYCformPageShrHldName1(shrHldName1); 
	Thread.sleep(100);
	kp.inpAClKYCformPageShrHldPerctg1(shrHldPrctg1);
	Thread.sleep(100);
	kp.selectAClKYCformPageShrHldCountry1(shrCountry1);
	Thread.sleep(100);
	
	if(shrHldName2!=(""))
	{
	  kp.inpAClKYCformPageShrHldName2(shrHldName2);
	  Thread.sleep(100);
	  kp.inpAClKYCformPageShrHldPerctg2(shrHldPrctg2);
	  Thread.sleep(100);
	  kp.selectAClKYCformPageShrHldCountry2(shrCountry2);
	  Thread.sleep(100);
	}

	Thread.sleep(100);
//Contact Details
	kp.inpAClKYCformPageCPCName(cPCName);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCDesigna(cPCDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCPCCountry(pcCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCPhNo(cPCPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCEmail(cPCEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCOpDCName(cOpName); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCDesigna(cOpDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCOpDCCountry(opCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCPhNo(cOpPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCEmail(cOpEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCCFName(cCFName); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFDesigna(cCFDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCCFCountry(ccfCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFPhNo(cCFPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFEmail(cCFEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCAcdName(cAccName);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcdDesigna(cAccDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCAccCountry(acCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcdphNo(cAccPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcDEmail(cAccEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCProposedBusiness(cPrBusi); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCConctPerson(cConPer);
	Thread.sleep(100);
	
//TradeReferance
	if(tRFName1!="")
	{
	kp.inpAClKYCformPageTrdRefName1(tRFName1);
	Thread.sleep(100);
	kp.seleAClKYCformPageTrdRefCountry1(trfCountry1);	
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefPhone1(trfPhon1);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefEmail1(trEmail1);
	Thread.sleep(100);
	}
	if(tRFName2!="")
	{
	kp.inpAClKYCformPageTrdRefName2(tRFName2);
	Thread.sleep(100);
	kp.seleAClKYCformPageTrdRefCountry2(trfCountry2);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefPhone2(trfPhon2);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefEmail2(trEmail2);
	Thread.sleep(100);
	}
//Upload Document
    
	Thread.sleep(100);
	kp.uplodkAClKYCformPageUpldCertOfIncorp(upCoI);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldAoA(upAoA);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldTrdLiscCert(upTLC);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldTaxRegi(upTRC);
	Thread.sleep(100);
	if(upCP!="")
	{
	kp.uplodAClKYCformPageUpldCompProfile(upCP);
	Thread.sleep(100);
	}
	kp.inpAClKYCformPageUpldURL(uURL);
	if(upBR!="")
	{
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldBankRef(upBR);
	}
	Thread.sleep(100);	
	kp.uplodAClKYCformPageUpldPassport(upPass);
	Thread.sleep(100);	

	kp.clickAClKYCformPageUiDeclrare(); 
	Thread.sleep(100);
	
    kp.uplodAClKYCformPageUpldSign(upSign);
    Thread.sleep(100);
    
    kp.inpAClKYCformPageUpldAuthoSignName(signName);
    
	Thread.sleep(200);

     if (driver.getPageSource().contains(kp.rtnAClKYCformPageErrorMsg().getText()));
	   {
		 test.log(Status.INFO,kp.rtnAClKYCformPageErrorMsg().getText());
		 test.log(Status.WARNING, "form contains error Msg Before Submit Btn Click");
		 Reporter.log(kp.rtnAClKYCformPageErrorMsg().getText(), true);
	   }

	kp.clickAClKYCformPageUSubmitBtn();
	
	if (driver.getCurrentUrl().contains("preview"))
	{
		test.pass("Kyc form Submitted successfully");		
	}
	else
	{
		test.log(Status.FAIL, "form contains error Msg After Submit Btn Click");
	}
	
/*boolean emailIsTakenPopUp= kp.rtnAClKYCformPageUemailIsTakenMsgWindow().isDisplayed();
	
      boolean emailIsTakenMsg= kp.rtnAClKYCformPageUemailIsTakenMsg().isDisplayed();
	  String result1= kp.rtnAClKYCformPageUemailIsTakenMsg().getText();
	  System.out.println(kp.rtnAClKYCformPageUemailIsTakenMsg().getText());
	  Reporter.log(result1, true);
      UtilityClass.drawBorder(driver, kp.rtnAClKYCformPageUemailIsTakenMsg());
		
      soft.assertFalse(emailIsTakenMsg,"Email address is already taken. Msg");
	  soft.assertAll();*/
	
//KYC View Before Submit	
	/*   UtilityClass.drawBorder(driver, kp.rtnAClKYCformPageCBPopUpKycViewBeforeSubmit());
	Thread.sleep(5000);
	boolean ViewBeforeSubmitPopUp =kp.rtnAClKYCformPageCBPopUpKycViewBeforeSubmit().isDisplayed();
	Thread.sleep(10000);
	System.out.println(ViewBeforeSubmitPopUp);
 if(ViewBeforeSubmitPopUp==true)
 {
	 test.pass("Test case pass==>View Before Submit PopUp Displyed"+ViewBeforeSubmitPopUp);
 }
 else
 { test.fail("Test case pass==>View Before Submit PopUp Displyed"+ViewBeforeSubmitPopUp);
 } 
 kp.clickAClKYCformPageVBSPopUpIReview();
	Thread.sleep(5000);
    soft.assertTrue(ViewBeforeSubmitPopUp, "not displayed");	
	Thread.sleep(5000);
	kp.clickAClKYCformPageVBSPopUpSubmitBtn();
	Thread.sleep(5000);
	//try{
	//	driver.switchTo().alert().accept();
	////   }
	//catch(NoSuchElementException e)
	///{
	//	System.out.println("NoSuchElementException");
	//}
*/
//Client profile Page	
/*	boolean result = hp.getHomePageClientProfileLogo().isDisplayed();
	UtilityClass.drawBorder(driver, hp.getHomePageClientProfileLogo());
	soft.assertTrue(result, "Client Profile Logo not displayed");
	System.out.println(result);
	Thread.sleep(100);
	hp.getHomePageClientProfileLogo().click();
	
	Thread.sleep(2000);
	pp.clickAClProfilePageKycFormBtn();
	UtilityClass.drawBorder(driver, pp.rtnAClProfilePageKycFormDetails());
	Thread.sleep(2000);
	
	pp.clickAClProfilePageNotificationBtn();
	boolean notificationList = pp.rtnAClProfilePageNotificationList().isDisplayed();
	UtilityClass.drawBorder(driver, pp.rtnAClProfilePageNotificationList());
	soft.assertTrue(notificationList, "notificationList not displayed");
	System.out.println(result);
	
	Thread.sleep(2000);
	pp.clickAClProfilePageKycFormBtn();
	Thread.sleep(2000);
	pp.clickAClProfilePageNotificationBtnAtTop();
	boolean notificationList1 = pp.rtnAClProfilePageNotificationList().isDisplayed();
	System.out.println(notificationList1);
	UtilityClass.drawBorder(driver, pp.rtnAClProfilePageNotificationList());
	soft.assertTrue(notificationList1, "notificationList not displayed");
	
//ProfileClient profile button Test
	Thread.sleep(2000);
	pp.clickAClProfilePageProfileBtn();
	Thread.sleep(2000);
	String profileName = pp.rtnAClProfilePageCompanyName().getText();
	UtilityClass.drawBorder(driver, pp.rtnAClProfilePageCompanyName());
	soft.assertEquals(profileName, iCoName, "profileName dont match");
/	Reporter.log(profileName);
	
//AdminUI
    
	driver.get(AdmnURL);
	Thread.sleep(2000);
	AdmnHP.inpAAdmnHomePageEMail(AdmnEmail);
	Thread.sleep(2000);
	AdmnHP.inpAAdmnHomePagePwd(AdmnPwd);
	Thread.sleep(2000);
	AdmnHP.clickAAdmnHomePageSignInBtn();
	Thread.sleep(2000);
		
	String mail = UtilityClass.getPFData("EMailID");
	AdmmKFT.clickAAdmnKYCFormTableRecentKYCForm(driver, mail);
	Thread.sleep(2000);
	
	
	String compName = AdmmKV.rtnAAdmnKYCFormTableCompNameKycForm().getText();
	Thread.sleep(2000);
	UtilityClass.drawBorder(driver, AdmmKV.rtnAAdmnKYCFormTableCompNameKycForm());
	Thread.sleep(2000);
	soft.assertEquals(compName, iCoName, "comp Name dont match");
	
	Reporter.log(compName +iCoName);*/

    soft.assertTrue(true);
    soft.assertAll();
}/*
@Test
public void test2()
{
	int a=20;
	int b=21;
	soft.assertEquals(a,b,"a and b not equal");
	Reporter.log("a+b");
	test = extent.createTest("Test Case 2", "The test case 2 has passed");
    
    soft.assertAll();
}*/
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
    if (result.getThrowable() != null) {
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