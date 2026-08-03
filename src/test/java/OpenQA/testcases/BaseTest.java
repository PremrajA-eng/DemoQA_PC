// Base test
package OpenQA.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import qaWebElement.pageobjects.BasePage;

public class BaseTest {
	
	WebDriver driver;
	public BasePage basepage;
	public WebDriver initializeDriver()
	{	
	      driver = new ChromeDriver();
	      return driver;
} 
	
	
	@BeforeMethod
	public BasePage LaunchApplication() {
		driver=initializeDriver();
		driver.manage().window().maximize();
		basepage= new BasePage(driver);
		basepage.openURL();		
		return basepage;
	}
	
	@AfterMethod
	public void closeBrowser() {
	 driver.close();
	}
	

}
