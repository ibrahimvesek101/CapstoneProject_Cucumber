Feature: US15 - Display Users in the Users module.

  Background: Common Steps for all scenarios
    Given The User clicks to login button
    And User enters an username or email and password
    And User clicks on Sign in button
    And User clicks the DropDown tab with profile information
    And User selects Account Management and click it
    And User clicks to Users button


  Scenario: US15_TC01 Display Users in the Users module.

    Then Display Users in the Users module


  Scenario: US15_TC02 User adds a new user in the Users module.

    When User clicks Register New User button
    And User enters a Role in New User Registration
    And User enters an Email
    And User clicks Register button
    And User clicks Close button

    Then User verifies that new user have been added successfully


  Scenario: US15 TC03 - User see a green tick for the user whose mail has been confirmed

    When User clicks Register New User button
    And User enters a Role in New User Registration
    And User enters an Email
    And User clicks Register button

    Then User see a green tick for the user whose mail has been confirmed


  Scenario: US15 TC04 - User show that User can not add a new user without a role.

    When User clicks Register New User button
    And User enters an Email
    And User clicks Register button

    Then User verifies that no new user has been added without a role


  Scenario: US15 TC05 - User show that User can not add a new user without a Email.

    When User clicks Register New User button
    And User enters a Role in New User Registration
    And User clicks Register button

    Then User verifies that no new user has been added without an email


  Scenario: US15 TC06 - User displays a user searching by username or Email.

    When User enters an username or email in the Search by username or email field
    Then User Verify that username or email have been seen below


  Scenario: US15 TC07 - User displays all the users searching by status

    When User clicks the Status field
    And User selects Pending User Action status

    Then The user verifies that all Pending user Action are coming by searching with Status

