package org.example.testcases;

import org.example.base.TestBase;
import org.example.pages.Home;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    Home home;
    public HomeTest(){
        super();//using this it will not throw null pointer exception
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        home = new Home();
    }

    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        Assert.assertEquals( home.verifyHomePageTitle(), "NEVER STOP LEARNING - Automation Step by Step");
    }

    @Test(priority=2)
    public void verifyHomeTopListButton(){
        Assert.assertTrue(home.verifyHomeTopListButton());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
