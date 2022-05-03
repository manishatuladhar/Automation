package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChangeDate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Datepicker/index.html");

        WebElement changedate = driver.findElement(By.className("/html/body/div[2]"));
        changedate.click();






    }



    }


