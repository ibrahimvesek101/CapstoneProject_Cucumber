package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.Driver;
import utils.ResuableMethods;

import java.util.List;

public class US03_StepDefinitions {

    LoginPage lp=new LoginPage();


    @Given("User login with valid credential")
    public void userLoginWithValidCredential() {
        lp.signInLogin();
    }

    @When("user login user on the marketplace page")
    public void userLoginUserOnTheMarketplacePage() {
        lp.allProductPageIsDisplayed();

    }

    @When("User clicks the profile dropdown")
    public void userClicksTheProfileDropdown() {
        ResuableMethods.waitFor(2);
        lp.clickProfileDropdown();
        ResuableMethods.waitFor(2);
    }

    @Then("Verify the username and role is displayed")
    public void verifyTheUsernameAndRoleIsDisplayed() {
      Assert.assertTrue( lp.verifyUsername());
      Assert.assertTrue(lp.verifyRole());
    }


    @And("User should display each items under dropdown")
    public void userShouldDisplayEachItemsUnderDropdown() {
        Assert.assertEquals(lp.profileDropdownItemsSize(),6);
        lp.verifyProfileDropdownItems();
    }

    @Then("Some of tabs are selected it is verified that the url changes")
    public void someOfTabsAreSelectedItIsVerifiedThatTheUrlChanges() {
        lp.clickProfileItem();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));
        lp.clickGoToMarketPlaceButton();
        lp.clickProfileDropdown();
        lp.clickAccountManagementItem();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("a3m/"));
    }



}

   
