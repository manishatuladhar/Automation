package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Buttonclicks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement webelementclick = driver.findElement(By.xpath("/html/body"));
        webelementclick.sendKeys("");

        WebElement click = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        webelementclick.sendKeys("");








    }
}

