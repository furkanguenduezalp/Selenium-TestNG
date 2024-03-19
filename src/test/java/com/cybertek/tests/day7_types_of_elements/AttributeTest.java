package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void test1(){
        //get text of the web element
        //1-getText()
        //2-getAttribute("value") for inputboxes
        //3-getAttribute("innerHTML") --> it will work certain cases
        //4-getATtribute("outerHTML") --> maniulate and verify

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.id("blue"));

        blueRadioBtn.getAttribute("value");

        //get the value of type attribute
        System.out.println(blueRadioBtn.getAttribute("type"));
        //get the value of name attribute
        System.out.println(blueRadioBtn.getAttribute("name"));
        //since checked attribute does not keep any value, it will return true or false based on the condition
        System.out.println(blueRadioBtn.getAttribute("checked"));

        //trying to get attribute that does not exist
        //when we use not exist attribute it will return null to us
        System.out.println(blueRadioBtn.getAttribute("href"));

        //outherHTML returns full html of that element
        System.out.println(blueRadioBtn.getAttribute("outerHTML"));

        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));

        System.out.println(button2.getAttribute("outerHTML"));
        String outerHTML = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHTML.contains("Button 2"));

        System.out.println("Inner HTML: " + button2.getAttribute("innerHTML"));

        driver.quit();

    }
}
