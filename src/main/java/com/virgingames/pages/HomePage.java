package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Getting Current URL
    public String getTheCurrentUrl() {
        return driver.getCurrentUrl();
    }

    //1. Accept all cookies
    @CacheLookup
    @FindBy(css = "label[for='privacy_pref_optin']")
    WebElement acceptCookiesButton;

    //2. Click on Login Button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement loginButton;

    //3. Click on join now
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Join Now']")
    WebElement joinNowButton;

    //4. Verify "Login" text
    @CacheLookup
    @FindBy(css ="a[title='Login']")
    WebElement loginText;

    //1. Accept all cookies method
    public void acceptAllCookies(){
        clickOnElement(acceptCookiesButton);
        log.info("Click on accept cookies button : " + acceptCookiesButton.toString());
    }

    //2. Click on Login Button Method
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on login button: " + loginButton.toString());
    }
    //3. Click on join now button
    public void clickOnJoinNowButton(){
        clickOnElement(joinNowButton);
        log.info("Click on join now button: " + joinNowButton.toString());
    }
  //4. Verify Login Text Method
    public String verifyLoginText() {
        String message = getTextFromElement(loginText);
        log.info("Getting text from : " + loginText.toString());
        return message;
    }
}
