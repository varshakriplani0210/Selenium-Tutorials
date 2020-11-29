package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorials8 {
    public static void main(String[] args) {
        //Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URl
        driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");

        //Max the window
        driver.manage().window().maximize();

        //Xpath Axes
        //self node
        driver.findElement(By.xpath("//input[@id='company']/self::input")).sendKeys("ABC");

//        //Parent node
//        String parent=driver.findElement(By.xpath("//input[@id='company']/parent::*")).getText();
//        System.out.println("The parent value is -- "+parent);

        //child nodes
        List<WebElement> childnodes=driver.findElements(By.xpath("//input[@id='company']/parent::form/child::*"));
        System.out.println("The no of child nodes are--" +childnodes.size());

        //following nodes
        List<WebElement> foll=driver.findElements(By.xpath("//input[@id='company']/following::*"));
        System.out.println("The no of following nodes are-- "+foll.size());

        //preceding
        List<WebElement> pre=driver.findElements(By.xpath("//input[@id='company']/preceding::*"));
        System.out.println("The no of precedings are--"+pre.size());

        //foll-siblings
        List<WebElement> follsib=driver.findElements(By.xpath("//input[@id='company']/following-sibling::*"));
        System.out.println("The no of following siblings are -- "+follsib.size());

        //preceding siblings
        List<WebElement> presib=driver.findElements(By.xpath("//input[@id='company']/preceding-sibling::*"));
        System.out.println("The no of preceding siblings are -- "+presib.size());
    }
}
