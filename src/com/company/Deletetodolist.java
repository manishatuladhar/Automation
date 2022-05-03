package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Deletetodolist {

    public static void main(String[] args) throws InterruptedException {
        String [] tasks = {"Cooking", "Traveling", "Driving","Painting","Cleaning", "Fishing","Reading", "Learning","Grocery","Shopping"};
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://webdriveruniversity.com/To-Do-List/index.html";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement l = driver.findElement(By.className("fa fa-trash"));
        l.sendKeys("Selenium");

        String s = Keys.chord(Keys.CONTROL, "a");
        l.sendKeys(s);

        l.sendKeys(Keys.DELETE);
        driver.quit();
    }
}







