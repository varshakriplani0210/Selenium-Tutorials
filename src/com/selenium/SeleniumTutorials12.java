package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorials12 {
    public static void main(String[] args) throws InterruptedException {
        //1.Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       //Navigate to the page
        driver.navigate().to("https://wordpress.com/");

        //max
        driver.manage().window().maximize();

        //click on get start
        driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).click();

        //back
        Thread.sleep(5000);
        driver.navigate().back();

        //forward
        Thread.sleep(5000);
        driver.navigate().forward();

        //refresh
        Thread.sleep(5000);
        driver.navigate().refresh();

        //close the browser
        Thread.sleep(6000);
        driver.close();


    }
}
