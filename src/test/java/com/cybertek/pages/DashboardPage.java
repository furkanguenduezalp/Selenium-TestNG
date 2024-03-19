package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public static WebElement customerBtn;

    @FindBy(xpath = "(//span[.='Contacts'])[1]")
    public static WebElement contactsBtn;

}
