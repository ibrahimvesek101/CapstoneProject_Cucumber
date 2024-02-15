Feature: US14 Teams Module Change Test

  Background: The user comes to the Edit Team page before each scenario.
    When User clicks Teams button


  Scenario: TC01 The user should be able to make changes to the information of the teams in the Teams module.
    When The user fills in the blanks on the opened page and clicks the save button
    Then The User verifies change in team information

  Scenario: TC02 The user should be able to delete the teams in the Teams module.
    When The user clicks Delete the Team button at the bottom left of the page
    And The user clicks the OK button on the Alert Message at the top of the page
    Then The User verifies that the deleted team no longer exists on the page