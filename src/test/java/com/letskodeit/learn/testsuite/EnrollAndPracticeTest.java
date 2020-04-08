package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class EnrollAndPracticeTest extends TestBase {

    HomePage homePage = new HomePage(); //  object created for home page ]

    @Test
    public void userShouldClickOnPracticeLink() {
        homePage.clickOnPracticeLink();
    }

    @Test
    public void userShouldClickOnEnrollLink() {
        homePage.clickOnEnrolNowLink();
    }
}
