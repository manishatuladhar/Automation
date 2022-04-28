package com.company;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finditem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item you want to find : ");
        String userinput = sc.nextLine();

        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bombaycurrync.com/menu\n");

        WebElement googleBox = driver.findElement(By.name("elementor-price-list-title"));
        googleBox.sendKeys("momo");
        googleBox.submit();

    }
}
