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
@FindBy(xpath="//h1[text()='Hello ! Welcome Back ']")private WebElement signInPageTitle;
@FindBy(xpath="//input[@name='emailAddress']")private WebElement Email ;
@FindBy(xpath="//input[@name='password']")private WebElement Password ;
@FindBy(xpath="//button[text()='Sign In']")private WebElement loginBtn ;
@FindBy(xpath="//a[@class='signup-link']")private WebElement signUpLink;
@FindBy(xpath="//div[@class='error']")private WebElement emailErMsg;
@FindBy(xpath="(//div[@class='error'])[2]")private WebElement pwdErMsg;

@FindBy(xpath="//input[@type='checkbox']")private WebElement remMe;
@FindBy(xpath="//h2[text()='Login successful']")private WebElement logInSuccesstMsg;
@FindBy(xpath="//div[contains(text(),'Password didn')]")private WebElement wrongPwdMsg;
@FindBy(xpath="//div[text()='User not registered']")private WebElement notRegMsg;
@FindBy(xpath="//i[@class='eye fa fa-eye']")private WebElement togglePwdBtn;
@FindBy(xpath="//p[text()='Forgot Password?']")private WebElement forgotPwdLink;


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
public void clickAClLoginPageRemMeCheckbox()
{
	remMe.click();
}

public WebElement rtnAClLoginPageLogInSuccesstMsg() throws IOException
{
	return logInSuccesstMsg;
}
public WebElement rtnAClLoginPageWrongPwdMsg() throws IOException
{
	return wrongPwdMsg;
}
public WebElement rtnAClLoginPageNotRegMsg() throws IOException
{	
	return notRegMsg;
}

public WebElement rtnAClLoginPageInvalidEmailMsg() throws IOException
{	
	return emailErMsg;
}

public WebElement rtnAClLoginPagePwdReqMsg() throws IOException
{	
	return pwdErMsg;
}

public String drawborderAClLoginPageToastMsg(WebDriver driver) throws IOException
{		
	//act.click(togglePwdBtn).perform();
	  UtilityClass.drawBorder(driver, logInSuccesstMsg);
	  return logInSuccesstMsg.getAttribute("innerHTML");			
}

}
