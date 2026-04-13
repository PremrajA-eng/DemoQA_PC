package qaWebElement.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	BasePage basepage;
	WebDriver driver;
	public BasePage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[normalize-space()='Elements']")
	WebElement elementtab;
	
	public ElementsPage clickonElementSection() {
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(20));
		wt.until(ExpectedConditions.elementToBeClickable(elementtab)).click();
		ElementsPage elementpage=new ElementsPage(driver);
		return elementpage;
	}
	
	public void scrollpage() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void openURL() {
		driver.get("https://demoqa.com/");
	}
	
	

}
