package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    /*
    go to amazon.com
    search for selenium
    click search button
    verify 1-48 of 304 results for "selenium

     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress']"));
        inputBox.sendKeys("selenium");

        driver.findElement(By.xpath("//input[@value='Los']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(), 'Ergebnissen')]"));
        String resultText = result.getText();
        System.out.println("resultText = " + resultText);

    }

}
