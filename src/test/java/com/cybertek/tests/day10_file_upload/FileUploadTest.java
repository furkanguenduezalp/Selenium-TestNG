package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
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
        driver.get("https://practice.cydeo.com/upload");
        //locating choose file button
        WebElement chooseFile = driver.findElement(By.name("file"));
        //Mac: right click on the file, hold alt button, select option: copy "file.txt" as Pathname
        //Windows: hold shift button, right click on file, copy as Path
        //sending file with sendKeys method
        chooseFile.sendKeys("/Users/furkangunduzalp/Desktop/file.txt");
        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting the file name from browser
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is file.txt
        Assert.assertEquals(actualFileName, "file.txt", "verify file.txt uploaded");
    }
    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/upload");
        //locating choose file button
        WebElement chooseFile = driver.findElement(By.name("file"));
        //Mac: right click on the file, hold alt button, select option: copy "file.txt" as Pathname
        //Windows: hold shift button, right click on file, copy as Path

        //thhis method will find where your project is located in your computer.
        String projectPath = System.getProperty("user.dir");
        //Right click on test, new->Directory, choose or type resources, ok,
        //right click on resources, new->file, textfile.txt
        //right click on textfile.txt, copy path, path from content root
        String filePath = "src/test/resources/textfile.txt";
        //we will add the relative file path which is after project location
        String fullPath = projectPath+"/"+filePath;
        //sending file with sendKeys method
        chooseFile.sendKeys(fullPath);

        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting the file name from browser
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is file.txt
        Assert.assertEquals(actualFileName, "textfile.txt", "verify file.txt uploaded");
    }
}
