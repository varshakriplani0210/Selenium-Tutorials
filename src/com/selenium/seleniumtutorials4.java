//In this tutorial using the TagName as a Selenium Locator to inspect
//multiple elements on the web page.
//Here we are navigated to www.google.com to find the no. of links on this page
// also we have found the link texts by for loop.

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorials4 {
    public static void main(String[] args) {
        //Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("https://www.google.com/");

        //By TagName
        List<WebElement> link=driver.findElements(By.tagName("aR"));
        System.out.println(link.size());//27

        //name of links
        for (WebElement l : link)
        {
            System.out.println(l.getText());
        }


    }
}
