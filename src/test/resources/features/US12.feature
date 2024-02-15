Feature: US12- Edit and delete the units displayed in the Remote Unit module.


  Background:
   # Given the user is on the "https://qa-gm3.quaspareparts.com/" page
    When the user logs in as a valid user
    And the user navigates to the Account Management section from the dropdown menu
    And the user  clicks remote units tab


  Scenario: Verify that the user can edit added remote unit
    And the user adds a new remote unit
    And the user clicks on the edit button
    And the user changes the name of the remote unit
    And the user saves the changes
    Then the user should see that the name of the remote unit has been updated



  Scenario: Verify that the user can delete a selected remote unit

    And the user selects a new remote unit
    And the user clicks on the Delete button
    And the user confirms the deletion
    Then the user should see that the selected remote unit is deleted