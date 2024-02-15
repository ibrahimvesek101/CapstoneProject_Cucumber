package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.UserModulePage;
import utils.ResuableMethods;

public class US17_StepDefinitions {
    UserModulePage userMP = new UserModulePage();
    LoginPage lp = new LoginPage();
    @And("user click on the User button")
    public void userClickOnTheUserButton() {
        ResuableMethods.waitFor(5);
        userMP.clickUserLinkLi();
    }

    @And("user click on the register New User button")
    public void userClickOnTheRegisterNewUserButton() {
        ResuableMethods.waitFor(2);
        userMP.clickRegisterNewUserButton();
        ResuableMethods.waitFor(5);
    }

    @And("user select a role")
    public void userSelectARole() {
        userMP.clickSelectRoleDiv();
        ResuableMethods.waitFor(2);
        userMP.clickStoreManagerAsRolee();
    }

    @And("user enter my email address")
    public void userEnterMyEmailAddress() {
        userMP.sendKeysEmailInputInRoleDiv();
    }

    @And("user click on the register button")
    public void userClickOnTheRegisterButton() {
        userMP.clickRegisterButtonInRoleDiv();
    }

    @Then("user should see the successful window")
    public void userShouldSeeTheSuccessfulWindow() {
        userMP.verifySuccessfulMessage();
    }

    @Given("User logsin and click the account")
    public void userLogsinAndClickTheAccount() {
        userMP.clickLoginButt();
        userMP.sendKeysUsernameLoginPage();
        userMP.sendKeysPasswordLoginPagee();
        userMP.clickSiginButt();

    }

    @And("user click on the invite user button")
    public void userClickOnTheInviteUserButton() {
        userMP.clickInviteNewUserButt();
    }

    @And("user select the role")
    public void userSelectTheRole() {
        userMP.clickSelectRoleDiv();
        ResuableMethods.waitFor(2);
        userMP.clickStoreManagerAsRolee();

    }

    @Then("user click on the send invitation button")
    public void userClickOnTheSendInvitationButton() {
        userMP.clickSendInvitationButton();
    }

    @Given("user use reusable method")
    public void userUseReusableMethod() {
        lp.signInToAccountManagement();
    }
}
