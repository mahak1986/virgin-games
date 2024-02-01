Feature: Homepage functionality
  As a user, I would like to check the homepage functionality.

  Background:
    Given  Launch Browser
    And    User Navigate to url 'https://www.virgingames.com/'
    And    User Accepts All Cookies button

  @smoke @sanity @regression
  Scenario: Test Case 1: User should be able to click on login button
    When    User clicks on login button
    Then    User should be on login-page "https://www.virgingames.com/quick-login"

  @smoke @regression
  Scenario: Test Case 2: User should be able to click on join now button
    When    User clicks on join now button
    Then    User should be able to see "https://www.virgingames.com/onboarding/register" url

  @regression
  Scenario: Test Case 3: User should be able to see Login text
    When    User is on Homepage
    Then    User should see "Login" text
