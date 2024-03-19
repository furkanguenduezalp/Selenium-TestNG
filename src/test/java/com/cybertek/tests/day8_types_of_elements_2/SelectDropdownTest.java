package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

    //Select methods
    //getOptions(): returns all the avaliable options from the dropdown list
    //getFirstSelectedOption(): return webelement, first selected option
    //selectByVisibleText("text"): selecting based on the visible text of options
    //selectByIndex(indexNumber):select based on index of options(starts from o) /
    //selectByValue(option value): select based on value of option attribute
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //despite the test methods fail, works AfterMethod always.
        driver.quit();
    }
    @Test

    public void test1(){
        driver.get("https://practice.cydeo.com/dropdown");

        //1.locate your dropdown just like any other webelement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2.create Select object by °passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //getOptions ---> returns all the available options from the dropdown
        List<WebElement> options = stateDropdown.getOptions();

        //print size of the options
        System.out.println("options.size() = " + options.size());

        //print options one by one
        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());
        }

    }
    @Test
    public void Test2() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");

        //1.locate your dropdown just like any other webelement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2.create Select object by °passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //verify that first selection is Select a state
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //how to select options from dropdown
        //1.Select using visible test
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");
        expectedOption = "Virginia";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //2.Select using index
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);
        expectedOption = "Wyoming";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //3.Select by value
        Thread.sleep(2000);
        stateDropdown.selectByValue("TX");
        expectedOption = "Texas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

    }
}
