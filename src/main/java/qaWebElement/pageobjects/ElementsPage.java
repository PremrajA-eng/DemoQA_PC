package qaWebElement.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
   WebDriver driver;
   public ElementsPage(WebDriver driver) {
	this.driver=driver;	   
	PageFactory.initElements(driver, this);
}
   @FindBy(xpath="//div[contains(text(),'Please select an item from left to start practice.')]")
   WebElement Actualtext;
   @FindBy(xpath="//span[normalize-space()='Text Box']")
   WebElement textBox;
   
   @FindBy(xpath="//span[normalize-space()='Check Box']")
   WebElement checkBox;
   
   public String confirmYouLaunchOnElementPage() {
	  // String actual_Text = driver.findElement(By.xpath("//div[contains(text(),'Please select an item from left to start practice.')]")).getText();	
         String actual_Tect=Actualtext.getText();
	   return actual_Tect;         
   }
   public TextBoxPage checkTextBoxElement() {
	   textBox.click();
	   TextBoxPage txtbox= new TextBoxPage(driver);
	   return txtbox;
   }
   
   public CheckBoxPage check_Box() {
	   checkBox.click();
	   CheckBoxPage chkbox= new CheckBoxPage(driver);
	   return chkbox;
   
}}
