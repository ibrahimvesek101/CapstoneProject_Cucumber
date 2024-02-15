Feature: US_09

  Scenario: TC01_Department name can be changed

    Given US09_TC01_Step01_User goes to url and becomes Login
    And US09_TC01_Step02_The user clicks the DropDown button
    And US09_TC01_Step03_The user clicks the Account Management button
    And US09_TC01_Step04_User clicks Departments button
    And US09_TC01_Step05_User clicks any department
    And US09_TC01_Step06_The user clicks the Edit Department button
    And US09_TC01_Step07_The user deletes the name written in the name section
    And US09_TC01_Step08_The user clicks the Save button
    And US09_TC01_Step09_The user sees the text -Please enter a name for department-
    And US09_TC01_Step10_The user writes a new name in the name field
    And US09_TC01_Step11_User selects Departments Type
    And US09_TC01_Step12_The user clicks the Save button
    And US09_TC01_Step13_User clicks Departments button
    Then US09_TC01_Step14_The user sees the Department whose name has changed


  Scenario: TC02_Department type can be changed

    Given US09_TC02_Step01_User goes to url and becomes Login
    And US09_TC02_Step02_The user clicks the DropDown button
    And US09_TC02_Step03_The user clicks the Account Management button
    And US09_TC02_Step04_User clicks Departments button
    And US09_TC02_Step05_User clicks any department
    And US09_TC02_Step06_The user clicks the Edit Department button
    And US09_TC02_Step07_Deletes User Department Type
    And US09_TC02_Step08_The user clicks the Save button
    And US09_TC02_Step09_The user sees the text -Please select a type for department-
    And US09_TC02_Step10_User changes Departments Type and chooses a new type
    And US09_TC02_Step11_The user clicks the Save button
    And US09_TC02_Step12_The user clicks the button named Department Type that he has just selected
    Then US09_TC02_Step13_The user sees the department whose Department Type has changed


  Scenario: TC03_The department can be deleted

    Given US09_TC03_Step01_User goes to url and becomes Login
    And US09_TC03_Step02_The user clicks the DropDown button
    And US09_TC03_Step03_The user clicks the Account Management button
    And US09_TC03_Step04_User clicks Departments button
    And US09_TC03_Step05_User clicks on any department
    And US09_TC03_Step06_The user clicks the Edit Department button
    And US09_TC03_Step07_The user clicks the Delete Department button
    And US09_TC03_Step08_User clicks the OK button in the Checkbox
    And US09_TC03_Step09_The user clicks on the Department button according to the department Type he deleted
    Then US09_TC03_Step10_The user sees that there is no deparment he deleted


  Scenario: TC04_The user cannot click on the registered department

    Given US09_TC04_Step01_User goes to url and becomes Login
    And US09_TC04_Step02_The user clicks the DropDown button
    And US09_TC04_Step03_The user clicks the Account Management button
    And US09_TC04_Step04_User clicks Departments button
    And US09_TC04_Step05_User clicks Add NewDepartment button
    And US09_TC04_Step06_A space is entered as the User Department name
    And US09_TC04_Step07_User selects Department type
    And US09_TC04_Step08_The user clicks the Save button
    And US09_TC04_Step09_User clicks Departments button
    Then US09_TC04_Step10_User clicks SpaceDepartments