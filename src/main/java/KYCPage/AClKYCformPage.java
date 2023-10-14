 package KYCPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.UtilityClass;

public class AClKYCformPage 
{
	
//*Company Info*//
@FindBy(xpath="//input[@name='registeredCompanyName']")private WebElement regCompName;
@FindBy(xpath="//div[4]//div[1]//div[1]//p[2]")private WebElement regCompNameEr;
@FindBy(xpath="//input[@name='ParentCompany']")private WebElement parCompName;
@FindBy(xpath="//div[4]//div[1]//div[2]//p[2]")private WebElement parCompNameEr;
@FindBy(xpath="//input[@name='companyRegisteredAddress']")private WebElement compRegAddrs;
@FindBy(xpath="//input[@name='companyWebsite']/following-sibling::div")private WebElement compRegAddrsEr;
@FindBy(xpath="(//div[@class='selected-flag'])[1]")private WebElement seleInfoCountry;
@FindBy(xpath="//span[@class='country-name']")private List<WebElement> seleCountrylist;

@FindBy(xpath="(//input[@type='tel'])[1]")private WebElement contNo;
@FindBy(xpath="//div[4]//div[1]//div[4]//div[1]//p")private WebElement contNoEr;
@FindBy(xpath="//input[@name='emailAddress']")private WebElement cEmail;
@FindBy(xpath="//input[@placeholder='Email']")private WebElement cEmailEr;
@FindBy(xpath="//input[@name='companyWebsite']")private WebElement coSite;
@FindBy(xpath="//div[4]//div[1]//div[6]//p[2]")private WebElement coSiteEr;
@FindBy(xpath="//input[@name='corporateDomainName']")private WebElement coDomain;
@FindBy(xpath="//div[4]//div[1]//div[7]//p[2]")private WebElement coDomainEr;
@FindBy(xpath="//input[@name='NumberOfEmployees']")private WebElement empNo;
@FindBy(xpath="//div[4]//div[1]//div[8]//p[2]']")private WebElement empNoEr;

//*Company Structure*//
@FindBy(xpath="//select[@name='BusinessStructure']")private WebElement seleStru;
@FindBy(xpath="//input[@name='otherStructure']")private WebElement strOther;
@FindBy(xpath="//input[@name='otherStructure']")private WebElement strOtherEr;
@FindBy(xpath="//select[@name='NatureOfBusiness']")private WebElement seleNature;
@FindBy(xpath="//input[@name='otherBusiness']")private WebElement strBusinessOther;
@FindBy(xpath="//input[@name='otherBusiness']")private WebElement strBusinessOtherEr;
@FindBy(xpath="//select[@name='countryOfIncorporation']")private WebElement selectCountryofIncorpBtn;
@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeCountryofIncorp;
@FindBy(xpath="//li")private List<WebElement> listCountryofIncorp;
@FindBy(xpath="//input[@name='DateOfIncorporation']")private WebElement stDoInco ;
@FindBy(xpath="//input[@name='companyRegistrationNumber']")private WebElement regNo;
@FindBy(xpath="//input[@name='companyRegistrationNumber']")private WebElement regNoEr;
@FindBy(xpath="//input[@name='TradeLicenseNumber']")private WebElement tradLiscNo;
@FindBy(xpath="//input[@name='TradeLicenseNumber']")private WebElement tradLiscNoEr;
@FindBy(xpath="//input[@name='TradeLicenseExpiryData']")private WebElement trLEDate;
@FindBy(xpath="//input[@name='VAT']")private WebElement vatNo;
@FindBy(xpath="//input[@name='VAT']")private WebElement vatNoEr;

//*Bank Details*//
@FindBy(xpath="//input[@name='BankName']")private WebElement bankName;
@FindBy(xpath="//select[@name='BankCountry']")private WebElement selectCountryOfBank;
@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeCountryofBank;
@FindBy(xpath="//li")private List<WebElement> listCountryofBank;

@FindBy(xpath="//input[@name='BankBranchAddress']")private WebElement bankAddr;
@FindBy(xpath="//input[@name='SwiftCode']")private WebElement bankSwiftCod;
@FindBy(xpath="//input[@name='AccountName']")private WebElement accName;

@FindBy(xpath="//select[@name='AccountCurrency']")private WebElement selectCurrency;
//@FindBy(xpath="//input[@id='react-select-2-input']")private WebElement typeCurrency;
//@FindBy(xpath="//li")private List<WebElement> listOfCurrency;

@FindBy(xpath="//input[@name='AccountNumber']")private WebElement accNo;
@FindBy(xpath="//input[@name='IBAN']")private WebElement iBan;
@FindBy(xpath="//input[@name='BankAccountMangersName']")private WebElement bnkAccMangName;
@FindBy(xpath="(//div[@class='selected-flag'])[2]")private WebElement seleBnkAccManCountry;
@FindBy(xpath="(//input[@placeholder='Phone No.'])[2]")private WebElement bnkAccMangConct;
@FindBy(xpath="//input[@name='CorrespondentBankName']")private WebElement corrBnkName;
@FindBy(xpath="//input[@name='CorrespondentBankSwiftCode']")private WebElement corrBnkSwift;

//*Share Holder*//
@FindBy(xpath="//input[@name='shareHolderName1']")private WebElement shrHldName1;
@FindBy(xpath="//input[@name='Percentage1']")private WebElement shrHldPerctg1;
@FindBy(xpath="//select[@class='sharholderCountry']")private WebElement shrHldCountry1;
//@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeShrCountry1;
//@FindBy(xpath="//li")private List<WebElement> listShrCountry1;

@FindBy(xpath="//input[@name='shareHolderName2']")private WebElement shrHldName2;
@FindBy(xpath="//input[@name='Percentage2']")private WebElement shrHldPerctg2;
@FindBy(xpath="(//select[@class='sharholderCountry'])[2]")private WebElement shrHldCountry2;
//@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeShrCountry2;
//@FindBy(xpath="//li")private List<WebElement> listShrCountry2;


//@FindBy(xpath="//input[@name='shareholder_name3']")private WebElement shrHldName3;
//@FindBy(xpath="//input[@name='shareholder_persentage3']")private WebElement shrHldPerctg3;
//@FindBy(xpath="//input[@name='shareholder_name4']")private WebElement shrHldName4;
//@FindBy(xpath="//input[@name='shareholder_persentage4']")private WebElement shrHldPerctg4;

//@FindBy(xpath="")private WebElement shrAddBtn;

//@FindBy(xpath="//input[@name='shareholder_name5']")private WebElement shrHldName5;
//@FindBy(xpath="//input[@name='shareholder_persentage5']")private WebElement shrHldPerctg5;

//*Contact Details*//
@FindBy(xpath="//input[@name='PrimaryContactName']")private WebElement pCName;
@FindBy(xpath="//input[@name='PrimaryContactDesignation']")private WebElement pCDesigna;
@FindBy(xpath="(//div[@class='selected-flag'])[3]")private WebElement seleCDPCCountry;
@FindBy(xpath="(//input[@type='tel'])[3]")private WebElement pCphNo;
@FindBy(xpath="//input[@name='PrimaryContactEmail']")private WebElement pCEmail;

@FindBy(xpath="//input[@name='CreditNAME']")private WebElement cfdName;
@FindBy(xpath="//input[@name='CreditDesignation']")private WebElement cfdDesigna;
@FindBy(xpath="(//div[@class='selected-flag'])[5]")private WebElement seleCFCountry;
@FindBy(xpath="(//input[@type='tel'])[5]")private WebElement cfdphNo;
@FindBy(xpath="//input[@name='CreditEmail']")private WebElement cfdEmail;

@FindBy(xpath="//input[@name='OperationDepartmentName']")private WebElement opDCName;
@FindBy(xpath="//input[@name='OperationDepartmentDesignation']")private WebElement opDCDesigna;
@FindBy(xpath="(//div[@class='selected-flag'])[4]")private WebElement seleOpDCountry;
@FindBy(xpath="(//input[@type='tel'])[4]")private WebElement opDCPhNo;
@FindBy(xpath="//input[@name='OperationDepartmentEmail']")private WebElement opDCEmail;

@FindBy(xpath="//input[@name='AccountDepartName']")private WebElement acdName;
@FindBy(xpath="//input[@name='AcoountDepartDesignation']")private WebElement acdDesigna;
@FindBy(xpath="(//div[@class='selected-flag'])[6]")private WebElement seleAccCountry;
@FindBy(xpath="(//input[@type='tel'])[6]")private WebElement acdphNo;
@FindBy(xpath="//input[@name='AccountDepartmentEmail']")private WebElement acdEmail;

@FindBy(xpath="//input[@name='ProposedBusiness']")private WebElement proposBusiness;
@FindBy(xpath="//input[@name='ContactPerson']")private WebElement conctPerson;

//*Trade Referance*//
@FindBy(xpath="//input[@name='TradeReferenceName1']")private WebElement tRName1;
@FindBy(xpath="(//div[@class='selected-flag'])[7]")private WebElement seleTrRefCountry1;
@FindBy(xpath="//input[@placeholder='Phone 1']")private WebElement tRPhone1;
@FindBy(xpath="//input[@name='TradeReferenceEmail1']")private WebElement tREmail1;

@FindBy(xpath="//input[@name='TradeReferenceName2']")private WebElement tRName2;
@FindBy(xpath="(//div[@class='selected-flag'])[8]")private WebElement seleTrRefCountry2;
@FindBy(xpath="//input[@placeholder='Phone 2']")private WebElement tRPhone2;
@FindBy(xpath="//input[@name='TradeReferenceEmail2']")private WebElement tREmail2;

//*Upload Document*//
@FindBy(xpath="//label[contains(text(),'1)')]/following-sibling::input")private WebElement certOfIncorp;
@FindBy(xpath="//label[contains(text(),'2) Memorandum/Article of Association')]/following-sibling::input")private WebElement articleOfAssociation;
@FindBy(xpath="//label[contains(text(),'3)')]/following-sibling::input")private WebElement tradeLiscCert;
@FindBy(xpath="//label[contains(text(),'4)')]/following-sibling::input")private WebElement taxRegiCert;
@FindBy(xpath="//label[contains(text(),'5)')]/following-sibling::input")private WebElement compProfile;
@FindBy(xpath="//label[contains(text(),'7)')]/following-sibling::input")private WebElement bankRefLetter;
@FindBy(xpath="//label[contains(text(),'8) Passport Copies')]/following-sibling::input")private WebElement passportAuthoSignatory;

@FindBy(xpath="//label[contains(text(),'6)')]/following-sibling::input")private WebElement upldURL;
@FindBy(xpath="//input[@type='checkbox']")private WebElement iDeclare;
@FindBy(xpath="//input[@name='AuthorisedSignatureImage']")private WebElement upldSign;

@FindBy(xpath="//label[contains(text(),'Authorized Signatory Name ')]/following-sibling::input")private WebElement AuthoSignName;
@FindBy(xpath="//button[text()='Submit']")private WebElement submitBtn;
@FindBy(xpath="//div[text()='Email address is already taken.']")private WebElement emailIsTakenMsg;
@FindBy(xpath="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']")private WebElement emailIsTakenWindow;
@FindBy(xpath="//h1[text()='Please Review KYC Form Before Submitting']")private WebElement kycViewbeforeSubmit;
@FindBy(xpath="(//input[@type='checkbox'])[2]")private WebElement kycViewPopUpiReview;
@FindBy(xpath="//button[text()='Edit']")private WebElement kycViewPopUpEditBtn;
@FindBy(xpath="//button[text()='Submit']")private WebElement kycViewPopUpSubmitBtn;

//KYC PomPage
Actions act;
Robot rb;
public AClKYCformPage(WebDriver driver) throws Throwable
{
	PageFactory.initElements(driver, this);
	this.act=new Actions(driver);
	this.rb=new Robot();
}
//*Company Info*//
  public void inpAClKYCformPageIRegCompName(String regCoName)
   {
	regCompName.sendKeys(regCoName);	
   }

