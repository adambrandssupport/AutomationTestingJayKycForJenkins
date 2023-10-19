package LoginTC;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	public WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void InitialiseBrowser(String b) throws IOException, InterruptedException
	{
	    String browserName=b;
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
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(EID);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
