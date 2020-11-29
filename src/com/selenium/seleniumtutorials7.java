package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorials7 {
    public static void main(String[] args) {
        //Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to the URl
        driver.get("https://money.rediff.com/gainers");

        //Max the window
        driver.manage().window().maximize();

        //Xpath axes
        //self node
        String selfnode=driver.findElement(By.xpath("//a[contains(.,'Raj Television Netwo')]/self::a")).getText();
        System.out.println("The self node is "+selfnode);

        //parent node
        String parentnode=driver.findElement(By.xpath("//a[contains(.,'Raj Television Netwo')]/parent::td")).getText();
        System.out.println("The parent node is "+parentnode);

        //child nodes
        List<WebElement> childnode=driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/ancestor::tr/child::*"));
        System.out.println("The no of child nodes are "+childnode.size());

        //Ancestor Node
        String ancestornode=driver.findElement(By.xpath("//a[contains(.,'Raj Television Netwo')]/ancestor::tr")).getText();
        System.out.println("The ancestor node is "+ancestornode);

        //Following
        List<WebElement> followingtag=driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/following::*"));
        System.out.println("The no of following elements from the current HTML tag is "+followingtag.size());

        //following-siblings
        List<WebElement> followingsib=driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/ancestor::tr/following-sibling::*"));
        System.out.println("The following siblings are "+followingsib.size());

        //preceding
        List<WebElement> pre=driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/preceding::*"));
        System.out.println("The no of preceding nodes are- "+pre.size());

        //preceding siblings
        List<WebElement> presiblings=driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("The no of preceding siblings are - "+presiblings.size());




        driver.close();




    }
}
