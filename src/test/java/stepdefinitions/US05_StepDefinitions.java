package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.SubscriptionPage;

public class US05_StepDefinitions {


    SubscriptionPage sp=  new SubscriptionPage();
    LoginPage loginP = new LoginPage();
    @Given("The user logs in")
    public void theUserLogsIn() {
        loginP.signInToAccountManagement();
    }


    @And("User clicks Subscription Button")
    public void userClicksSubscriptionButton() {
        sp.getSubscriptionButton().click();


    }

    @Then("User should see the subscription is displayed")
    public void userShouldSeeTheSubscriptionIsDisplayed() {
        sp.getSubscriptionHeader().isDisplayed();
    }


    @And("User clicks on GM3 Dev")
    public void userClicksOnGM3Dev() {
        sp.getGM3Dev().click();
    }

    @Then("User should see Subscription Informations is displayed")
    public void userShouldSeeSubscriptionInformationsIsDisplayed() {
        sp.subsInfoHeader();
    }


    @Then("User should see the Subs ID is displayed in Subs Informations Page")
    public void userShouldSeeTheSubsIDIsDisplayedInSubsInformationsPage() {sp.subsID();
    }

    @Then("User should see the Subscription Type is Ali in Subscription Informations Page")
    public void userShouldSeeTheSubscriptionTypeIsAliInSubscriptionInformationsPage() {
        sp.subsType();
    }



}
