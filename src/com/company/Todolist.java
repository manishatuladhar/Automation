package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todolist {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://mdn.github.io/todo-react-build/");

        WebElement googlebox = driver.findElement(By.id("new-todo-input"));
        googlebox.sendKeys("Learn Selenium");


        WebElement add = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/button"));
        add.sendKeys("Learn Selenium");
        add.submit();
    }
}

