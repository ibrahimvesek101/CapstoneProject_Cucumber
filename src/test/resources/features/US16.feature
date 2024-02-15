Feature: US16 Edit the users displayed in the Users module.

  Background: Common Steps for all scenarios
    Given The User clicks to login button
    And User enters an username or email and password
    And User clicks on Sign In button
    And User clicks the DropDown tab with profile information
    And User selects Account Management and click it
    And User clicks to Users button
    And User enters an username or email in the Search by username or email field
    And User clicks selected username or email below


  Scenario: US16_TC01 Edit the users displayed in the Users module

    When User clicks to the Edit Pencil button
    Then User Verifies that confirmation lilac tick is clickable


  Scenario: US16_TC02 User changes username displayed in the Users module.

    When User clicks to the Edit Pencil button
    And  User enters a new username as Maskar
    And User clicks the lilac tick button

    Then User verifies that username has been changed


  Scenario: US15_TC03 User shows that Username must contain special characters of -, ., _

    When User clicks to the Edit Pencil button
    And User enters a new username as "Maskar.11"
    And User clicks the lilac tick button

    Then User verifies that username contains special characters of -, ., _


  Scenario: US15_TC04 User show that User can not add a new user without a role

    When User clicks to the Edit Pencil button
    And User enters a new username as "Maskar%"
    And User clicks the lilac tick button

    Then User verifies that username can not contain special characters of other then -, ., _


  Scenario: US16_TC05 User verifies that Username field of any Users cannot be empty

    When User clicks to the Edit Pencil button
    And User clears the Username field

    Then User verifies that Username field cannot be empty


  Scenario: US16_TC06 User confirms that the e-mail cannot be changed

    When User clicks to the Edit Pencil button
    Then User verifies that the E-mail domain cannot be clicked


  Scenario: US16_TC07 User changes the phone number of the users

    When User clicks to the Edit Pencil button
    And User enters a new phone number in the phone number field
    And User clicks the lilac tick button

    Then The user verifies the new phone number


  Scenario: US16_TC08 User changes First Name of the users

    When User clicks to the Edit Pencil button
    And User enters a new First Name
    And User clicks the lilac tick button

    Then The user verifies that First Name has been changed


  Scenario: US16_TC09 User changes Last Name of the users

    When User clicks to the Edit Pencil button
    And User enters a new Last Name
    And User clicks the lilac tick button

    Then The user verifies that Last Name has been changed


  Scenario: US16_TC10 User shows that the user can change your country

    When User clicks to the Edit Pencil button
    And User enters a new Country
    And User clicks the lilac tick button

    Then The user verifies that Country has been changed


  Scenario: US16_TC11 User shows that the user can change your address

    When User clicks to the Edit Pencil button
    And User enters an address Ali cad. Veli sok. Üzüm apt. No 11, Nazilli/Aydin
    And User clicks the lilac tick button

    Then The user verifies that the address has been changed


  Scenario: US16_TC12 User can reset the user's password and assign a new one.

    When User clicks to the Edit Pencil button
    And User clicks to the Confirm button in the Reset Password pop-up

    Then The user verifies that the user's password has been changed and a new one assigned


  Scenario: US16_TC13 User can not delete the Default Role

    When User clicks to the Edit Pencil button
    And Click to the Roles Store Manager button

    Then Verify that Role Store Manager cannot clickable


  Scenario: US16_TC14 User changes the phone number of the users

    When User clicks to the Edit Pencil button
    And User enters a new Role

    Then Verify that a new role has been created
