package stepdefinitions;

import io.cucumber.java.en.*;
import pages.DepartmentPage;
import pages.LoginPage;
import utils.*;

public class US07_StepDefinitions {
    DepartmentPage dp = new DepartmentPage();
    LoginPage lp = new LoginPage();

    @When("US07_TC01_Step01_User goes to url and becomes Login")
    public void uS07_TC01_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US07_TC01_Step02_The user clicks the DropDown button")
    public void uS07_TC01_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US07_TC01_Step03_Click the User Account Management button")
    public void uS07_TC01_Step03_ClickTheUserAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @Then("US07_TC01_Step04_Click the User Departments button")
    public void uS07_TC01_Step04_ClickTheUserDepartmentsButton() {
        dp.departmentsButtonClick();
        ResuableMethods.waitFor(5);
    }

    @Then("US07_TC01_Step05_The user sees as many departments as the number of departments")
    public void uS07_TC01_Step05_theUserSeesAsManyDepartmentsAsTheNumberOfDepartments() {
        dp.departmentCountVerification();
    }


    @When("US07_TC02_Step01_User goes to url and becomes Login")
    public void uS07_TC02_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();

    }

    @And("US07_TC02_Step02_The user clicks the DropDown button")
    public void uS07_TC02_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US07_TC02_Step03_Click the User Account Management button")
    public void uS07_TC02_Step03_ClickTheUserAccountManagementButton() {
        dp.accountManagementButtonClick();

    }

    @And("US07_TC02_Step04_Click the User Departments button")
    public void uS07_TC02_Step04_clickTheUserDepartmentsButton() {
        dp.departmentsButtonClick();

    }

    @And("US07_TC02_Step05_Click on one of the User Departments")
    public void uS07_TC02_Step05_clickOnOneOfTheUserDepartments() {
        dp.selam10DepartmensClick();
        ResuableMethods.waitFor(3);
    }

    @Then("US07_TC02_Step06_Sees the role of the Department that the user clicked on")
    public void uS07_TC02_Step06_seesTheManagersRolesOfTheDepartmentThatTheUserClickedOn() {
        dp.departmensRoleVerification();
        ResuableMethods.waitFor(4);
    }


    @When("US07_TC03_Step01_User goes to url and becomes Login")
    public void uS07_TC03_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US07_TC03_Step02_The user clicks the DropDown button")
    public void usS07_TC03_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US07_TC03_Step03_The user clicks the Account Management button")
    public void uS07_TC03_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US07_TC03_Step04_User clicks Departments button")
    public void uS07_TC03_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US07_TC03_Step05_User clicks Add NewDepartment button")
    public void uS07_TC03_Step05_UserClicksAddNewDepartmentButton() {
        dp.addNewDepartmensButtonClick();
    }

    @And("US07_TC03_Step06_User enters Department name")
    public void uS07_TC03_Step06_UserEntersDepartmentName() {
        dp.departmentNameForTazeSimit();
    }

    @And("US07_TC03_Step07_As User Department Type; Selects a Type except Department, Remote Unit, and Team")
    public void uS07_TC03_Step07_AsUserDepartmentTypeSelectsATypeExceptDepartmentRemoteUnitAndTeam() {
        dp.tazeSimitDepartmentClick();
    }

    @And("US07_TC03_Step08_The user clicks the Save button")
    public void uS07_TC03_Step08_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @Then("US07_TC03_Step09_The user cannot find a button to reach the department he has registered")
    public void uS07_TC03_Step09_TheUserCannotFindAButtonToReachTheDepartmentHeHasRegistered() {
        dp.tazeSimitUnitDepartmentButtonClick();
    }
}
