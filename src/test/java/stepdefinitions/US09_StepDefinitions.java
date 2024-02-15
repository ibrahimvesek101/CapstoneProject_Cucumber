package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DepartmentPage;
import pages.LoginPage;
import utils.ResuableMethods;

public class US09_StepDefinitions {
    DepartmentPage dp = new DepartmentPage();
    LoginPage lp=new LoginPage();

    @Given("US09_TC01_Step01_User goes to url and becomes Login")
    public void uS09_TC01_Step01_UserGoesToUrlAndBecomesLogin() {
       lp.signInLogin();
    }

    @And("US09_TC01_Step02_The user clicks the DropDown button")
    public void uS09_TC01_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US09_TC01_Step03_The user clicks the Account Management button")
    public void uS09_TC01_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US09_TC01_Step04_User clicks Departments button")
    public void uS09_TC01_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US09_TC01_Step05_User clicks any department")
    public void uS09_TC01_Step05_UserClicksAnyDepartment() {
        dp.selamEditDepartmentCreateForEdit();

    }

    @And("US09_TC01_Step06_The user clicks the Edit Department button")
    public void uS09_TC01_Step06_TheUserClicksTheEditDepartmentButton() {
        dp.editDepartmentButtonClick();
        ResuableMethods.waitFor(10);
    }

    @And("US09_TC01_Step07_The user deletes the name written in the name section")
    public void uS09_TC01_Step07_TheUserDeletesTheNameWrittenInTheNameSection() {
        dp.deleteDepartmentName();
        ResuableMethods.waitFor(3);
    }

