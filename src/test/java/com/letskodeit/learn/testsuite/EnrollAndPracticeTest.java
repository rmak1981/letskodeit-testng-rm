package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class EnrollAndPracticeTest extends TestBase {

    HomePage homePage = new HomePage(); //  object created for home page ]

    @Test(priority = 0,groups = {"Sanity","Regression"})
    public void userShouldClickOnPracticeLink() {
        homePage.clickOnPracticeLink();
    }

    @Test(priority = 1,groups = {"Smoke","Regression"})
    public void userShouldClickOnEnrollLink() {
        homePage.clickOnEnrolNowLink();
    }
}
