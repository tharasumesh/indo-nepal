package Nepal_India;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base
{
	WebDriver driver;
	@Test
	public void test_login()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"a:contains('Go To Login')\").click();");
		WebElement username=driver.findElement(By.xpath("//input[@id='id_username']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='id_password']"));
		//login.click();
		username.sendKeys("telson@remitap.com");
		password.sendKeys("Remit@1234");
	}
    
	public void test_home()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("");
		WebElement element1=driver.findElement(By.id(""));
		
		
		
	}
	
	
	
}
