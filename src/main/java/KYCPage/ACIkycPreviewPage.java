package KYCPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACIkycPreviewPage 
{
@FindBy(xpath = "//label[text()='Registered Company Name']/following-sibling::p")private WebElement  compName;
@FindBy(xpath = "//label[text()='Parent Company']/following-sibling::p")private WebElement parCompName;
@FindBy(xpath = "//label[text()='Company Registered Address']/following-sibling::p")private WebElement compAdd;
@FindBy(xpath = "//label[text()='Contact Number']/following-sibling::p")private WebElement compPhone;
@FindBy(xpath = "//label[text()='Email Address']/following-sibling::p")private WebElement emailAdd;
@FindBy(xpath = "//label[text()='Company Website']/following-sibling::p")private WebElement website;
@FindBy(xpath = "//label[text()='Corporate Domain Name']/following-sibling::p")private WebElement domain;
@FindBy(xpath = "//label[text()='Number Of Employees']/following-sibling::p")private WebElement emp;

@FindBy(xpath = "//label[text()='Business Structure']/following-sibling::p")private WebElement  bussiStru;
@FindBy(xpath = "//label[text()='Other Structure']/following-sibling::p")private WebElement otherBussiStru;
@FindBy(xpath = "//label[text()='Nature Of Business']/following-sibling::p")private WebElement bussiNature;
@FindBy(xpath = "//label[text()='Other Business']/following-sibling::p")private WebElement otherBussiNature;
@FindBy(xpath = "//label[text()='Country Of Incorporation']/following-sibling::p")private WebElement countryofIncorp;
@FindBy(xpath = "//label[text()='Date Of Incorporation']/following-sibling::p")private WebElement dateOfIncorp;
@FindBy(xpath = "//label[text()='Company Registration Number']/following-sibling::p")private WebElement regNo;
@FindBy(xpath = "//label[text()='Trade License Number']/following-sibling::p")private WebElement trdLiscNo;
@FindBy(xpath = "//label[text()='Trade License Expiry Date']/following-sibling::p")private WebElement trdLiscNoExp;
@FindBy(xpath = "//label[text()='VAT Registration Number']/following-sibling::p")private WebElement vatRegNo;

@FindBy(xpath = "//label[text()='Bank Name']//following-sibling::p")private WebElement  bnkName;
@FindBy(xpath = "//label[text()='Bank Country']/following-sibling::p")private WebElement bnkCountry;
@FindBy(xpath = "//label[text()='Bank Branch Address']/following-sibling::p")private WebElement bnkAddress;
@FindBy(xpath = "//label[text()='SwiftCode']/following-sibling::p")private WebElement swiftCode;
@FindBy(xpath = "//label[text()='Account Name']/following-sibling::p")private WebElement accName;
@FindBy(xpath = "//label[text()='Account Currency']/following-sibling::p")private WebElement AccCurrency;
@FindBy(xpath = "//label[text()='Account Number']/following-sibling::p")private WebElement accNo;
@FindBy(xpath = "//label[text()='IBAN/ABA']/following-sibling::p")private WebElement iBANNo;
@FindBy(xpath = "//label[text()='Bank Account Mangers Name']/following-sibling::p")private WebElement managerName;
@FindBy(xpath = "//label[text()='Account Managers Contact']/following-sibling::p")private WebElement managerPhone;
@FindBy(xpath = "//label[text()='Correspondent Bank Name']/following-sibling::p")private WebElement correBnkName;
@FindBy(xpath = "//label[text()='Correspondent Bank SwiftCode']/following-sibling::p")private WebElement CorreBnkswiftCode;

@FindBy(xpath = "(//label[text()='Name'])[1]//following-sibling::p")private WebElement ShrHldName1;
@FindBy(xpath = "(//label[text()='Percentage'])[1]//following-sibling::p")private WebElement ShrHldPercentage1;
@FindBy(xpath = "(//label[text()='Country'])[1]//following-sibling::p")private WebElement ShrHldCountry1;


public ACIkycPreviewPage(WebDriver driver)
{
    PageFactory.initElements(driver, this);
}

//Company info
public String getACIkycPreviewPageCompName()
{
	return compName.getText();
}
public String getACIkycPreviewPageParentCompName()
{
	return parCompName.getText();
}
public String getACIkycPreviewPageCompAdd()
{
	return compAdd.getText();
}
public String getACIkycPreviewPageCompPhone()
{
	return compPhone.getText();
}
public String getACIkycPreviewPageEmail()
{
	return emailAdd.getText();
}
public String getACIkycPreviewPageWebsite()
{
	return website.getText();
}
public String getACIkycPreviewPageDomain()
{
	return domain.getText();
}
public String getACIkycPreviewPageNumberOfEmployee()
{
	return emp.getText();
}
//Company structure
public String getACIkycPreviewPageBussiStru()
{
	return bussiStru.getText();
}
public String getACIkycPreviewPageOtherBussiStru()
{
	return otherBussiStru.getText();
}
public String getACIkycPreviewPageBussiNature()
{
	return bussiNature.getText();
}
public String getACIkycPreviewPageOtherBussiNature()
{
	return otherBussiNature.getText();
}
public String getACIkycPreviewPageCountryofIncorp()
{
	return countryofIncorp.getText();
}
public String getACIkycPreviewPageDateOfIncorp()
{
	return dateOfIncorp.getText();
}
public String getACIkycPreviewPageRegNo()
{
	return regNo.getText();
}
public String getACIkycPreviewPageTrdLiscNo()
{
	return trdLiscNo.getText();
}
public String getACIkycPreviewPageTrdLiscNoExp()
{
	return trdLiscNoExp.getText();
}
public String getACIkycPreviewPageVatRegNo()
{
	return vatRegNo.getText();
}

//Bank Details
public String getACIkycPreviewPageBankName()
{
	return bnkName.getText();
}
public String getACIkycPreviewPageBankCountry()
{
	return bnkCountry.getText();
}
public String getACIkycPreviewPageBankAdd()
{
	return bnkAddress.getText();
}
public String getACIkycPreviewPageSwiftCode()
{
	return swiftCode.getText();
}
public String getACIkycPreviewPageAccName()
{
	return accName.getText();
}
public String getACIkycPreviewPageAccCurrency()
{
	return AccCurrency.getText();
}
public String getACIkycPreviewPageAccNo()
{
	return accNo.getText();
}
public String getACIkycPreviewPageIBan()
{
	return iBANNo.getText();
}
public String getACIkycPreviewPageManagerName()
{
	return managerName.getText();
}
public String getACIkycPreviewPageManagerPhone()
{
	return managerPhone.getText();
}
public String getACIkycPreviewPageCorrespBnk()
{
	return correBnkName.getText();
}
public String getACIkycPreviewPageCorrespBnkSwift()
{
	return CorreBnkswiftCode.getText();
}
}
