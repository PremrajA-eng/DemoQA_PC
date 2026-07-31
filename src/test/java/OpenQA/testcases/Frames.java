// frames
package OpenQA.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/frames");
	        driver.manage().window().maximize();	        
	      driver.switchTo().frame("frame1");
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.switchTo().frame("frame2");
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());

}
}