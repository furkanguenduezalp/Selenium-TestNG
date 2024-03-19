package com.cybertek.tests.day4_basics_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkTextandPartialLinkText {
    //href
    //linkText ---> using full text of linktext to locate the webelement
    //partialLinkText --> using part of the linktext to locate the webelement
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dynamic_loading");

        WebElement link1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        //link1.click();

        WebElement link4 = driver.findElement(By.partialLinkText("Example 4"));
        link4.click();

    }

}
