package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        List<WebElement> images = driver.findElements(By.xpath("//img[@src]"));
        System.out.println("Total images: " + images.size());

        for (WebElement img : images) {
            String src = img.getAttribute("src");
            if (src == null || src.isEmpty()) continue;

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(src).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int statusCode = connection.getResponseCode();

                // Extra checks beyond isDisplayed()
                int width = img.getSize().getWidth();
                int height = img.getSize().getHeight();
                boolean visible = img.isDisplayed();

                if (statusCode == 200 && visible && width >= 32 && height >= 32) {
                    System.out.println("✅ Valid Image: " + src + " | " + width + "x" + height);
                } else {
                    System.out.println("❌ Broken/Invalid Image: " + src + " | " + width + "x" + height);
                }
            } catch (Exception e) {
                System.out.println("⚠️ Exception for Image: " + src + " | " + e.getMessage());
            }
        }
        driver.quit();
    }
}