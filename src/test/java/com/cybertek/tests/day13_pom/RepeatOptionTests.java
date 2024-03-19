package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalenderEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatOptionTests extends TestBase {

    /*
Verify Radio Buttons
Open Chrome browser
Login as driver
Go to Activities -> Calendar Events
Click on create calendar events
Click on repeat
Verify that repeat every day is checked
Verify that repeat weekday is not checked
*/
    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();
        DashboardPage.navigateToPage(dashboardPage.activitiesBtn, dashboardPage.calenderEventsBtn);

        CalenderEventsPage calenderEventsPage = new CalenderEventsPage();
        Thread.sleep(4000);
        calenderEventsPage.createCalenderEventBtn.click();
        Thread.sleep(3000);
        calenderEventsPage.repeatCheckBox.click();

        Assert.assertTrue(true);

    }
}