    @And("US09_TC01_Step08_The user clicks the Save button")
    public void uS09_TC01_Step08_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
        ResuableMethods.waitFor(3);
    }

    @And("US09_TC01_Step09_The user sees the text -Please enter a name for department-")
    public void uS09_TC01_Step09_TheUserSeesTheTextPleaseEnterANameForDepartment() {
        dp.pleaseEnterANameForDepartmentTextVerification();
        ResuableMethods.waitFor(3);
    }

    @And("US09_TC01_Step10_The user writes a new name in the name field")
    public void uS09_TC01_Step10_TheUserWritesANewNameInTheNameField() {
        dp.enterNewNameForSelamEdit();
        ResuableMethods.waitFor(3);
    }

    @And("US09_TC01_Step11_User selects Departments Type")
    public void uS09_TC01_Step11_UserSelectsDepartmentsType() {
        // dp.departmentTypeSelectForEdit();
    }

    @And("US09_TC01_Step12_The user clicks the Save button")
    public void uS09_TC01_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
        ResuableMethods.waitFor(3);
    }

    @And("US09_TC01_Step13_User clicks Departments button")
    public void uS09_TC01_Step13_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
        ResuableMethods.waitFor(3);
    }

    @Then("US09_TC01_Step14_The user sees the Department whose name has changed")
    public void uS09_TC01_Step14_TheUserSeesTheDepartmentWhoseNameHasChanged() {
        dp.verifyingTheChangingDepartmentName();
        dp.deleteDepartmentsForEdit();
    }


    @Given("US09_TC02_Step01_User goes to url and becomes Login")
    public void uS09_TC02_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();

    }

    @And("US09_TC02_Step02_The user clicks the DropDown button")
    public void uS09_TC02_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US09_TC02_Step03_The user clicks the Account Management button")
    public void uS09_TC02_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US09_TC02_Step04_User clicks Departments button")
    public void uS09_TC02_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US09_TC02_Step05_User clicks any department")
    public void uS09_TC02_Step05_UserClicksAnyDepartment() {
        dp.selamEditDepartmentCreateForEdit();
    }

    @And("US09_TC02_Step06_The user clicks the Edit Department button")
    public void uS09_TC02_Step06_TheUserClicksTheEditDepartmentButton() {
        dp.editDepartmentButtonClick();
        ResuableMethods.waitFor(8);
    }

    @And("US09_TC02_Step07_Deletes User Department Type")
    public void uS09_TC02_Step07_DeletesUserDepartmentType() {
        dp.deleteDepartmentType();
    }

    @And("US09_TC02_Step08_The user clicks the Save button")
    public void uS09_TC02_Step08_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @And("US09_TC02_Step09_The user sees the text -Please select a type for department-")
    public void uS09_TC02_Step09_TheUserSeesTheTextPleaseSelectATypeForDepartment() {
        dp.pleaseSelectATypeForDepartmentTextVerification();
    }

    @And("US09_TC02_Step10_User changes Departments Type and chooses a new type")
    public void uS09_TC02_Step10_UserChangesDepartmentsTypeAndChoosesANewType() {
        dp.selectRemoteUnits();
    }

    @And("US09_TC02_Step11_The user clicks the Save button")
    public void uS09_TC02_Step11_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @And("US09_TC02_Step12_The user clicks the button named Department Type that he has just selected")
    public void uS09_TC02_Step12_TheUserClicksTheButtonNamedDepartmentTypeThatHeHasJustSelected() {
        dp.remoteUnitsButtonClick();
    }

    @Then("US09_TC02_Step13_The user sees the department whose Department Type has changed")
    public void uS09_TC02_Step13_TheUserSeesTheDepartmentWhoseDepartmentTypeHasChanged() {
        dp.remoteUnitsSelamEditVerification();
    }


    @Given("US09_TC03_Step01_User goes to url and becomes Login")
    public void uS09_TC03_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US09_TC03_Step02_The user clicks the DropDown button")
    public void uS09_TC03_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US09_TC03_Step03_The user clicks the Account Management button")
    public void uS09_TC03_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US09_TC03_Step04_User clicks Departments button")
    public void uS09_TC03_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US09_TC03_Step05_User clicks on any department")
    public void uS09_TC03_Step05_UserClicksOnAnyDepartment() {
        dp.selamEditDepartmentCreateForEdit();
    }

    @And("US09_TC03_Step06_The user clicks the Edit Department button")
    public void uS09_TC03_Step06_TheUserClicksTheEditDepartmentButton() {
        dp.editDepartmentButtonClick();
    }

    @And("US09_TC03_Step07_The user clicks the Delete Department button")
    public void uS09_TC03_Step07_TheUserClicksTheDeleteDepartmentButton() {
        dp.deleteDepartmentButtonClick();
        ResuableMethods.waitFor(3);
    }

    @And("US09_TC03_Step08_User clicks the OK button in the Checkbox")
    public void uS09_TC03_Step08_UserClicksTheOKButtonInTheCheckbox() {
        dp.deleteDepartmentOkButtonClick();
    }

    @And("US09_TC03_Step09_The user clicks on the Department button according to the department Type he deleted")
    public void uS09_TC03_Step09_TheUserClicksOnTheDepartmentButtonAccordingToTheDepartmentTypeHeDeleted() {
        dp.departmentsButtonClick();
    }

    @Then("US09_TC03_Step10_The user sees that there is no deparment he deleted")
    public void uS09_TC03_Step10_TheUserSeesThatThereIsNoDeparmentHeDeleted() {
        dp.verificationOfDeletedDepartment();
    }


    @Given("US09_TC04_Step01_User goes to url and becomes Login")
    public void uS09_TC04_Step01_UserGoesToUrlAndBecomesLogin() {
        lp.signInLogin();
    }

    @And("US09_TC04_Step02_The user clicks the DropDown button")
    public void uS09_TC04_Step02_TheUserClicksTheDropDownButton() {
        dp.dropdownButtonClick();
    }

    @And("US09_TC04_Step03_The user clicks the Account Management button")
    public void uS09_TC04_Step03_TheUserClicksTheAccountManagementButton() {
        dp.accountManagementButtonClick();
    }

    @And("US09_TC04_Step04_User clicks Departments button")
    public void uS09_TC04_Step04_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
    }

    @And("US09_TC04_Step05_User clicks Add NewDepartment button")
    public void uS09_TC04_Step05_UserClicksAddNewDepartmentButton() {
        dp.addNewDepartmensButtonClick();
    }

    @And("US09_TC04_Step06_A space is entered as the User Department name")
    public void uS09_TC04_Step06_ASpaceIsEnteredAsTheUserDepartmentName() {
        dp.nameForSpaceDepartment();
    }

    @And("US09_TC04_Step07_User selects Department type")
    public void uS09_TC04_Step07_UserSelectsDepartmentType() {
        dp.enterDepartmentType();
    }

    @And("US09_TC04_Step08_The user clicks the Save button")
    public void uS09_TC04_Step08_TheUserClicksTheSaveButton() {
        dp.saveButtonClick();
    }

    @Then("US09_TC04_Step09_User clicks Departments button")
    public void uS09_TC04_Step09_UserClicksDepartmentsButton() {
        dp.departmentsButtonClick();
        ResuableMethods.waitFor(5);
    }

    @Then("US09_TC04_Step10_User clicks SpaceDepartments")
    public void uS09_TC04_Step10_UserClicksSpaceDepartments() {
        dp.spaceDepartmentClick();
    }

}