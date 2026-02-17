package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void pageSetup() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testInvalidLogin() {
        try {
            loginPage.doLogin("invalid_user@example.com", "WrongPassword");

            boolean isErrorPresent = loginPage.isErrorMessageDisplayed();
            Assert.assertTrue(isErrorPresent, "Error message should be displayed for invalid login");
        } catch (Exception e) {
            Assert.fail("Invalid login test failed due to exception: " + e.getMessage());
        }
    }
}
