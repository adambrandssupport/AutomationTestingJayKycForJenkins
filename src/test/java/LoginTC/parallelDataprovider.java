package LoginTC;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parallelDataprovider 
{
public WebDriver driver;

@Test(dataProvider = "dataContainerTFLogin", threadPoolSize = 2)
public void signIn( String EID, String pwd) throws IOException, InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://frontendui-9ba21.web.app");
	driver.get("http://localhost:5173/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(EID);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
}
@DataProvider(name = "dataContainerTFLogin" , parallel = true)
public Object[][] dataSupply()
{
	Object[][] data= {{"kiran","tester"},{"Dhaval","UIUX"}};
	return data;
}

}
