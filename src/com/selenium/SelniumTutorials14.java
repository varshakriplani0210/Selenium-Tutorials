package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SelniumTutorials14 {
    public static void main(String[] args) throws InterruptedException {
        //1.Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open the URL
        driver.get("https://demoqa.com/browser-windows");

        //max
        driver.manage().window().maximize();

        //print parent window handle
        String parentwindowhandle=driver.getWindowHandle();
        System.out.println("the parent window handle is "+parentwindowhandle);

        //click 3 times
       for(int i=1;i<=3;i++)
       {
           driver.findElement(By.xpath("//button[normalize-space()='New Window']")).click();
           Thread.sleep(3000);
       }
       //print the window handles
        Set<String> windowhandles=driver.getWindowHandles();
       String lastwindowhandle= "";
    for (String handle:windowhandles)
    {
       System.out.println("The window handles are "+handle);
        //switching
        System.out.println("Switching windows "+handle);
        Thread.sleep(2000);
        driver.switchTo().window(handle);
        //Navigating to the google
        Thread.sleep(3000);
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }
    //close parent window first
        Thread.sleep(2000);
   driver.switchTo().window(parentwindowhandle);
    driver.close();
    //switch to the other windows
        Thread.sleep(2000);
        driver.switchTo().window(lastwindowhandle);
        Thread.sleep(2000);
        driver.quit();






    }
}
