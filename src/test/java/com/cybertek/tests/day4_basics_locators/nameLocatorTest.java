package com.cybertek.tests.day4_basics_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {
        //NAME locator is not dynamic %99.99 time. But NAME can be duplicate.(radio buttons)
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen. fullscreen() doesn't work on Mac
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/sign_up");


        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //put some email and click sign up button
        //lazy way
        driver.findElement(By.name("email")).sendKeys("mike@smith.com");
        driver.findElement(By.name("wooden_spoon")).click();

    }
}
