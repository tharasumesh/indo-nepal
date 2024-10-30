package test_Classes;

import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_Core.BaseClass;

public class Home_Test extends BaseClass{
	
		Login_Test login;
		public Home_Test() {
	        this.login = new Login_Test(driver);
		}
	
	@Test
	public void test_home() throws IOException
	{
		login.test_Login();
		
		WebElement senterType=driver.findElement(By.id("id_remitterTypeId"));
	    Select select = new Select(senterType);
	    select.selectByVisibleText("Corporates");
	    
		WebElement senderName=driver.findElement(By.id("id_remitterFullName"));
		String name=senderName.getText();
		String actName="SUDAN PRASAD BHANDARI";
		Assert.assertEquals(name,actName);
	    WebElement senderNo=driver.findElement(By.id("id_remitterContactNumber"));
	    String number="9851106796";
	    Assert.assertEquals(number,senderNo);
	    
	    WebElement senderEmail=driver.findElement(By.id("id_remitterEmail"));
	    String email=senderEmail.getText();
	    String actEmail="dummyemail@remitap.com";
	    Assert.assertEquals(email,actEmail);
	    
		WebElement senderacno=driver.findElement(By.id("id_remitterAccouontNumber"));
		String acno=senderacno.getText();
		String actualacno="9990044423300011";
		Assert.assertEquals(acno,actualacno);
		
		WebElement senderBank=driver.findElement(By.id("id_remitterBankId"));
		String Bank=senderBank.getText();
		String actualbank="Machhapuchchhre Bank Limited";
		Assert.assertEquals(Bank,actualbank);
		
		WebElement senderbankbranch=driver.findElement(By.id("Id_remitterBranch"));
		String bankbranch=senderbankbranch.getText();
		String actualbankbranch="DAMAULI";
		Assert.assertEquals(bankbranch,actualbankbranch);
		
		WebElement senderAddress1=driver.findElement(By.id("id_remitterAddress1"));
		senderAddress1.sendKeys("address1");
		WebElement senderAddress2=driver.findElement(By.id("id_remitterAddress2"));
		senderAddress2.sendKeys("address2");
		WebElement senderAddress3=driver.findElement(By.id("id_remitterAddress3"));
		senderAddress3.sendKeys("address3");
		
		WebElement Idtype=driver.findElement(By.id("id_identityDocumentTypeId"));
		Select select1=new Select(Idtype);
		select1.selectByVisibleText("Passport");
		
		 // String filePath = Paths.get("C:", "path", "to", "yourfile.txt").toString();
		//WebElement document=driver.findElement(By.id(""));
		//document.sendKeys(filePath);
		//driver.findElement(By.id("upload-button")).click();
		
		WebElement docnumber=driver.findElement(By.id("Id_DocumentNumber"));
		docnumber.sendKeys("12345678");
		
		WebElement Nationality=driver.findElement(By.id(""));
		Select select2=new Select(Nationality);
		select2.selectByVisibleText("Nepali");
		
		WebElement senderstate=driver.findElement(By.id(""));
		senderstate.sendKeys("");
		
		WebElement sendercountry=driver.findElement(By.id(""));
		sendercountry.sendKeys("");
		
		 WebElement remittertype=driver.findElement(By.id(""));
		 Select selectremitter = new Select(remittertype);
		 selectremitter.selectByVisibleText("");
		 
		 WebElement remittername=driver.findElement(By.id(""));
		 remittername.sendKeys("");
		 
		
		 WebElement remitteraddress1=driver.findElement(By.id(""));
		 remitteraddress1.sendKeys("");
		 WebElement remitteraddress2=driver.findElement(By.id(""));
		 remitteraddress2.sendKeys("");
		 
		
		 WebElement remitteraddress3=driver.findElement(By.id(""));
		 remitteraddress3.sendKeys("");
		 
		 WebElement remittercontactNo=driver.findElement(By.id(""));
		 remittercontactNo.sendKeys("");
		
		 WebElement remitterCity=driver.findElement(By.id(""));
		 remitterCity.sendKeys("");
		 
		 WebElement remitterState=driver.findElement(By.id(""));
		 remitterState.sendKeys("");
		 
		 WebElement remitterCountry=driver.findElement(By.id(""));
		 remitterCountry.sendKeys("");
		 
		 WebElement tranfromCountry=driver.findElement(By.id(""));
		 Select selectfromCountry = new Select(tranfromCountry);
		 selectfromCountry.selectByVisibleText("");
		 
		 WebElement transtoCountry=driver.findElement(By.id(""));
		 Select selecttoCountry = new Select(transtoCountry);
		 selecttoCountry.selectByVisibleText("");
		 
		 WebElement transType=driver.findElement(By.id(""));
		 Select selecttransfertype=new Select(transType);
		 selecttransfertype.selectByVisibleText("");
		 
		 
		 WebElement transCurrencyCode=driver.findElement(By.id(""));
		 Select selecttransCurrencyCode=new Select(transCurrencyCode);
		 selecttransCurrencyCode.selectByVisibleText("");
		 
		 WebElement transRemittancePurpose=driver.findElement(By.id(""));
		 Select selecttransRemittancePurpose=new Select(transRemittancePurpose);
		 selecttransRemittancePurpose.selectByVisibleText("");
		 
	 
		 WebElement remitamount=driver.findElement(By.id(""));
		 remitamount.sendKeys("");
		 WebElement transactionCharge=driver.findElement(By.id(""));
		 String Charge=transactionCharge.getText();
		 
		 WebElement beneficiaryamount=driver.findElement(By.id(""));		
		 String amount=beneficiaryamount.getText();
		 
	
	}

}
