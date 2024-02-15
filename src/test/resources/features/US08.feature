Feature: US_08

  Scenario: TC01_Adding a new department

    Given US08_TC01_Step01_User goes to url and becomes Login
    And US08_TC01_Step02_The user clicks the DropDown button
    And US08_TC01_Step03_The user clicks the Account Management button
    And US08_TC01_Step04_User clicks Departments button
    And US08_TC01_Step05_User clicks Add NewDepartment button
    And US08_TC01_Step06_User enters the Department name
    And US08_TC01_Step07_User selects Department type
    And US08_TC01_Step08_The user clicks the Save button
    And US08_TC01_Step09_User clicks Departments button
    Then US08_TC01_Step10_The user sees the added department


  Scenario: TC02_Department name must be mandatory

    Given US08_TC02_Step01_User goes to url and becomes Login
    And US08_TC02_Step02_The user clicks the DropDown button
    And US08_TC02_Step03_The user clicks the Account Management button
    And US08_TC02_Step04_User clicks Departments button
    And US08_TC02_Step05_User clicks Add NewDepartment button
    And US08_TC02_Step06_Leave the field where the User Department name is entered blank
    And US08_TC02_Step07_User selects Department type
    And US08_TC02_Step08_The user clicks the Save button
    Then US08_TC02_Step09_The user sees the text -Please enter a name for department-


  Scenario: TC03_Department type must be mandatory

    Given US08_TC03_Step01_User goes to url and becomes Login
    And US08_TC03_Step02_The user clicks the DropDown button
    And US08_TC03_Step03_The user clicks the Account Management button
    And US08_TC03_Step04_User clicks Departments button
    And US08_TC03_Step05_User clicks Add NewDepartment button
    And US08_TC03_Step06_User enters the Department name
    And US08_TC03_Step07_The user does not select the Department type
    And US08_TC03_Step08_The user clicks the Save button
    Then US08_TC03_Step09_The user sees the text -Please select a type for department-

