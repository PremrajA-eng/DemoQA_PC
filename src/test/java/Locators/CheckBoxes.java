package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/checkbox");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//span[@class=\"rc-tree-switcher rc-tree-switcher_close\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[@aria-label='Select Desktop']/preceding-sibling::span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
	        driver.findElement(By.xpath("//span[@aria-label='Select Documents']/preceding-sibling::span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
	        driver.findElement(By.xpath("//span[@aria-label='Select Downloads']/preceding-sibling::span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
	        driver.findElement(By.xpath("//span[@aria-label='Select WorkSpace']/preceding-sibling::span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
	        driver.findElement(By.xpath("//span[@aria-label='Select Office']/preceding-sibling::span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
	        driver.findElement(By.xpath("//span[@aria-label='Select Home']")).click();	        
	        driver.findElement(By.xpath("//span[@aria-label='Select Angular']")).click();	        
	       System.out.println(driver.findElement(By.xpath("//span[@aria-label='Select Angular']")).isSelected());
	        
	}

}
