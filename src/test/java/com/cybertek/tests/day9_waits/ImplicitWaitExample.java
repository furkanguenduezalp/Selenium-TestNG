package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/dynamic_loading/4");

        //How findelement methods work?
        //IF elment does not found:
        //1.it will check do we have implicitly wait set?
        //-if its yes, it will keep trying to find element up to time we set
        //-if it finds within the time, it will return the element and don't wait more. otherwise throw NoSuchElementException
        //2.if there is no impicitly wait set, it will throw NoSuchElementException
        //this is wait come from selenium, it only works when we call findElement method.
        //implicitlyWait only waits until the element located
        //implicitlyWait is set once, then it isued by rest of the program.
        //If we have many findElement methods, they will all use the same implicitlyWait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //this element is not in the html until 5 seconds pass.
        WebElement element = driver.findElement(By.cssSelector("#finish"));
        System.out.println(element.getText());


    }
}
