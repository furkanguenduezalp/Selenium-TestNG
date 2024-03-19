package com.cybertek.tests.day15_review;

import com.cybertek.pages.*;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyContactInfoTest extends TestBase {

    @Test
    public void test() throws InterruptedException {

        extentLogger = report.createTest("Contact Info Test");

        new LoginPage().loginAsSalesManager();
        extentLogger.info("Login");

        new DashboardPage().navigateToPage(DashboardPage.customerBtn, DashboardPage.contactsBtn);
        extentLogger.info("navigate to contact");

        ContactsPage contactsPage = new ContactsPage();
        //Thread.sleep(3000);
        contactsPage.getContactEmail("mbrackstone9@example.com").click();
        extentLogger.info("click email");

        String expectedEmail = "mbrackstone9@example.com";
        String actualEmail = new ContactInfoPage().email.getText();
        Assert.assertEquals(expectedEmail, actualEmail, "Verify Email is correct");

        extentLogger.pass("Contact Info Test is Passed");

    }


}
