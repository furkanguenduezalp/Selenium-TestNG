package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactsPage extends BasePage{

    //since we are extending BasePage we do not need explicit constructor for this class

    //@FindBy(xpath = "//td[text()='mbrackstone9@example.com']")
    //public WebElement mbrackstone;
    @FindBy(xpath = "//*[@class='loader-mask shown']")
    public static WebElement loaderMask;
    public ContactsPage(){

    }
    public WebElement getContactEmail(String email){
        String xpath = "//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }

}
