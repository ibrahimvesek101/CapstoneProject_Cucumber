package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TeamsPage;
import utils.ResuableMethods;

public class US13_StepDefinitions {


    TeamsPage tp = new TeamsPage();

    @Then("The user verifies that the listed teams appear on the page")
    public void TheUserVerifiesThatTheListedTeamsAppearOnThePage() throws InterruptedException {

        tp.listAssertion();

}

    @When("User clicks on first clickable team")
    public void userClicksOnFirstClickableTeam() {
        tp.clickFirstTeam();
    }

    @When("User clicks Teams button")
    public void userClicksTeamsButton() throws InterruptedException {

          tp.teamsPage();

    }

    @Then("User verifies that the clickable team's information appears on the page in detail")
    public void userVerifiesThatTheClickableTeamSInformationAppearsOnThePageInDetail() {
        tp.teamInfoAssertion();
    }

    @When("The user clicks the Add New Team button at the top right of the page")
    public void theUserClicksTheAddNewTeamButtonAtTheTopRightOfThePage() {
        tp.addNewAndEditTeam();
    }

    @And("user fills in the blanks on the opened page and clicks the save button")
    public void userFillsInTheBlanksOnTheOpenedPageAndClicksTheSaveButton() {
        tp.inputInfo();
    }

    @And("The user clicks the teams button on the left side of the page")
    public void theUserClicksTheTeamsButtonOnTheLeftSideOfThePage() throws InterruptedException {
        tp.teamsBackPage();
    }

    @Then("User verifies that the added team exists on the teams page")
    public void userVerifiesThatTheAddedTeamExistsOnTheTeamsPage() {

        tp.newTeamListAssertion();
    }
}
