package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.SortedMap;

public class seleniumtutorials13 {
    public static void main(String[] args) throws InterruptedException {
        //1.Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2.Open the URl
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //max
        driver.manage().window().maximize();

        //Enter username and password
        driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //clear the username and password
        Thread.sleep(5000);
        driver.findElement(By.id("txtUsername")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("txtPassword")).clear();

        //submit
        driver.findElement(By.xpath("//input[@value='LOGIN']")).submit();

        //gettext()
       String gettext= driver.findElement(By.linkText("Forgot your password?")).getText();
        System.out.println("The text is "+gettext);

        //getLocation()
        WebElement element=driver.findElement(By.id("txtUsername"));
        Point point=element.getLocation();
        System.out.println("X cordinates" +point.x);
        System.out.println("Y cordinates "+point.y);

        //getsize
       WebElement element1= driver.findElement(By.id("txtUsername"));
       Dimension dim=element1.getSize();
        System.out.println("Height is "+dim.height);
        System.out.println("Width is "+dim.width);

        //getTagname

        String gettagname=driver.findElement(By.id("txtUsername")).getTagName();

        System.out.println(gettagname);

        //to print the no of links on the page
       List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //check if the login button is displayed on the page
        Boolean bool1=driver.findElement(By.xpath("//input[@value='LOGIN']")).isDisplayed();//T
        System.out.println(bool1);

        //Check if the login button is enabled
        Boolean bool2=driver.findElement(By.xpath("//input[@value='LOGIN']")).isEnabled();//T
        System.out.println(bool2);

        //Check if the login button is selected or not
        Boolean bool3=driver.findElement(By.xpath("//input[@value='LOGIN']")).isSelected();//F
        System.out.println(bool3);


    }
}
