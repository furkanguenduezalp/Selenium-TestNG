package com.cybertek.tests.day16_ddf;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {

    @DataProvider
    public Object [][] userData(){
        ExcelUtil qa3short = new ExcelUtil("src/test/resources/excel.xlsx", "QA1-all");

        String[][] dataArray = qa3short.getDataArrayWithoutFirstRow();

        return dataArray;
    }

    @Test(dataProvider = "userData")
    public void test1(String username, String password, String firstName, String lastName){
        //Before and After Methods are executed just one time before and after test1, although test1 executed many tests.
        extentLogger=report.createTest("Test "+firstName+" "+lastName);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();

        String actualFullname = dashboardPage.getUserName();
        String expectedFullname = firstName+" "+lastName;

        Assert.assertEquals(expectedFullname, actualFullname, "verify fullname");
        extentLogger.pass("PASSED");
    }

}
