package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TeamsPage;

public class US14_StepDefinitions {

    TeamsPage tp = new TeamsPage();

    /*@When("The User clicks Teams button")
    public void TheUserclicksTeamsbutton() {

    }*/

    @And("The User clicks on first clickable team")
    public void TheUserClicksOnFirstClickableTeam() {
        tp.clickFirstTeam();  }

    @And("The user clicks the Edit Team button on the top right of the page")
    public void TheUserClicksTheEditTeamButtonOnTheTopRightOfThePage(){
        tp.addNewAndEditTeam();
    }
    @And("The user fills in the blanks on the opened page and clicks the save button")
    public void TheUserFillsInTheBlanksOnTheOpenedPageAndClicksTheSaveButton() {
        tp.updateTeam();
    }

    @Then("The User verifies change in team information")
    public void TheUserVerifiesChangeInTeamInformation() {
        tp.verifyTeam();
    }
    @When("The user clicks Delete the Team button at the bottom left of the page")
    public void TheUserClicksTheTeamButtonAtTheBottomLeftOfThePage(){
        tp.deleteTeam();
    }
    @And("The user clicks the OK button on the Alert Message at the top of the page")
    public void TheUserClicksTheOKButtonOnTheAlertMessageAtTheTopOfThePage() {
        tp.alertMessage();
    }
    @Then("The User verifies that the deleted team no longer exists on the page")
    public void TheUserVerifiesThatTheDeletedTeamNoLongerExistsOnThePage() {
        tp.assertVerified();
    }

}
