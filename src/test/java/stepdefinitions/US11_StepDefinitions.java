package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RemoteUnitPage;
import utils.ResuableMethods;

public class US11_StepDefinitions {
    RemoteUnitPage rup= new RemoteUnitPage();
    @And("the user adds a new remote unit with required fields name and type")
    public void theUserAddsANewRemoteUnitWithRequiredFieldsAnd() {
        rup.clickAddNewRemoteUnitButton();
        rup.sendKeysDepartmentName("New name");
        rup.selectDepartmentTypeRemoteUnit();
        rup.clickDepartmentRoles();
        rup.selectBusinessOwner();
        rup.clickDepartmentRoles();
        rup.clickSaveButton();
    }
    @Then("the user should see the new remote unit has been added")
    public void theUserShouldSeeASuccessMessageIndicatingThatTheNewRemoteUnitHasBeenAdded() {
        rup.clickRemoteUnitsTab();
        ResuableMethods.waitFor(6);
        rup.verifyFromRemoteUnitsList("New");
    }

    @And("the user attempts to add a new remote unit without filling the required field name")
    public void theUserAttemptsToAddANewRemoteUnitWithoutFillingTheRequiredField() {
        rup.clickAddNewRemoteUnitButton();
        rup.selectDepartmentTypeRemoteUnit();
        rup.clickSaveButton();
    }
    @Then("the user should see the error message Please enter a name for the department")
    public void theUserShouldSeeTheErrorMessageName() {
        rup.pleaseEnterName();
    }

    @And("the user attempts to add a new remote unit without selecting the required field type")
    public void theUserAttemptsToAddANewRemoteUnitWithoutSelectingTheRequiredField() {
        rup.clickAddNewRemoteUnitButton();
        rup.sendKeysDepartmentName("Error");
        rup.clickSaveButton();
    }
    @Then("the user should see the error message Please select a type for the department")
    public void theUserShouldSeeTheErrorMessageType() {
        rup.pleaseEnterType();
    }
}
