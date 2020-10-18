// In this tutorial we will learn about LinkText and Partial LinkText
//LinkText and Partial LinkText is used to click on links on the web page.


package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial3 {
    public static void main(String[] args) {
        //Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");


        //[By LinkText]
       driver.findElement(By.linkText("Printed Chiffon Dress")).click();

        //[By Partial LinkText]
        driver.findElement(By.partialLinkText("Chiffon Dress")).click();
    }
}
