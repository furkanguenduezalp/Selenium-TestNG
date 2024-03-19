package com.cybertek.tests.day4_basics_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {
    //ID is unique all the time. If ID static is, we can use it. But if it is dynamic, we CANNOT use it.
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));
        dontClickButton.click();

        //driver.quit();
    }
}
