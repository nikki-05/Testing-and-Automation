import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selIntroduction {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\nikita.tiwari\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys("Nikko");
        driver.findElement(By.name("inputPasswords")).sendKeys("hello1234");
        driver.findElement(By.className("signInbtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Harshi");


    }


}
