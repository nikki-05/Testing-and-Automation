package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\nikita.tiwari\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

        {

            System.out.println("its enabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);

        }


    }
}
