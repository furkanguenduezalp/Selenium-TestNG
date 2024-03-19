package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalenderEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase{

    /*
    Open browser
    Login as a Driver
    Verify that page subtitle is Quick Launchpad
    Go to Activities --> Calendar Events
    verify that page subtitle is Calendar Events
     */

    @Test
    public void test1() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertEquals(dashboardPage.pageSubtitle.getText(), "Quick Launchpad");

        DashboardPage.navigateToPage(dashboardPage.activitiesBtn, dashboardPage.calenderEventsBtn);
        CalenderEventsPage calenderEventsPage = new CalenderEventsPage();
        Thread.sleep(3000);
        Assert.assertEquals(dashboardPage.pageSubtitle.getText(), "Calendar Events");

    }
}
