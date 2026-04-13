package qaWebElement.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage{

	
	WebDriver driver;
	
	   public CheckBoxPage(WebDriver driver) {
		super(driver);
		this.driver=driver;	   
		PageFactory.initElements(driver, this);
	}
	   
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	   
	   @FindBy(xpath="//h1[normalize-space()='Check Box']")
        WebElement confcheckBox;
	   
	   @FindBy(xpath="//button[@title='Toggle']//*[name()='svg']")
	   WebElement expandbtn;
	   
	   @FindBy(xpath="//label[@for='tree-node-home']//span[@class='rct-checkbox']")
	   WebElement clkOnChkBox;
	   
	   @FindBy(xpath="//span[normalize-space()='home']")
	   WebElement confselect;
	   
	   @FindBy(css = "span.rct-checkbox > input[type='checkbox']")
	  List <WebElement> allchkBox;
	 
	   
	   public String ConfirmCheckBoxPage() {
		   
		   String actual_text=confcheckBox.getText();
		   return actual_text;		  		   
	   }
	   	   	   
	   public String clickonchkBox() {
		   expandbtn.click();
		   clkOnChkBox.click();
		  String UhaveSelected= confselect.getText();
		   return UhaveSelected;
	   }
	   
	   public void clickOnAllBoxes() throws InterruptedException {

           for (WebElement cb : allchkBox) {
               // If it's not selected, click it
               if (!cb.isSelected()) {
                   // scroll into view and click
                   js.executeScript("arguments[0].scrollIntoView(true);", cb);
                   wait.until(ExpectedConditions.elementToBeClickable(cb));
                   cb.click();
                   // optionally: small pause
                   Thread.sleep(200);
               }		   
	   }
	      	   	  
}
}