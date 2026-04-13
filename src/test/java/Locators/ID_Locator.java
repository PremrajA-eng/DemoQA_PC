package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		String TypeColor="Red";
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();
		WebElement options= driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']"));
		options.sendKeys(TypeColor);
		Thread.sleep(3000);
		List <WebElement> colors=driver.findElements(By.xpath("//div[contains(@class,'auto-complete__option')]"));
		 //Second option -- react-select-2  
		for(WebElement OneByOneColor: colors) {
			System.out.println(OneByOneColor.getText());
			
			if(OneByOneColor.getText().equalsIgnoreCase(TypeColor)) {
				OneByOneColor.click();			
			
			}		
		}
	}
}
