package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserModulePage;
import utils.ConfigReader;
import utils.ResuableMethods;

public class US15_StepDefinitions {

    UserModulePage ump = new UserModulePage();


    @Given("The User clicks to login button")
    public void theUserClicksToLoginButton() {
        ump.clickLogin();
    }

    @And("User enters an username or email and password")
    public void userEntersAnUsernameOrEmailAndPassword() {
        String email = "bo2@qualitron.com";
        ump.sendEmail(email);

        ump.sendPassword(ConfigReader.getProperty("password"));
    }

    @And("User clicks on Sign in button")
    public void userClicksOnSignInButton() {
        ump.signIn();
        ResuableMethods.waitFor(3);
    }

    @And("User clicks the DropDown tab with profile information")
    public void userClicksTheDropDownTabWithProfileInformation() {
        ump.clickDropdownTab();
        ResuableMethods.waitFor(5);
    }

    @And("User selects Account Management and click it")
    public void userSelectsAccountManagementAndClickIt() {
        ump.clickAccountManagement();
    }

    @And("User clicks to Users button")
    public void userClicksToUsersButton() {
        ResuableMethods.waitFor(3);
        ump.UsersButton();
    }

    @Then("Display Users in the Users module")
    public void displayUsersInTheUsersModule() {
        ump.DisplayUsers();
    }

    @When("User clicks Register New User button")
    public void userClicksRegisterNewUserButton() {
        ump.RegisterNewUser();
    }

    @And("User enters a Role in New User Registration")
    public void userEntersARoleInTheRolesSection() {
        ump.SelectRoleField();
    }

    @And("User enters an Email")
    public void userEntersAnEmail() {

        ump.SelectEmailField();
    }

    @And("User clicks Register button")
    public void userClicksRegisterButton() {
        ump.RegisterButton();
    }

    @And("User clicks Close button")
    public void userClicksCloseButton() {
    }

    @Then("User verifies that new user have been added successfully")
    public void userVerifiesThatNewUserHaveBeenAddedSuccessfully() {
        ump.VerifiedSuccessful();
    }


    @Then("User see a green tick for the user whose mail has been confirmed")
    public void userSeeAGreenTickForTheUserWhoseMailHasBeenConfirmed() {
    }

    @Then("User verifies that no new user has been added without a role")
    public void userVerifiesThatNoNewUserHasBeenAddedWithoutARole() {
    }

    @Then("User verifies that no new user has been added without an email")
    public void userVerifiesThatNoNewUserHasBeenAddedWithoutAnEmail() {
    }

    @When("User enters an username or email in the Search by username or email field")
    public void userEntersAnUsernameOrEmailInTheSearchByUsernameOrEmailField() {
        ump.SearchUsernameByUsernameOrEmailField();
    }

    @Then("User Verify that username or email have been seen below")
    public void userVerifyThatUsernameOrEmailHaveBeenSeenBelow() {
        ump.VerifySearchUsernameByUsernameOrEmailField();
    }

    @When("User clicks the Status field")
    public void userClicksTheStatusField() {
        ump.SearchUsernameByStatusField();
        ump.StatusActive();
        ResuableMethods.waitFor(3);
    }

    @And("User selects Pending User Action status")
    public void userSelectsPendingUserActionStatus() {
    }

    @Then("The user verifies that all Pending user Action are coming by searching with Status")
    public void theUserVerifiesThatAllPendingUserActionAreComingBySearchingWithStatus() {
    }


}
