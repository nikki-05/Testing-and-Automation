package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\nikita.tiwari\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@value='Bengaluru (BLR)']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//input[contains(@value, 'MAA')]"));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Click on 'From'
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid='to-testID-origin'] input.css-1cwyjr8"))).sendKeys("BLR");

        // Wait and click on 'Bengaluru (BLR)'
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Bengaluru (BLR)')]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Bengaluru (BLR)')]"))).click();
        // Similarly select destination:
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='to-testID-destination']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='station-MAA']"))).click();

        driver.quit();

    }
}
