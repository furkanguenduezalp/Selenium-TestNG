package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends BasePage{

    @FindBy(xpath = "//a[@class='email']")
    public WebElement email;

    @FindBy(css = "h1.user-name")
    public WebElement fullName;

    @FindBy(css = "a.phone")
    public WebElement phone;
}
