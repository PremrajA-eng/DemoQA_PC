package OpenQA.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement slider = driver.findElement(By.id("slider"));

        // Pass any value here 👇
        setSliderValue(driver, slider, "75");

        Thread.sleep(2000);

        // Verify value
        WebElement value = driver.findElement(By.id("sliderValue"));
        System.out.println("Slider value is: " + value.getAttribute("value"));

        driver.quit();
    }

    // Reusable method
    public static void setSliderValue(WebDriver driver, WebElement slider, String value) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].value='" + value + "';" +
            "arguments[0].dispatchEvent(new Event('input'));" +
            "arguments[0].dispatchEvent(new Event('change'));",
            slider
        );
    }
}