  public void inpAClKYCformPageEmail(String email)
  {
	  cEmail.sendKeys(email);
  }
  public boolean inpAClKYCformPageIRegCompNameEr()
  {  
		return regCompNameEr.isDisplayed();
  }
  public void inpAClKYCformPageIParCompName(String parCoName)
   {
	parCompName.sendKeys(parCoName);
   }
  public boolean inpAClKYCformPageIParCompNameEr()
  {
	  return parCompNameEr.isDisplayed();
  }
  public void inpAClKYCformPageICompRegAddrs(String coAdd)
   {
	compRegAddrs.sendKeys(coAdd);
   }
  public boolean inpAClKYCformPageICompRegAddrsEr()
  {
	  return compRegAddrsEr.isDisplayed();
  }
  public void selectAClKYCformPageStCountry(String infoCountry) throws IOException, InterruptedException
  {
	  seleInfoCountry.click();
	  Thread.sleep(1000);
	  for(WebElement c : seleCountrylist)
	  {
		  if(c.getText().equals(infoCountry) )
		  {
			  c.click();
			  break;
		  }
	  }
	  
  }
  public void inpAClKYCformPageIRegCompConNo(String regConNoN) throws InterruptedException
   {
	 /* Thread.sleep(3000);
	  cEmail.click();
	  Thread.sleep(3000);
	  rb.keyPress(KeyEvent.VK_TAB);
	  rb.delay(500);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(3000);*/
	  contNo.sendKeys(regConNoN);
	  rb.delay(1500);
   }
  public boolean inpAClKYCformPageIRegCompConNoEr()
  {
	  return contNoEr.isDisplayed();
  }
  public void inpAClKYCformPageIRegCompEmail(String comEmail)
   {
	  cEmail.sendKeys(comEmail);
   }

