package sample;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage extends sample {

 @Test
public void test_login()
{
	
	WebElement userPhno=driver.findElement(By.xpath("//input[@id='phoneNumber']"));
	WebElement signin=driver.findElement(By.xpath("//input[@id='signup']"));
	userPhno.sendKeys("9526490428");
	String actualValue = userPhno.getAttribute("value");
	String Uname="9526490428";
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='signup']")));
	signupButton.click();
	Assert.assertEquals(Uname,actualValue,"error message");
	
		
	}
	
	
}