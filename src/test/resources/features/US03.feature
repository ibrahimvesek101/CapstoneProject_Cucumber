#-------------------------TC001----------------------------
# Go to https://qa-gm3.quaspareparts.com/
# The user clicks on the login button.
# Enter a valid password
# The user clicks the sing in button.
# User on the marketplace page
# User clicks the profile dropdown
# Username and the role should be on the top of right of page

# -----------------------TC002-------------------------------
# Go to https://qa-gm3.quaspareparts.com/
# The user clicks on the login button.
# Enter a valid password
# The user clicks the sing in button.
# User on the marketplace page
# User clicks the profile dropdown menu
# User should display each items under dropdown
# Some of tabs are selected it is verified that the url changes

@Smoke
Feature: US003 Verifies the functions in the drop-down menu on the login page (marketplace)

  Background: Common steps for all scenarios
    Given User login with valid credential

  @Smoke
  Scenario: TC001 Visibility of  username and role

    When user login user on the marketplace page
    When User clicks the profile dropdown
    Then Verify the username and role is displayed


  @Smoke
  Scenario: TC002 Assertions dropdown menu

    When User clicks the profile dropdown
    And User should display each items under dropdown
    Then Some of tabs are selected it is verified that the url changes




