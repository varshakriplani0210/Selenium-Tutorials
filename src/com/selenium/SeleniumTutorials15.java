package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumTutorials15 {
    public static void main(String[] args)  {
        //1.Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open the URL
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        //max
        driver.manage().window().maximize();

        //Select Class
        Select selectelement=new Select(driver.findElement(By.xpath("//div//div//div[1]//div[2]//select[1]")));
        //Or
//        WebElement dropdown=driver.findElement(By.xpath("//div//div//div[1]//div[2]//select[1]"));
//        Select selectelement=new Select(dropdown);

        //Find the options present in the dropdown menu
       List<WebElement> options =selectelement.getOptions();
        System.out.println(options.size());

        //print
        for (WebElement e:options)
        {
            System.out.println("The values are "+e.getText());
        }

        //Select the options
        //selectbyvalue
//        selectelement.selectByValue("Friday");
        //Selectbyindex
//        selectelement.selectByIndex(3);
       //SelectByVisibleText()
        selectelement.selectByVisibleText("Monday");

        //ismultiple()
        Boolean bool1=selectelement.isMultiple();

        System.out.println(bool1);

        selectelement.deselectByVisibleText("Monday");




     
    }
}