  public void inpAClKYCformPageIRegCompWSite(String compSite)
  {
	  coSite.sendKeys(compSite);
  }
  public boolean inpAClKYCformPageIRegCompWSiteEr()
  {
	  return coSiteEr.isDisplayed();
  }
  public void inpAClKYCformPageIRegCompDomain(String comDomain)
  {
	  coDomain.sendKeys(comDomain);
  }
  public boolean inpAClKYCformPageIRegCompDomainEr()
  {
	  return coDomainEr.isDisplayed();
  }
  public void inpAClKYCformPageIRegCompEmployee( String comEmp) throws IOException
  {
	  empNo.sendKeys(comEmp);
  }
  public boolean inpAClKYCformPageIRegCompEmployeeEr()
  {
	  return empNoEr.isDisplayed();
	  
  }
  
//Company Structure*//
  
  public void selectAClKYCformPageStBusineStructure(String StructureType) throws IOException
  {
	  UtilityClass.selectBusinessList(seleStru, StructureType);
  }
  
  public void inpAClKYCformPageStOtherStructure(String otherStructure)
  {
	  strOther.sendKeys(otherStructure);
  }
  public void selectAClKYCformPageStBusineNature(String naturType)
  {
	  UtilityClass.selectBusinessNatureList(seleNature, naturType);
  }
  
