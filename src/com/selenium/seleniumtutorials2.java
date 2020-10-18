// In this tutorial we will learn about the selenium Locators
//Here we are locating by ID,NAME,CLASSNAME

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorials2 {
    public static void main(String[] args) {
        //Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://automationpractice.com/index.php");

        //[By Id]
        driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
        //OR
        WebElement search=driver.findElement(By.id("search_query_top"));
        search.sendKeys("T-Shirts");

        //[By Name]
        driver.findElement(By.name("search_qu")).sendKeys("Shirts");

        //[By Class]
       driver.findElement(By.className("search_query form-control ac_input")).sendKeys("Shirts");





    }
}
