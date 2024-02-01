package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("Launch Browser")
    public void launchBrowser() {
        System.out.println("Browser launched");
    }

    @And("User Navigate to url {string}")
    public void userNavigateToUrlHttpsWwwVirgingamesCom(String agrs0) {
        System.out.println("User navigates to https://www.virgingames.com/");
    }


    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @Then("User should be on login-page {string}")
    public void userShouldBeOnLoginPage(String arg0) {
        String expected = "https://www.virgingames.com/quick-login";
        String actual = new HomePage().getTheCurrentUrl();
        Assert.assertEquals(actual, expected, "User is not on login page");
    }

    @When("User clicks on join now button")
    public void userClicksOnJoinNowButton() {
        new HomePage().clickOnJoinNowButton();
    }

    @Then("User should be able to see {string} url")
    public void userShouldBeAbleToSeeUrl(String arg0) {
        String expected = "https://www.virgingames.com/onboarding/register";
        String actual = new HomePage().getTheCurrentUrl();
        Assert.assertEquals(actual, expected, "User is not on register page");

    }

    @And("User Accepts All Cookies button")
    public void userAcceptsAllCookiesButton() {
        new HomePage().acceptAllCookies();
    }

    @When("User is on Homepage")
    public void userIsOnHomepage() {
        new HomePage().getTheCurrentUrl();
    }

    @Then("User should see {string} text")
    public void userShouldSeeText(String errorMessage) {
        Assert.assertEquals(new HomePage().verifyLoginText(), errorMessage, "Error message not found");
    }
}
