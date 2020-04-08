package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
    By enrollNowLink = By.linkText("Enroll now");

    public void clickOnPracticeLink() {
        clickOnElement(practiceLink);
    }
    public void clickOnEnrolNowLink(){
        clickOnElement(enrollNowLink);
    }
}