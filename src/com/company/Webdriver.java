package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webdriver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");


       WebElement firstname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
        firstname.sendKeys("Manisha");

        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
        lastname.sendKeys("Tuladhar");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
        email.sendKeys("manisha.tuladhar@gmail.com");

        WebElement comment = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
        comment.sendKeys("Hello");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        button.click();











    }
}
