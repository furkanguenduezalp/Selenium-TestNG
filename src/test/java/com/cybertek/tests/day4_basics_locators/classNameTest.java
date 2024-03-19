package com.cybertek.tests.day4_basics_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {
    //if there is a space in classname attribute value, we cannot use that locator
    //we will use it later to locate multiple elements in one shot.
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/sign_up");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("https://practice.cydeo.com/multiple_buttons");
        System.out.println(driver.findElement(By.className("h3")).getText());

    }
}
