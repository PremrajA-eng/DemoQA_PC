package OpenQA.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

      
        driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'indicatorContainer')]")).click();

        Thread.sleep(2000); // wait for options to load

       
        List<WebElement> options = driver.findElements(
                By.xpath("//div[@id='react-select-2-listbox']//div[contains(@class,'option')]")
        );
      
        for (WebElement option : options) {

            if (option.getText().equals("Group 1, option 1")) {
                option.click();
                break;
            }
    
        }
        
        driver.findElement(By.xpath("(//div[@class='css-1xc3v61-indicatorContainer'])[1]")).click();
        List<WebElement> SecOption=driver.findElements(By.xpath("//div[contains(@id,'react-select') and contains(@id,'listbox')]//div[contains(@class,'option')]"));
        for (WebElement SecOp : SecOption)
        {
        	
        	if (SecOp.getText().equals("Mr.")) {
        		SecOp.click();
                break;
      }
        
        	//WebElement dropOption= driver.findElement(By.xpath("oldSelectMenu"));
        WebElement selectDrop =driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectDrop);
        select.selectByIndex(5);
    }
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Select...']")).click();

        List<WebElement> listOptions = driver.findElements(
                By.xpath("//div[contains(@class,'menu')]//div[contains(@class,'option')]"));

        for (WebElement op : listOptions) {
            if (op.getText().equals("Black")) {
                op.click();
                break;
            }
        }
}}