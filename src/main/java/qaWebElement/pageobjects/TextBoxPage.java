package qaWebElement.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage{
	WebDriver driver;
	   public TextBoxPage(WebDriver driver) {
		super(driver);
		this.driver=driver;	   
		PageFactory.initElements(driver, this);
	}
	   @FindBy(xpath="//h1[normalize-space()='Text Box']")
        WebElement conftxtboxpage;
	   
	   @FindBy(xpath="//input[@id='userName']")
	   WebElement FullName;
	   
	   @FindBy(xpath="//input[@id='userEmail']")
	   WebElement email;
	   
	   @FindBy(xpath="//textarea[@id='currentAddress']")
	   WebElement currentAddress;
	   
	   @FindBy(xpath="//textarea[@id='permanentAddress']")
	   WebElement perAddress;
	   
	   @FindBy(xpath="//button[@id='submit']")
	   WebElement submit;
	   
	   @FindBy(xpath = "//p[@id='name']")
	   WebElement submitName;
	      
	   
	   public String confirmTextBoxPage() {
		   String actualtext_textbox=conftxtboxpage.getText();
		   return actualtext_textbox;
	   }
	   
	   public void fillUserDetail() throws InterruptedException {
		   FullName.sendKeys("Jadugar shankar");
		   email.sendKeys("asdsad@gmail.com");
		   currentAddress.sendKeys("pune maharastra");
		   perAddress.sendKeys("mumbai");
		   scrollpage();
		   submit.click();	
		    
	   }
	   public boolean confirmFillDetailSubmitted(){
		   if(submitName.getText().contains("Jadugar shankar")) {
			   return true;
		   }
		   return false;
		   
	   }
}
