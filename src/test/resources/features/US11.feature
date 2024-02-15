Feature: US11 - Adding a New Remote Unit

  Background:
   # Given the user is on the "https://qa-gm3.quaspareparts.com/" page
    When the user logs in as a valid user
    And the user navigates to the Account Management section from the dropdown menu
    And the user  clicks remote units tab

  Scenario: Verify that a new remote unit can be added with required fields

    And the user adds a new remote unit with required fields name and type
    Then the user should see the new remote unit has been added


  Scenario: Verify error message when adding a new remote unit without "name" field

    And the user attempts to add a new remote unit without filling the required field name
    Then the user should see the error message Please enter a name for the department


  Scenario: Verify error message when adding a new remote unit without "type" field

    And the user attempts to add a new remote unit without selecting the required field type
    Then the user should see the error message Please select a type for the department