package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {
 /*
    /html/body/div/div[2]/div/div/button[3]         index number starts from 1
    //                                              find any button
    //li/a:                                         find li element on the page and get the child a
    //le/button[2]                                  [] is just for siblings and can be use index for any custom locators
    //div//a:                                       find div on the page and find a under this div

    //TagName[@attribute='value']
    //TagName[@*='value']                           *: any attribute
    //*[@attribute='value']
    //*[@*='value']

                                                    linktext formulas:
    //TagName[text()='exact text']                  text() is keyword for looking exact text. Space sensitive.
    //TagName[.='exact text']                       . is Symbol for looking exact text
    //*[text()='Button1']
    //TagName[contains(text(),'partial text')]
    //*[contains(text(),'partial text')][2]

    //TagName[starts-with(@Attribute,'value')]      for dynamic IDs with static part
    //TagName[ends-with(@Attribute,'value')]        ends-with don't work on chrome
    //TagName[contains(@Attribute,'value')]

    //TagName[@attribute='value']/p                 combine the formulas: find parent and move to child
    //TagName[@attribute='value']/div[1]/p

    (xpath formula)[2]                              for the not siblings as well

    //TagName[@attribute1='value1' and @attribute2='value2'] with or without space between
    //TagName[@attribute1='value1'][@attribute2='value2']
    //TagName[@attribute1='value1' or @attribute2='value2']

    //TagName[@attribute='value']/parent::TagName   find a child and move to parent or sibling
    //TagName[@attribute='value']/parent::*
    //TagName[@attribute='value']/following-sibling::TagName
    //TagName[@attribute='value']/preceding-sibling::TagName
    //TagName[@attribute='value']/../..             .. move us to one level up





  */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        button2.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
