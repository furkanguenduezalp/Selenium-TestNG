package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement greenRadiobtn = driver.findElement(By.id("green"));

        //how to check any web element is enabled or not?
        System.out.println("greenRadiobtn.isEnabled() = " + greenRadiobtn.isEnabled());
        Assert.assertFalse(greenRadiobtn.isEnabled(), "verify green radio button NOT enabled");

        greenRadiobtn.click();
    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));
        inputBox.sendKeys("some message");

    }

}
