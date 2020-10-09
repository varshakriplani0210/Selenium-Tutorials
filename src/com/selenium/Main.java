package com.selenium;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {

    public static void main(String[] args) {
  //chrome browser----->chromedriver
        //1.OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver","D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver1= new ChromeDriver();

        //2.NAVIGATE TO THE URL
        driver1.get("https://www.google.com");

        //3.close the browser
        driver1.close();

        //1.OPEN THE FIREFOX BROWSER
        System.setProperty("webdriver.gecko.driver","D://selenium jars and drivers//drivers//firefoxdriver/geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        FirefoxDriver dr1=new FirefoxDriver();
        ChromeDriver DR2=new ChromeDriver();

        //2.NAVIGATE TO THE URL
        driver.get("https://www.google.com");

        //3.close the browser
        driver.close();






    }
}

