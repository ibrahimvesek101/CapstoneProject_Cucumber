Feature: US13 Teams Module Display Test


  Background: User comes to Teams module before each scenario
    When User clicks Teams button


  Scenario: TC01 User should be able to see the teams in the Teams module as a list
    Then The user verifies that the listed teams appear on the page

  Scenario: TC02 The user should be able to see the clicked team in detail by clicking on the teams in the Teams module
    When User clicks on first clickable team
    Then User verifies that the clickable team's information appears on the page in detail

  Scenario: TC03 The user should be able to add new teams to the teams in the Teams module.
    When The user clicks the Add New Team button at the top right of the page
    And user fills in the blanks on the opened page and clicks the save button
    And The user clicks the teams button on the left side of the page
    Then User verifies that the added team exists on the teams page