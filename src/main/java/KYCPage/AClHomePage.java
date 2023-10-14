package KYCPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClHomePage 
{
@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;
@FindBy(xpath="//a[text()='Sign up']")private WebElement SignUp;
@FindBy(xpath="//button[text()='Get Started']")private WebElement gettingStartedBtn;
@FindBy(xpath="(//a[contains(@href,'/login')])[2]")private WebElement goToKYCFormBtn;
@FindBy(xpath="//button[@class='got_to_kyc_button']")private WebElement goToKYCFormBtnAtBottom;
@FindBy(xpath="//img[@src='/static/media/image 1.399d1d89eaa091aed76d.png']")private WebElement adamBrandsLogo;
@FindBy(xpath="//i[@class='fa-sharp fa-solid fa-circle-user']")private WebElement clientProfileLogo;
Robot rb;
public AClHomePage(WebDriver driver) throws AWTException
{
	PageFactory.initElements(driver, this);
	this.rb=new Robot();
}

public WebElement HomePageAdamBrandsLogoPresent() throws IOException
{
	return adamBrandsLogo;
}
public void clickHomePageSignInButton()
{
	SignIn.click();
}
public void clickHomePageSignUpButton()
{
	SignUp.click();
}
public void clickHomePageGettingStartedButton()
{
	gettingStartedBtn.click();
}
public void clickHomePageGoToKYCFormButton()
{
	goToKYCFormBtn.click();
}
public void clickHomePageGoToKYCFormBtnAtBottom()
{
	goToKYCFormBtnAtBottom.click();
}
public WebElement getHomePageGoToKYCFormBtnAtBottom()
{
	return goToKYCFormBtnAtBottom;
}
public WebElement getHomePageClientProfileLogo()
{
	return clientProfileLogo;
}
}
