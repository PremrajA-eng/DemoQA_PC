package OpenQA.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        // Step 1: Get parent window ID
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);

        // Step 2: Click button to open new window
        driver.findElement(By.id("windowButton")).click();

        Thread.sleep(2000);

        // Step 3: Get all window IDs
        Set<String> allWindows = driver.getWindowHandles();

        // Step 4: Switch to new window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);

                // Step 5: Perform action in new window
                String text = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("New Window Text: " + text);

                // Close new window
                driver.close();
            }
        }

        // Step 6: Switch back to parent window
        driver.switchTo().window(parentWindow);

        System.out.println("Back to Parent Window");

        driver.quit();
    }
}