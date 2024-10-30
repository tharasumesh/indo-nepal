package test_Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation_Core.BaseClass;


public class Login_Test extends BaseClass {
	
	public Login_Test(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	@Test
	public void test_Login()
	{
	
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.querySelector(\"a:contains('Go To Login')\").click();");
		WebElement username=driver.findElement(By.xpath("//input[@id='id_username']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='id_password']"));
		//login.click();
		username.sendKeys("telson@remitap.com");
		password.sendKeys("Remit@1234");
		WebElement Login=driver.findElement(By.xpath("//button[@id='id_signin_bttn']"));
		Login.click();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement otp1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first']")));
		
		//WebElement otp1=driver.findElement(By.xpath("//input[@id='first']"));
		otp1.sendKeys("1");
		WebElement otp2=driver.findElement(By.xpath("//input[@id='second']"));
		otp2.sendKeys("2");
		WebElement otp3=driver.findElement(By.xpath("//input[@id='third']"));
		otp3.sendKeys("3");
		WebElement otp4=driver.findElement(By.xpath("//input[@id='fourth']"));
		otp4.sendKeys("4");
		WebElement otp5=driver.findElement(By.xpath("//input[@id='fifth']"));
		otp5.sendKeys("5");
		WebElement otp6=driver.findElement(By.xpath("//input[@id='sixth']"));
		otp6.sendKeys("6");
		WebElement submit_btn=driver.findElement(By.id("submit-btn"));
		submit_btn.click();
		WebDriverWait waittransaction=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement transaction=waittransaction.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Transaction']")));
		transaction.click();
		WebElement accountNumber=driver.findElement(By.xpath("//input[@id='acc-number']"));
		accountNumber.sendKeys("9990044423300011");
		WebElement searchacno=driver.findElement(By.xpath("//button[@id='search-input-button']"));
		searchacno.click();
		

	}
	
	
	
	
	
	public void test_login()
	{
		
		 	WebElement accountnumber=driver.findElement(By.id(""));
		 	accountnumber.click();
		 	WebElement searchnumber=driver.findElement(By.id(""));
		 	searchnumber.isEnabled();
		 	
		 	WebElement account=driver.findElement(By.id(""));
		 	account.isSelected();
		 	WebElement Account=driver.findElement(By.id(""));
		 	Account.getClass();
		 	WebElement getclass=driver.findElement(By.id(""));
		 	getclass.getCssValue("");
		 	
		 	WebElement acName=driver.findElement(By.id(""));
		 
		 	
		 	
		 	
	}

	
}
