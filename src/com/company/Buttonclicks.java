package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Buttonclicks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        button.click();

        WebElement button2 = driver.findElement(By.cssSelector("span#button2"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("button2.click();");













    }
}

