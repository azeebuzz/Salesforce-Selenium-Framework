package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void pageSetup() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        try {
            loginPage.doLogin("valid_user@example.com", "ValidPassword123!");
            Assert.assertTrue(driver.getTitle().contains("Home"), "Login failed or title mismatched");
        } catch (Exception e) {
            Assert.fail("Valid login test failed due to exception: " + e.getMessage());
        }
    }
}
