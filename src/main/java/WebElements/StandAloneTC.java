package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StandAloneTC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Elements']"))).click();		
		String actual_Text = driver.findElement(By.xpath("//div[contains(text(),'Please select an item from left to start practice.')]")).getText();
		System.out.println(actual_Text);
        if(actual_Text.equalsIgnoreCase("Please select an item from left to start practice.")) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Fail");
        }
	}
}
