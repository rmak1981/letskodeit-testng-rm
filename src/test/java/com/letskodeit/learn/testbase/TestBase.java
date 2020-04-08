package com.letskodeit.learn.testbase;

import com.letskodeit.learn.basepage.BasePage;
import com.letskodeit.learn.browserselector.BrowserSelector;
import com.letskodeit.learn.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector selectBrowser = new BrowserSelector();
    String baseURL = "https://learn.letskodeit.com/";

    @BeforeMethod
    public void openBrowser() {

        selectBrowser.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
