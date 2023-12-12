package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCryptoInfo {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/17074/Downloads/chromedriver-win64/chromedriver-win64.exe");

        // Start the Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open the React app
            driver.get("http://localhost:3000");

            // Wait for the Crypto Information to be loaded (you may need to adjust this)
            Thread.sleep(2000);

            // Find elements by their tags, IDs, or other attributes
            WebElement h1Element = driver.findElement(By.tagName("h1"));
            WebElement h2Element = driver.findElement(By.tagName("h2"));
            WebElement pElement = driver.findElement(By.tagName("p"));

            // Assert the expected content
            assert h1Element.getText().equals("Crypto Information");
            assert pElement.getText().contains("Current Price:");

            // Print the information
            System.out.println(h2Element.getText() + " - " + pElement.getText());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
