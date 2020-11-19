package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorials6 {
    public static void main(String[] args) {
        //Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URl
        driver.get("https://www.ebay.com/");

        //Max the window
        driver.manage().window().maximize();

        //Absolute Xpath
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirts");
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

        //Relative Xpath
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts for men");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        //or operator
       driver.findElement(By.xpath("//input[@id='gh-ac'or @name='_nkw']")).sendKeys("Shirts for men");


        //and operator
        driver.findElement(By.xpath("//input[@id='gh-ac'and @name='_nkw']")).sendKeys("Shirts for women");


        //contains method
        driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("Shirts for kids");

       //starts-with
       driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("Tshirts for kids");

        //text()
        driver.findElement(By.xpath("//a[text()=' Sell']")).click();




    }
}
