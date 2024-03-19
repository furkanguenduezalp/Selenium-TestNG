package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StrigUtilitiy;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        //chrometest();
        //firefoxtest();
        safaritest();

    }

    public static void chrometest(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        StrigUtilitiy.verifyEquals(titleGoogle, driver.getTitle());
        driver.navigate().forward();
        StrigUtilitiy.verifyEquals(titleEtsy, driver.getTitle());
        driver.quit();
    }

    public static void firefoxtest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        StrigUtilitiy.verifyEquals(titleGoogle, driver.getTitle());
        driver.navigate().forward();
        StrigUtilitiy.verifyEquals(titleEtsy, driver.getTitle());
        driver.quit();

    }

    public static void safaritest(){
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        StrigUtilitiy.verifyEquals(titleGoogle, driver.getTitle());
        driver.navigate().forward();
        StrigUtilitiy.verifyEquals(titleEtsy, driver.getTitle());
        driver.quit();

    }

}
