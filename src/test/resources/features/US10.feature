Feature: US10 - Displaying Added Remote Unit

  Background:
   # Given the user is on the "https://qa-gm3.quaspareparts.com/" page
    When the user logs in as a valid user
    And the user navigates to the Account Management section from the dropdown menu
    And the user  clicks remote units tab

  Scenario: User can display added remote unit

    Then the user should be able to see the added remote unit in the list


  Scenario: User can display remote unit list

    Then the user should be able to see the remote unit list


  Scenario: User can not display a remote unit that does not exist

   Then Verify that the user can not view a remote unit that does not exist






