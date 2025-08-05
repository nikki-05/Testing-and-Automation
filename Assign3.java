package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assign3 {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\nikita.tiwari\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("nikita");

        //password
        driver.findElement(By.id("password")).sendKeys("123Password");


        //radio button to selct user from admin an user
        WebElement radiouser = driver.findElement(By.id("usertype"));
        radiouser.click();
        Assert.assertTrue(radiouser.isSelected(), "Checking if user is selected");

        WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select s = new Select(dropdown);
        s.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();


        List <WebElement> products= driver.findElements(By.className("card-body"));
        for(WebElement p: products){
            WebElement cartbutton= p.findElement(By.xpath(".//button[contains(text(),'Add')]"));
            cartbutton.click();
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(normalize-space(),'Checkout')]")
        ));


    }
}