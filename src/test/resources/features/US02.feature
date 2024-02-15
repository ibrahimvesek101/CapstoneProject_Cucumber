#-------------------------TC001----------------------------
# Go to https://qa-gm3.quaspareparts.com/
# The user clicks on the login button.
# User enters an email address  with valid credentials.
# User clicks the sing in button.
# Click on the logo.
# When click the logo  verify url changes
# User should return to marketplace page again

# -----------------------TC002-------------------------------
# Go to https://qa-gm3.quaspareparts.com/
# The user clicks on the login button.
# The user enters an email address  with valid credentials.
# The user clicks the sing in button.
# Verified the visibility of the sidebar sections
# user clicks on each function on the sidebar
# Verified that the pages and the url changing

@Smoke
Feature: US02 Verify functionality of the logo and side bar functions on the login page.

  Background:  Common steps for all scenarios
    Given User login with valid credentials


  Scenario: TC001 Verify the logo functionality
    When User click on the logo
     And User verifies url changes when click the logo
    Then User verifies return to marketplace page again





  Scenario: TC002 Verify the visibility and functionality of the sidebar

      When  User verifies the visibility of the sidebar sections after login
      Then user clicks on each function on the sidebar verifies that the pages and the url are changing