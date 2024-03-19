package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class verifyConfirmationMessage {

    /*Verify confirmation message
    -open chrome browser
    -go to https://practice.cydeo.com/forgot_password Links to an external site.
    -enter any email
    -verify that email is displayed in the input box
    -click on Retrieve password
    -verify that confirmation message says 'Your e-mail's been sent!'
    */

    public static void main(String[] args) {

        //open chrome browser and go to https://practice.cydeo.com/forgot_password
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));
        String expectedEmail = "mike@smith.com";
        //sendKeys()--> send keyboard action to the webelement
        emailInputBox.sendKeys(expectedEmail);

        //two main ways to get text from webelements
        //1.getText()--> it will work %99 and it will return string (it will not work for input box)
        //2.getAttribute("value") --> second way of getting text especially input boxes
        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        //verify that email is displayed in the input box
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedMessage = "Your e-mail's been sent!";

        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));
        String actualMessage = actualConfirmationMessage.getText();
        System.out.println(actualMessage);

        //verify that confirmation message says 'Your e-mail's been sent!'
        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        driver.quit();


    }
}
