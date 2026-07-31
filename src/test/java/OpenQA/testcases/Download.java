// down load file and confirm 
package OpenQA.testcases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Download {
		 public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new ChromeDriver();
		        driver.get("https://demoqa.com/upload-download");
		        driver.manage().window().maximize();
		        driver.findElement(By.id("downloadButton")).click();
		        Thread.sleep(5000);
		        File file = new File("C:\\Users\\admin\\Downloads\\sampleFile.jpeg");
		        Assert.assertTrue(file.exists(), "File not downloaded!");
	}

}
