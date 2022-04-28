package com.company;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Alibaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item you want to find : ");
        String userinput = sc.nextLine();

        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alibaba.com/");

        WebElement googleBox = driver.findElement(By.id("beacon-aplus"));
        googleBox.sendKeys("tea set");
        googleBox.submit();

    }
}
