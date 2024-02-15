Feature: US17 Users are able to register new user and verify it


  Scenario: TC01 user should in user module select a role and register
    Given user use reusable method
    And user click on the User button
    And user click on the register New User button
    And user select a role
    And user enter my email address
    And user click on the register button
    Then user should see the successful window

  Scenario: TC02 user should invite a user and assign role
    Given user use reusable method
    And user click on the User button
    And user click on the invite user button
    And user select the role
    And user enter my email address
    Then user click on the send invitation button