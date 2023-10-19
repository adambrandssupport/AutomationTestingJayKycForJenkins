package LoginModulePOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import LibraryFiles.UtilityClass;

public class AClLoginPage 
{
@FindBy(xpath="//input[@name='emailAddress']")private WebElement Email ;
@FindBy(xpath="//input[@name='password']")private WebElement Password ;
@FindBy(xpath="//input[@type='checkbox']")private WebElement remMe;
@FindBy(xpath="//button[text()='Sign In']")private WebElement loginBtn ;
@FindBy(xpath="//h2[text()='Login successful']")private WebElement logInSuccesstMsg;
@FindBy(xpath="//div[contains(text(),'Password didn')]")private WebElement wrongPwdMsg;
@FindBy(xpath="//div[text()='User not registered']")private WebElement notRegMsg;
@FindBy(xpath="//i[@class='eye fa fa-eye']")private WebElement togglePwdBtn;
@FindBy(xpath="//a[@class='signup-link']")private WebElement signUpLink;
@FindBy(xpath="//p[text()='Forgot Password?']")private WebElement forgotPwdLink;
@FindBy(xpath="//h1[text()='Hello ! Welcome Back ']")private WebElement signInPageTitle;
@FindBy(xpath="//div[@class='animate__animated animate__fadeInUp marginBottom']//p[@class='error-message'][normalize-space()='This field is required']")private WebElement invalidEmailMsg;
@FindBy(xpath="//div[@class='login-div animate__animated animate__fadeInUp']//p[@class='error-message'][normalize-space()='This field is required']")private WebElement pwdReqMsg;
public AClLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpAClLoginPageEmail(String email)
{
	Email.sendKeys(email);
}
public void inpAClLoginPagePassword(String pwd)
{
	Password.sendKeys(pwd);
}
public void clickAClLoginPageLoginBtn()
{
	loginBtn.click();
}
public String getAClLoginPageText()
{
	String text= signInPageTitle.getText();
	return text;		
}
public void clickLoginPageRemMeCheckbox()
{
	remMe.click();
}

public WebElement rtnEleLogInSuccesstMsg() throws IOException
{
	return logInSuccesstMsg;
}
public WebElement rtnEleWrongPwdMsg() throws IOException
{
	return wrongPwdMsg;
}
public WebElement rtnEleNotRegMsg() throws IOException
{	
	return notRegMsg;
}

public WebElement rtnInvalidEmailMsg() throws IOException
{	
	return invalidEmailMsg;
}

public WebElement rtnPwdReqMsg() throws IOException
{	
	return pwdReqMsg;
}

public String drawborderLoginPageToastMsg(WebDriver driver) throws IOException
{		
	//act.click(togglePwdBtn).perform();
	  UtilityClass.drawBorder(driver, logInSuccesstMsg);
	  return logInSuccesstMsg.getAttribute("innerHTML");			
}

}
