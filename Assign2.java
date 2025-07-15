package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assign2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\nikita.tiwari\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        Thread.sleep(1000);
        //name
        driver.findElement(By.name("name")).sendKeys("Nikita");
        Thread.sleep(1000);
        //email
        driver.findElement(By.name("email")).sendKeys(("nikitaexample@gmail.com"));
        Thread.sleep(1000);
        //password
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456878");


        //chckbox click if you love ice creams
        WebElement checkBox = driver.findElement(By.id("exampleCheck1"));
        checkBox.click();
        Assert.assertTrue(checkBox.isEnabled(), "Checkbox is not enabled");
        Thread.sleep(1000);

        //select gender
        WebElement gender= driver.findElement(By.id("exampleFormControlSelect1"));
        Assert.assertTrue(gender.isDisplayed(), "Dropdown is not visible");

        Select s = new Select(gender);
        s.selectByVisibleText("Female");

        Thread.sleep(1000);
        //radio button student
        WebElement student = driver.findElement(By.id("inlineRadio1"));
        Assert.assertTrue(student.isDisplayed(), "Student radio button is not visible");
        Assert.assertTrue(student.isEnabled(), "Student radio button is not enabled");

        student.click();
        Assert.assertTrue(student.isSelected(), "Student radio button was not selected");
        Thread.sleep(1000);

       //calender date
        WebElement dobField = driver.findElement(By.name("bday"));
        dobField.sendKeys("2003-03-16");
        Thread.sleep(1000);
        //submit button
       driver.findElement(By.cssSelector("input[type='submit']")).click();

       
       driver.quit();


    }
}
