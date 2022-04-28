package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginportal {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        WebElement username  = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("admin");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        button.click();






    }
}

