package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import pages.RemoteUnitPage;
import utils.Driver;
import utils.ResuableMethods;

public class US12_StepDefinitions {

    RemoteUnitPage rup= new RemoteUnitPage();


    @And("the user adds a new remote unit")
    public void theUserAddsANewRemoteUnit() {

        rup.clickAddNewRemoteUnitButton();
        rup.sendKeysDepartmentName("Hello ");
        rup.selectDepartmentTypeRemoteUnit();
        rup.clickSaveButton();
    }

    @And("the user clicks on the edit button")
    public void theUserClicksOnTheButton() {
        rup.clickEditButton();
    }

    @And("the user changes the name of the remote unit")
    public void theUserChangesTheNameOfTheRemoteUnit() {
        rup.clickDepartmentName();
        ResuableMethods.waitFor(2);
        rup.sendKeysDepartmentName("world");
    }

    @And("the user saves the changes")
    public void theUserSavesTheChanges() {
        rup.clickSaveButton();
    }

    @Then("the user should see that the name of the remote unit has been updated")
    public void theUserShouldSeeThatTheNameOfTheRemoteUnitHasBeenUpdated() {
        rup.clickRemoteUnitsTab();
        ResuableMethods.waitFor(6);
        rup.verifyChangedName();
    }

    @And("the user selects a new remote unit")
    public void theUserSelectsANewRemoteUnit() {
        rup.helloWorldRemoteUnit.click();
    }
    @And("the user clicks on the Delete button")
    public void theUserClicksOnTheDeleteButton() {

        ResuableMethods.waitFor(6);
        rup.clickEditRemoteUnitButton();
        rup.clickDeleteDepartmentButton();
    }
    @And("the user confirms the deletion")
    public void theUserConfirmsTheDeletion() {
        Alert alert= Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Then("the user should see that the selected remote unit is deleted")
    public void theUserShouldSeeThatTheSelectedRemoteUnitIsDeleted() {
        rup.verifyDeletedFromRemoteUnitsList("Hello World");
    }



}
