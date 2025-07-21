package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assign1 {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\nikita.tiwari\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        if(!driver.findElement(By.id("checkBoxOption1")).isSelected()){
            driver.findElement(By.id("checkBoxOption1")).click();
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected(),"Checkbox must be selected");

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }

}
