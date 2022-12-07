package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@class='radius']");
    By secureAreaText = By.xpath("//div[@id=\"content\"]/div/h2");
    By usernameErrorMessage = By.xpath("//div[@id='flash-messages']/div[1]");
    By passwordErrorMessage = By.xpath("//div[@id='flash-messages']//div[1]");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getDisplayedText() {
        return getTextFromElement(secureAreaText);
    }

    public String getUsernameErrorMessage() {
        return getTextFromElement(usernameErrorMessage);
    }

    public String getPasswordErrorMessage() {
        return getTextFromElement(passwordErrorMessage);
    }
}
