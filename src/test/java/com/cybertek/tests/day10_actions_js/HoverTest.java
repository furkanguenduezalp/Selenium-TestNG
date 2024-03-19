package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/hovers");

        Actions actions = new Actions(driver);

        for (int i = 1; i < 4; i++) {
            WebElement img = driver.findElement(By.xpath("(//img)["+i+"]"));
            actions.moveToElement(img).perform();

            WebElement txt = driver.findElement(By.xpath("//h5[.='name: user"+i+"']"));
            Assert.assertTrue(txt.isDisplayed(), "verify text "+i+" is displayed");
        }

    }

}
