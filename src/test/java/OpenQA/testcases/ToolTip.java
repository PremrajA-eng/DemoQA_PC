package OpenQA.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement tooltipElement=driver.findElement(By.xpath("//a[normalize-space()='Contrary']"));
	 Actions action = new Actions(driver);
	 
	 action.moveToElement(tooltipElement).perform();
	 Thread.sleep(2000);
	  WebElement tooltipText = driver.findElement(By.className("tooltip-inner"));
	 String actualTooltip = tooltipText.getText();
     String expectedTooltip = "You hovered over the Contrary";

     // Verification
     if (actualTooltip.equals(expectedTooltip)) {
         System.out.println("Tooltip verified: " + actualTooltip);
     } else {
         System.out.println("Tooltip mismatch. Found: " + actualTooltip);
     }
	
	}}

