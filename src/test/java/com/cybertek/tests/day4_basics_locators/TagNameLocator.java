package com.cybertek.tests.day4_basics_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocator {
    //if we cannot find name or id, we look for tagName
    //we can use tagName based on two conditions:
    //1-tag should be used only one time
    //2-there are multipe same tags, but you want to point the first tag.
    //these two conditions valid for other Locators as well.
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith With TagName");

        driver.findElement(By.name("email")).sendKeys("mike@smith.com");
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
