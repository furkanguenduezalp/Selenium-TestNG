package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {
    //Assert is the class in testNG, it has methods used to do assertions like when we compare values.
    //in testng, if assertion fails, rest of the method will NOT execute, it will be ignored/skipped.
    //if your code fail in one @Test annotation, it will not affect other @Test, each of them working independently.
    //Note: whether your testcase fail or not, your before and after method will be executed ALWAYS.
    //so even if your code fails, you can quit from driver, close browser.
    //we can add message to all of our assertions to see what we are checking.
    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
    }
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title", "title ");

        System.out.println("Second Assertion");
        Assert.assertEquals("url", "url");
    }
    @Test
    public void test2(){
        //it checks two value same or not
        Assert.assertEquals("test2", "test2");
    }

    @Test
    public void test3(){
        //String.startsWith()
        String expectedTitle ="Cyt";
        String actualTitle = "Cybertek";

        //the message will be displayed only if the comparison felt.
        //it checks whether condiditon return true or not
        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");
    }

    @Test
    public void test4(){
        //String.contains()
        String email = "mikesmith.com";
        Assert.assertTrue(email.contains("@"), "verify email contains @");
    }

    @Test
    public void test5(){
        //it verifies condition return false or not
        Assert.assertFalse(0>1, "verify that 0 is not greater than 1");
    }

    @Test
    public void test6(){
        //verifies that two values are NOT equal to each other
        Assert.assertNotEquals("one", "one");
    }


    //AfterMethod work even test case didn't completed.
    @AfterMethod
    public void tearDown(){
        System.out.println("Close Browser");
    }

}
