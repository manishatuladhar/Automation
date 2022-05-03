package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownwork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html&quot");

                Select dropdownItems = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        Thread.sleep(3000);
        dropdownItems.selectByIndex(2);


    }
}
