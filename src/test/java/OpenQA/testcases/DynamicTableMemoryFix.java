package OpenQA.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableMemoryFix {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String firstname = "premraj";
		driver.findElement(By.id("addNewRecordButton")).click();

		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys("Aru");
		driver.findElement(By.id("userEmail")).sendKeys("arupremraj@gmail.com");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("salary")).sendKeys("500000");
		driver.findElement(By.id("department")).sendKeys("Testing");

		driver.findElement(By.id("submit")).click();

		List<WebElement> rowCount = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

		for (int i = 0; i <= rowCount.size(); i++) {

			System.out.println(rowCount.get(i).getText());
			
			System.out.println("hello world"+ firstname +"india");
		}

	}
}