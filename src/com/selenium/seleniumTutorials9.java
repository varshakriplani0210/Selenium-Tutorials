package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTutorials9 {
    public static void main(String[] args) {
        //Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URl
        driver.get("https://books-pwakit.appspot.com/");

        //Max the window
        driver.manage().window().maximize();

        //host
        WebElement host=driver.findElement(By.tagName("book-app"));

        //shadow dom
        JavascriptExecutor j=(JavascriptExecutor) driver;
        WebElement shadowdom= (WebElement) j.executeScript("return arguments[0].shadowRoot",host);


        //app-header
        WebElement appheader=shadowdom.findElement(By.tagName("app-header"));

        //app-toolbar
        WebElement apptool=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

        //book-input
        WebElement book=apptool.findElement(By.tagName("book-input-decorator"));

        //Input
        book.findElement(By.cssSelector("input#input")).sendKeys("selenium Webdriver");

    }
    }

