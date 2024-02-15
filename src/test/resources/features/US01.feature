#-------------------------TC001----------------------------
# Go to URL
# User clicks the login button.
# User enter a valid email which contains "@" and "." signs
# User verify the email contains "@" and "." signs
# User clicks the sign in button
# User verifies the site login.

# -----------------------TC002-------------------------------
# Go to URl
# User clicks on the login button.
# User enters an email address that does not match the credentials (without @ and . sign ).
# User clicks on the sign-in button.
# User verifies that they received the message "Not Authorized. Please try with valid credentials."


# ------------------------TC003---------------------------------
#Go to URL
#The user clicks on the login button.
#Enter a valid username.
#Leave the password field empty.
#Click on the login button.
# User verifies that they received the message "Not Authorized. Please try with valid credentials."

# ------------------------TC004---------------------------------
# Go to URL
# The user clicks on the login button.
# Enter a valid password
# Leave the username field empty.
# Click on the login button.
# User verifies that they received the message "Not Authorized. Please try with valid credentials."

# ------------------------TC005---------------------------------
# Go to URL
# The user clicks on the login button.
# The user enters an email address  with valid credentials.
# The user goes to the All Product Page
# User clicks on the "Log Out" button
# Verify the redirected the login page

#----------------------------------------------------------------
@Smoke
Feature: US01 Login successfully with valid username and password
  Background: Common steps for all scenarios
    Given  User clicks the login button


  Scenario: TC_0001 valid credential

    When User enter a valid email which contains "@" and "." signs.
    Then User verify the email contains "@" and "." signs
    And User clicks signIn button
    Then User verifies the site login.



  Scenario: TC_0002 Invalid credential
    When User enters an email address that does not match the credentials
      | @ |
      | . |
    And User clicks signIn button
    Then User verifies that they received the "Not Authorized. Please try with valid credentials"


  Scenario: TC_0003 login without password credential
    When Enter valid username.
    And Leave password field empty
    And User clicks signIn button
    Then User verifies that they received the "Not Authorized. Please try with valid credentials"


Scenario: TC_0004 login without username credential

  When Leave username field empty
  And Enter valid password
  And User clicks signIn button
  Then User verifies that they received the "Not Authorized. Please try with valid credentials"



  Scenario: TC_0005 Logout successfully
    When  User enters an email address  with valid credentials
    And User clicks signIn button
    And user goes to the All Product Page
    And user clicks profile dropdown
    And User clicks on the Log Out button
    Then Verify the redirected the login page
