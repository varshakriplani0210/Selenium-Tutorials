package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selniumtutorial5 {
    public static void main(String[] args) {
        //Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URl
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Max the window
        driver.manage().window().maximize();

        //Enter valid username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //enter valid password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        //click on login
        driver.findElement(By.id("btnLogin")).click();

        //Verify the URL
        //getCurrentURL()
        String act_url=driver.getCurrentUrl();
        System.out.println(act_url);
        //verify
        String desired_url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        if (act_url.equals(desired_url))
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

        //Verify Title
        //getTitle()
        String act_title=driver.getTitle();
        System.out.println(act_title);
        String desired_title="OrangeHRM";
        //verify
        if(act_title.equals(desired_title))
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        String ps=driver.getPageSource();
        System.out.println(ps);
        //close the browser
        driver.close();







    }
}