 public void inpAClKYCformPageStOtherBusiness(String otherBusiness)
  {
	  strBusinessOther.sendKeys(otherBusiness);
  }
  public void selectAClKYCformPageCountryOfIncorp(String cntryOfIncorp) throws InterruptedException
  {
	  Thread.sleep(500);
      UtilityClass.selectCountryList(selectCountryofIncorpBtn, cntryOfIncorp);
	  
//	  selectCountryofIncorpBtn.click();
      
//	  typeCountryofIncorp.sendKeys(cntryOfIncorp);
//	  Thread.sleep(500);
	  
//	 for(WebElement s:listCountryofIncorp)
//	  {
		//System.out.println(s.getText());
//		  if(s.getText().equalsIgnoreCase(cntryOfIncorp))
//		  {
//			  s.click();
//		  }
//		  else 
//		  {
//    		  rb.keyPress(KeyEvent.VK_TAB);	
//   		  rb.delay(500);
//	      }	  
//	  }	
  }
 
  public void inpAClKYCformPageStDateOfIncorporationFirefox(String dd,String mm, String yyyy ) throws AWTException
  {
	  int d=Integer.parseInt(dd);
		 int m=Integer.parseInt(mm);
		 int y=Integer.parseInt(yyyy);
		 rb.delay(3000);
 	 rb.keyPress(KeyEvent.VK_TAB);
 	 rb.delay(3000);
 	 rb.keyPress(KeyEvent.VK_TAB);
 	rb.delay(3000);
 	 rb.keyPress(KeyEvent.VK_HOME);
 	rb.delay(3000);
 	 int yyyy1=2023-y+1;
 	 for(int i=1;i<=d-1;i++)
 	 {  rb.delay(100);
 		 rb.keyPress(KeyEvent.VK_UP);
 		 rb.delay(100);
 		 rb.keyRelease(KeyEvent.VK_UP);
 		 rb.delay(100);
 	 }
 	 rb.keyPress(KeyEvent.VK_RIGHT);
 	 rb.keyPress(KeyEvent.VK_HOME);
 	 for(int i=1;i<=m-1;i++)
 	 {  rb.delay(100);
 		 rb.keyPress(KeyEvent.VK_UP);
 		 rb.delay(100);
 		 rb.keyRelease(KeyEvent.VK_UP);
 		 rb.delay(100);
 	 }
 	 rb.keyPress(KeyEvent.VK_RIGHT);
 	 rb.keyPress(KeyEvent.VK_HOME);
 	 for(int i=1;i<=yyyy1;i++)
 	 {  rb.delay(100);
 		 rb.keyPress(KeyEvent.VK_DOWN);
 		 rb.delay(100);
 		 rb.keyRelease(KeyEvent.VK_DOWN);
 		 rb.delay(100);
 	 }
 	 

    //  rb.keyPress(KeyEvent.VK_1);
   //   rb.keyPress(KeyEvent.VK_9);   
   //   rb.keyPress(KeyEvent.VK_8);
   //   rb.keyPress(KeyEvent.VK_4);
 //     trLEDate.sendKeys("30-08-2023");
  }
 public void inpAClKYCformPageStDateOfIncorporation(String dd,String mm, String yyyy ) throws AWTException
 {
	 int d=Integer.parseInt(dd);
	 int m=Integer.parseInt(mm);
	 int y=Integer.parseInt(yyyy);
	 
	 rb.keyPress(KeyEvent.VK_TAB);
	 
	 int yyyy1=2023-y+1;
	 for(int i=1;i<=d;i++)
	 {
		 rb.keyPress(KeyEvent.VK_UP);
		 rb.delay(100);
		 rb.keyRelease(KeyEvent.VK_UP);
		 rb.delay(100);
	 }
	 rb.keyPress(KeyEvent.VK_RIGHT);	 
	 for(int i=1;i<=m;i++)
	 {
		 rb.keyPress(KeyEvent.VK_UP);
		 rb.delay(300);
		 rb.keyRelease(KeyEvent.VK_UP);
		 rb.delay(300);
	 }
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 for(int i=1;i<=yyyy1;i++)
	 {
		 rb.keyPress(KeyEvent.VK_DOWN);
		 rb.delay(300);
		 rb.keyRelease(KeyEvent.VK_DOWN);
		 rb.delay(300);
	 }
	 

   //  rb.keyPress(KeyEvent.VK_1);
  //   rb.keyPress(KeyEvent.VK_9);   
  //   rb.keyPress(KeyEvent.VK_8);
   //  rb.keyPress(KeyEvent.VK_4);
	 //trLEDate.sendKeys("30-08-2023");
 }
 public void inpAClKYCformPageStRegNo(String RegiNo)
 {
	  regNo.sendKeys(RegiNo);
 }
 public void inpAClKYCformPageStTradLiscNo(String tradeLisc)
 {
	  tradLiscNo.sendKeys(tradeLisc);
 } 
 public void inpAClKYCformPageStTradLiscExDateFirefox(String dd, String mm,String yyyy) throws AWTException
 {
	 int d=Integer.parseInt(dd);
	 int m=Integer.parseInt(mm);
	 int y=Integer.parseInt(yyyy);
	
	 rb.keyPress(KeyEvent.VK_TAB);
     int yyyy1=y-2023;
     rb.keyPress(KeyEvent.VK_HOME);
	 for(int i=1;i<=d-1;i++)
		 {
			 rb.keyPress(KeyEvent.VK_UP);
			 rb.delay(100);
			 rb.keyRelease(KeyEvent.VK_UP);
			 rb.delay(100);
		 }
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 rb.keyPress(KeyEvent.VK_HOME);
	 for(int i=1;i<=m-1;i++)
		 {
			 rb.keyPress(KeyEvent.VK_UP);
			 rb.delay(100);
			 rb.keyRelease(KeyEvent.VK_UP);
			 rb.delay(100);
		 }	
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 rb.keyPress(KeyEvent.VK_HOME);
	 for(int i=1;i<=yyyy1;i++)
		 {
			 rb.keyPress(KeyEvent.VK_UP);
			 rb.delay(100);
			 rb.keyRelease(KeyEvent.VK_UP);
			 rb.delay(100);
		 }
 }
 public void inpAClKYCformPageStTradLiscExDate(String dd,String mm, String yyyy ) throws AWTException
 {	 
	 int d=Integer.parseInt(dd);
	 int m=Integer.parseInt(mm);
	 int y=Integer.parseInt(yyyy);
	 
	 rb.keyPress(KeyEvent.VK_TAB);
 
     int yyyy1=y-2023;
 
	 for(int i=1;i<=d;i++)
		 {
			 rb.keyPress(KeyEvent.VK_UP);
			 rb.delay(100);
			 rb.keyRelease(KeyEvent.VK_UP);
			 rb.delay(100);
		 }
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 for(int i=1;i<=m;i++)
		 {
			 rb.keyPress(KeyEvent.VK_UP);
			 rb.delay(100);
			 rb.keyRelease(KeyEvent.VK_UP);
			 rb.delay(300);
		 }
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 for(int i=1;i<=yyyy1+1;i++)
		 {
			 rb.keyPress(KeyEvent.VK_UP);
			 rb.delay(300);
			 rb.keyRelease(KeyEvent.VK_UP);
			 rb.delay(300);
		 }
	 
		 
	// trLEDate.sendKeys(ddmm);
	// rb.delay(500);
	// rb.keyPress(KeyEvent.VK_RIGHT);
	// rb.delay(100); // Optional delay to hold the key pressed
	// rb.keyRelease(KeyEvent.VK_RIGHT);
	// rb.delay(100);
    // rb.keyPress(KeyEvent.VK_2);
    // rb.keyPress(KeyEvent.VK_0);
   //  rb.keyPress(KeyEvent.VK_2);
   //  rb.keyPress(KeyEvent.VK_5);
  
 }
 public void inpAClKYCformPageStVatNo(String compvatNo)
 {
	  vatNo.sendKeys(compvatNo);
 }
 
//*Bank Details*//
 public void inpAClKYCformPageBankName(String bnkName)
 {
     bankName.sendKeys(bnkName);
 }
 public void selectAClKYCformPageBankCountry(String cntryOfBank) throws InterruptedException
 {
	
	  Thread.sleep(500);
      UtilityClass.selectCountryList(selectCountryOfBank, cntryOfBank);
      
//      selectCountryOfBank.click();
//     Thread.sleep(500);
//	  typeCountryofBank.sendKeys(cntryOfBank);
//	  Thread.sleep(500);
	  
//	 for(WebElement s:listCountryofBank)
//	  {
	//	System.out.println(s.getText());
//		  if(s.getText().equalsIgnoreCase(cntryOfBank))
//		  {
//			  s.click();
//		  }
//		  else 
//		  {
//   		  rb.keyPress(KeyEvent.VK_TAB);	
//   		  rb.delay(500);
//	      }	  
//	  }	
 }
 public void inpAClKYCformPageBankAddr(String bnkAddr)
 {
     bankAddr.sendKeys(bnkAddr);
 }
 public void inpAClKYCformPageBankSwiftCod(String bnkSwiftCod)
 {
     bankSwiftCod.sendKeys(bnkSwiftCod);
 } 
 public void inpAClKYCformPageBankAccName(String accontName)
 {
     accName.sendKeys(accontName);
 }
 public void inpAClKYCformPageBankCurrency(String currency,WebDriver driver)
 {
	 UtilityClass.selectCountryList(selectCurrency, currency);
//	 typeCurrency.sendKeys(currency);
//	 rb.delay(100);
//	 rb.keyPress(KeyEvent.VK_TAB);
	// rb.keyPress(KeyEvent.VK_ENTER);
 }
 public void inpAClKYCformPageBankAccNo(String accountNo)
 {
 	accNo.sendKeys(accountNo);
 }
 public void inpAClKYCformPageBankIBan(String iBanNo)
 {
 	iBan.sendKeys(iBanNo);
 }
 public void inpAClKYCformPageBankAccMangName(String bnkAccManName)
 {
 	bnkAccMangName.sendKeys(bnkAccManName);
 }
 public void selectAClKYCformPageBankAccMangCountry(String bmCountry) throws IOException, InterruptedException
 {
	
	 
	  seleBnkAccManCountry.click();
	  Thread.sleep(1000);
	  for(WebElement c : seleCountrylist)
	  {
		  if(c.getText().equals(bmCountry) )
		  {
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageBankAccMangConct(String bnkAccMangPhone) throws InterruptedException
 {
	
 	bnkAccMangConct.sendKeys(bnkAccMangPhone);
 } 
 public void inpAClKYCformPageBankCorrBnkName(String corBnkName)
 {
 	corrBnkName.sendKeys(corBnkName);
 }
 public void inpAClKYCformPageBankcorrBnkSwift(String corrSwift)
 {
 	corrBnkSwift.sendKeys(corrSwift);
 } 
 
//*Share Holder*//
 public void inpAClKYCformPageShrHldName1(String shareHldName1)
 {
 	shrHldName1.sendKeys(shareHldName1);
 }
 public void inpAClKYCformPageShrHldPerctg1(String shareHldPrctg1)
 {
 	shrHldPerctg1.sendKeys(shareHldPrctg1);
 }
 public void selectAClKYCformPageShrHldCountry1(String shrCountry1) throws IOException, InterruptedException
 {
	UtilityClass.selectCountryList(shrHldCountry1, shrCountry1);
//	 shrHldCountry1.click();
//     Thread.sleep(500);
//     typeShrCountry1.sendKeys(shrCountry1);
//	  Thread.sleep(500);
	  
//	 for(WebElement s:listShrCountry1)
//	  {
//		//System.out.println(s.getText());
//		  if(s.getText().equalsIgnoreCase(shrCountry1))
//		  {
//			  s.click();
//		  }
//		  else 
//		  {
 // 		  rb.keyPress(KeyEvent.VK_TAB);	
//  		  rb.delay(500);
	//      }	  
	 // }	
 }
 
 public void inpAClKYCformPageShrHldName2(String shareHldName2)
 {
 	shrHldName2.sendKeys(shareHldName2);
 } 
 public void inpAClKYCformPageShrHldPerctg2(String shareHldPrctg2)
 {
 	shrHldPerctg2.sendKeys(shareHldPrctg2);
 }
 public void selectAClKYCformPageShrHldCountry2(String shrCountry2) throws IOException, InterruptedException
 {
	 UtilityClass.selectCountryList(shrHldCountry2, shrCountry2);

//	 shrHldCountry2.click();
 //    Thread.sleep(500);
 //    typeShrCountry2.sendKeys(shrCountry2);
//	  Thread.sleep(500);
	  
//	 for(WebElement s:listShrCountry2)
//	  {
		//System.out.println(s.getText());
//		  if(s.getText().equalsIgnoreCase(shrCountry2))
//		  {
//			  s.click();
//		  }
//		  else 
//		  {
 // 		  rb.keyPress(KeyEvent.VK_TAB);	
 // 		  rb.delay(500);
//	      }	  
//	  }	
 }
 
//*Contact Details*//
 public void inpAClKYCformPageCPCName(String pConName)
 {
 	pCName.sendKeys(pConName);
 }
 public void inpAClKYCformPageCPCDesigna(String PConDesigna)
 {
 	pCDesigna.sendKeys(PConDesigna);
 }
 
 public void selectAClKYCformPageCPCCountry(String CPCCountry) throws IOException, InterruptedException
 {
	  
	  seleCDPCCountry.click();
	  Thread.sleep(1000);
	  for(WebElement c:seleCountrylist)
	  {
		  if(c.getText().equals(CPCCountry))
		  {
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageCPCPhNo(String pConPhNo)
 {
 	pCphNo.sendKeys(pConPhNo);
 }
 public void inpAClKYCformPageCPCEmail(String pConEmail)
 {
 	pCEmail.sendKeys(pConEmail);
 }
 
 
 public void inpAClKYCformPageCCFName(String cFName)
 {
 	cfdName.sendKeys(cFName);
 }
 public void inpAClKYCformPageCCFDesigna(String cFDesigna)
 {
 	cfdDesigna.sendKeys(cFDesigna);
 }
 public void selectAClKYCformPageCCFCountry(String CCFCountry) throws IOException
 {

	  seleCFCountry.click();
	  for(WebElement c:seleCountrylist)
	  {
		  if(c.getText().equals(CCFCountry))
		  {
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageCCFPhNo(String cFPhNo)
 {
 	cfdphNo.sendKeys(cFPhNo);
 }
 public void inpAClKYCformPageCCFEmail(String cFEmail)
 {
 	cfdEmail.sendKeys(cFEmail);
 }
 
 
 public void inpAClKYCformPageCOpDCName(String opDConName)
 {
 	opDCName.sendKeys(opDConName);
 }
 public void inpAClKYCformPageCOpDCDesigna(String opDConDesigna)
 {
 	opDCDesigna.sendKeys(opDConDesigna);
 }
 public void selectAClKYCformPageCOpDCCountry(String COpDCCountry) throws IOException, InterruptedException
 {
	  seleOpDCountry.click();
	  Thread.sleep(1000);
	  for(WebElement c:seleCountrylist)
	  {
		  if(c.getText().equals(COpDCCountry))
		  {
			  Thread.sleep(1000);
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageCOpDCPhNo(String opDConNo)
 {
 	opDCPhNo.sendKeys(opDConNo);
 }
 public void inpAClKYCformPageCOpDCEmail(String opDConEmail)
 {
 	opDCEmail.sendKeys(opDConEmail);
 }
 
 
 public void inpAClKYCformPageCAcdName(String accdName)
 {
 	acdName.sendKeys(accdName);
 }
 public void inpAClKYCformPageCAcdDesigna(String accdDesigna)
 {
 	acdDesigna.sendKeys(accdDesigna);
 }
 public void selectAClKYCformPageCAccCountry(String CAcdCountry) throws IOException, InterruptedException
 {
	 Thread.sleep(1000);
	  seleAccCountry.click();
	  for(WebElement c:seleCountrylist)
	  {
		  if(c.getText().equals(CAcdCountry))
		  {
			  Thread.sleep(1000);
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageCAcdphNo(String accdNo)
 {
 	acdphNo.sendKeys(accdNo);
 }
 public void inpAClKYCformPageCAcDEmail(String accdEmail)
 {
 	acdEmail.sendKeys(accdEmail);
 }
 
 
 public void inpAClKYCformPageCProposedBusiness(String proposedBusiness)
 {
 	proposBusiness.sendKeys(proposedBusiness);
 }
 public void inpAClKYCformPageCConctPerson(String cnctPerson)
 {
 	conctPerson.sendKeys(cnctPerson);
 }
 
 
//*Trade Referance*//
 public void inpAClKYCformPageTrdRefName1(String tradeRefName1)
 {
 	tRName1.sendKeys(tradeRefName1);
 }
 public void seleAClKYCformPageTrdRefCountry1(String tradeRefCountry1) throws InterruptedException
 {
	 seleTrRefCountry1.click();
	 Thread.sleep(1000);
	  for(WebElement c:seleCountrylist)
	  {
		  if(c.getText().equals(tradeRefCountry1))
		  {
			  Thread.sleep(1000);
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageTrdRefPhone1(String tradeRefPhone1)
 {
	 tRPhone1.sendKeys(tradeRefPhone1);
 }
 public void inpAClKYCformPageTrdRefEmail1(String tradeRefMail1)
 {
	 tREmail1.sendKeys(tradeRefMail1);
 }
 
 public void inpAClKYCformPageTrdRefName2(String tradeRefName2)
 {
 	tRName2.sendKeys(tradeRefName2);
 }
 public void seleAClKYCformPageTrdRefCountry2(String tradeRefCountry2) throws InterruptedException
 {
	 
	 seleTrRefCountry2.click();
	 Thread.sleep(1000);
	  for(WebElement c:seleCountrylist)
	  {
		  if(c.getText().equals(tradeRefCountry2))
		  {
			  Thread.sleep(1000);
			  c.click();
			  break;
		  }
	  }
 }
 public void inpAClKYCformPageTrdRefPhone2(String tradeRefPhone2)
 {
	 tRPhone2.sendKeys(tradeRefPhone2);
 }
 public void inpAClKYCformPageTrdRefEmail2(String tradeRefMail2)
 {
	 tREmail2.sendKeys(tradeRefMail2);
 }
//*Upload Document*//
 
 public void uplodkAClKYCformPageUpldCertOfIncorp(String UpldCertOfIncorp) throws IOException, InterruptedException
 {
	 certOfIncorp.sendKeys(UpldCertOfIncorp);
 }
 public void uplodAClKYCformPageUpldAoA(String UpldAoA) throws IOException, InterruptedException
 {
	 articleOfAssociation.sendKeys(UpldAoA);
 }
 public void uplodAClKYCformPageUpldTrdLiscCert(String UpldTrdLiscCert) throws IOException, InterruptedException
 {
	 tradeLiscCert.sendKeys(UpldTrdLiscCert);
 }
 public void uplodAClKYCformPageUpldTaxRegi(String TaxRegiDU) throws IOException, InterruptedException
 {
	 taxRegiCert.sendKeys(TaxRegiDU);
 }
 public void uplodAClKYCformPageUpldCompProfile(String CompProfileDU) throws IOException, InterruptedException
 {
	 compProfile.sendKeys(CompProfileDU);
 }
 public void uplodAClKYCformPageUpldBankRef(String UpldBankRef) throws IOException, InterruptedException
 {
	 bankRefLetter.sendKeys(UpldBankRef);
 }
 public void uplodAClKYCformPageUpldPassport(String UpldPassport) throws IOException, InterruptedException
 {
	 passportAuthoSignatory.sendKeys(UpldPassport);
 }
 
 public void inpAClKYCformPageUpldURL(String uploadURL)
 {
 	upldURL.sendKeys(uploadURL);
 }

 public void clickAClKYCformPageUiDeclrare()
 {
 	iDeclare.click();
 }
 public void uplodAClKYCformPageUpldSign(String UpldSign) throws IOException, InterruptedException
 {
	 upldSign.sendKeys(UpldSign);
 }
 public void inpAClKYCformPageUpldAuthoSignName(String authSignName)
 {
	 AuthoSignName.sendKeys(authSignName);
 }
 public void clickAClKYCformPageUSubmitBtn()
 {
 	submitBtn.click();
 }
 public WebElement rtnAClKYCformPageUSubmitBtn()
 {
	 return submitBtn;
 }
 public WebElement rtnAClKYCformPageUemailIsTakenMsg()
 {
	 return emailIsTakenMsg;
 }
 public WebElement rtnAClKYCformPageUemailIsTakenMsgWindow()
 {
	 return emailIsTakenWindow;
 }
 //KYC View Before Submit
 public WebElement rtnAClKYCformPageCBPopUpKycViewBeforeSubmit()
 {
	 return kycViewbeforeSubmit;
 }
 public void clickAClKYCformPageVBSPopUpIReview()
 {
	 kycViewPopUpiReview.click();
 }
 public void clickAClKYCformPageVBSPopUpEditBtn()
 {
	 kycViewPopUpEditBtn.click();
 }
 public void clickAClKYCformPageVBSPopUpSubmitBtn()
 {
	 kycViewPopUpSubmitBtn.click();
 }
 
}
