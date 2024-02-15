package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RemoteUnitPage;
import utils.Driver;
import utils.ResuableMethods;

public class US10_StepDefinitions {

    RemoteUnitPage rup= new RemoteUnitPage();
  //  @Given("the user is on the {string} page")
  //  public void theUserIsOnThePage(String url) {
  //      Driver.getDriver().get(url);
  //  }
    @When("the user logs in as a valid user")
    public void theUserLogsInAsAValidUser() {
        LoginPage login= new LoginPage();
        login.signInLogin();
    }
    @And("the user navigates to the Account Management section from the dropdown menu")
    public void theUserNavigatesToTheSectionFromTheDropdownMenu() {
        rup.clickDropdownMenu();
        rup.clickAccountManagement();
    }
    @And("the user  clicks remote units tab")
    public void theUserClicksRemoteUnitsTab() {
        rup.clickRemoteUnitsTab();
    }

    @Then("the user should be able to see the added remote unit in the list")
    public void theUserShouldBeAbleToSeeTheAddedRemoteUnitInTheList() {
        rup.verifyFromRemoteUnitsList("Hello");
    }


    @Then("the user should be able to see the remote unit list")
    public void theUserShouldBeAbleToSeeTheAddedRemoteUnitList() {
        rup.verifyRemoteUnitsList();
    }

    @Then("Verify that the user can not view a remote unit that does not exist")
    public void verifyThatTheUserCanNotViewARemoteUnitThatDoesNotExist() {
        rup.verifyRemoteUnitDoesNotExist();
    }
}
