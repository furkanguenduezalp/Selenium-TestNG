package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

    /*Verify URL changed
    -open chrome browser
    -go to https://practice.cydeo.com/forgot_password Links to an external site.
    -enter any email
    -click on Retrieve password
    -verify that url changed to https://practice.cydeo.com/email_sent
    */

    public static void main(String[] args) {

        //open chrome browser an go to "https://practice.cydeo.com/forgot_password"
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys()--> send keyboard action to the webelement
        emailInputBox.sendKeys("mike@smith.com");

        //click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //-verify that url changed to https://practice.cydeo.com/email_sent
        String expectedUrl = "https://practice.cydeo.com/email_sent";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }

        driver.quit();


    }
}
