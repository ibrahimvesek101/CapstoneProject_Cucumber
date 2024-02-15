Feature: US_07

  Scenario: TC01_View the registered department

    When US07_TC01_Step01_User goes to url and becomes Login
    And US07_TC01_Step02_The user clicks the DropDown button
    And US07_TC01_Step03_Click the User Account Management button
    And US07_TC01_Step04_Click the User Departments button
    Then US07_TC01_Step05_The user sees as many departments as the number of departments


  Scenario: TC02_Viewing department roles

    When US07_TC02_Step01_User goes to url and becomes Login
    And US07_TC02_Step02_The user clicks the DropDown button
    And US07_TC02_Step03_Click the User Account Management button
    And US07_TC02_Step04_Click the User Departments button
    And US07_TC02_Step05_Click on one of the User Departments
    Then US07_TC02_Step06_Sees the role of the Department that the user clicked on


  Scenario: TC03_BUG_The user cannot reach the department he has registered

    When US07_TC03_Step01_User goes to url and becomes Login
    And US07_TC03_Step02_The user clicks the DropDown button
    And US07_TC03_Step03_The user clicks the Account Management button
    And US07_TC03_Step04_User clicks Departments button
    And US07_TC03_Step05_User clicks Add NewDepartment button
    And US07_TC03_Step06_User enters Department name
    And US07_TC03_Step07_As User Department Type; Selects a Type except Department, Remote Unit, and Team
    And US07_TC03_Step08_The user clicks the Save button
    Then US07_TC03_Step09_The user cannot find a button to reach the department he has registered