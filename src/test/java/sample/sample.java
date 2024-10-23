package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {
	
	
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
	        driver = new FirefoxDriver();
       
	        driver.manage().window().maximize();
	        driver.get("https://stagedmt.remitap.com:9092/WebApp");
	        
	        
	    }

	    
	    

	    @AfterMethod
	    public void teardown() {
	        driver.quit();
	    }

	    
	    
	    	    	    
}
