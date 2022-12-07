package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginpage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginpage.enterUsername("tomsmith");
        loginpage.enterpassword("SuperSecretPassword!");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(loginpage.getDisplayedText(), "Secure Area", "Secure Area text not displayed");

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginpage.enterUsername("tomsmith1");
        loginpage.enterpassword("SuperSecretPassword!");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(loginpage.getUsernameErrorMessage(), "Your username is invalid!\n" + "×", "error message not displayed");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginpage.enterUsername("tomsmith");
        loginpage.enterpassword("SuperSecretPassword");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(loginpage.getPasswordErrorMessage(), "Your password is invalid!\n" + "×", "error message not dispalyed");


    }
}