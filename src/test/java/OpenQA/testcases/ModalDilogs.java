package OpenQA.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDilogs {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("showSmallModal")).click();
        Thread.sleep(1000);
   String PopupHeading=driver.findElement(By.xpath("//div[text()='Small Modal']")).getText();
        if(PopupHeading.contains("Small Modal")) {
        	System.out.println("its open");
        }
        
        driver.findElement(By.id("closeSmallModal")).click();
	}

}
