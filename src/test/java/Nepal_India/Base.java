package Nepal_India;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	@BeforeMethod
	public void setup()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://remitapuat.machbank.com/Remittance/Dashboard");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown()
	{
		// driver.close();
	}

}
 