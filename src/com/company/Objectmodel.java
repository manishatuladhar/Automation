package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Objectmodel {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Page-Object-Model/products.html#");


        WebElement button = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        button.click();











    }
}

