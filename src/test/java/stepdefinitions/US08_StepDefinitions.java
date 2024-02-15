package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DepartmentPage;
import pages.LoginPage;
import utils.ResuableMethods;

public class US08_StepDefinitions {
    DepartmentPage dp = new DepartmentPage();
    LoginPage lp = new LoginPage();


    @Given("US08_TC01_Step01_User goes to url and becomes Login")
    public void uS08_TC01_Step01_userGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US08_TC01_Step02_The user clicks the DropDown button")
    public void uS08_TC01_Step02_theUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();

    }

    @And("US08_TC01_Step03_The user clicks the Account Management button")
    public void uS08_TC01_Step03_theUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US08_TC01_Step04_User clicks Departments button")
    public void uS08_TC01_Step04_userClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US08_TC01_Step05_User clicks Add NewDepartment button")
    public void uS08_TC01_Step05_userClicksAddNewDepartmentButton() {
        dp.addNewDepartmensButtonClick();
    }

    @And("US08_TC01_Step06_User enters the Department name")
    public void uS08_TC01_Step06_userEntersTheDepartmentName() {
        dp.enterDepartmentName();
    }

    @And("US08_TC01_Step07_User selects Department type")
    public void uS08_TC01_Step07_userSelectsDepartmentType() {
        dp.enterDepartmentType();
    }

    @And("US08_TC01_Step08_The user clicks the Save button")
    public void uS08_TC01_Step08_theUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @And("US08_TC01_Step09_User clicks Departments button")
    public void uS08_TC01_Step09_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
        ResuableMethods.waitFor(5);

    }

    @Then("US08_TC01_Step10_The user sees the added department")
    public void uS08_TC01_Step10_theUserSeesTheAddedDepartment() {
        dp.tester10DepartmentClick();
        ResuableMethods.waitFor(8);
        dp.testerDepartmentNameVerification();
        ResuableMethods.waitFor(5);
    }


    @When("US08_TC02_Step01_User goes to url and becomes Login")
    public void uS08_TC02_Step01_us_TC_Step_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US08_TC02_Step02_The user clicks the DropDown button")
    public void uS08_TC02_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US08_TC02_Step03_The user clicks the Account Management button")
    public void uS08_TC02_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US08_TC02_Step04_User clicks Departments button")
    public void uS08_TC02_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US08_TC02_Step05_User clicks Add NewDepartment button")
    public void uS08_TC02_Step05_Step_UserClicksAddNewDepartmentButton() {
        dp.addNewDepartmensButtonClick();
    }

    @And("US08_TC02_Step06_Leave the field where the User Department name is entered blank")
    public void uS08_TC02_Step06_LeaveTheFieldWhereTheUserDepartmentNameIsEnteredBlank() {

    }

    @And("US08_TC02_Step07_User selects Department type")
    public void uS08_TC02_Step07_UserSelectsDepartmentType() {
        dp.enterDepartmentType();
    }

    @And("US08_TC02_Step08_The user clicks the Save button")
    public void uS08_TC02_Step08_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @Then("US08_TC02_Step09_The user sees the text -Please enter a name for department-")
    public void uS08_TC02_Step09_TheUserSeesTheText() {
        dp.pleaseEnterANameForDepartmentTextVerification();
    }


    @Given("US08_TC03_Step01_User goes to url and becomes Login")
    public void uS08_TC03_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US08_TC03_Step02_The user clicks the DropDown button")
    public void uS08_TC03_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US08_TC03_Step03_The user clicks the Account Management button")
    public void uS08_TC03_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US08_TC03_Step04_User clicks Departments button")
    public void uS08_TC03_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US08_TC03_Step05_User clicks Add NewDepartment button")
    public void uS08_TC03_Step05_UserClicksAddNewDepartmentButton() {
        dp.addNewDepartmensButtonClick();
    }

    @And("US08_TC03_Step06_User enters the Department name")
    public void uS08_TC03_Step06_UserEntersTheDepartmentName() {
        dp.enterDepartmentNameForType();
    }

    @And("US08_TC03_Step07_The user does not select the Department type")
    public void uS08_TC03_Step07_TheUserDoesNotSelectTheDepartmentType() {

    }

    @And("US08_TC03_Step08_The user clicks the Save button")
    public void uS08_TC03_Step08_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @Then("US08_TC03_Step09_The user sees the text -Please select a type for department-")
    public void uS08_TC03_Step09_TheUserSeesTheTextPleaseSelectATypeForDepartment() {
        dp.pleaseSelectATypeForDepartmentTextVerification();
    }

}