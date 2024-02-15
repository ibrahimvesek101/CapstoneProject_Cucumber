package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.RolesPermissionPage;
import utils.Driver;
import utils.ResuableMethods;




public class US18_StepDefinitions {


    RolesPermissionPage rpp = new RolesPermissionPage();

    LoginPage lp=new LoginPage();


    @When("User logins and come to Account Management Section")
    public void userLoginsAndComeToAccountManagementSection() {

        lp.signInToAccountManagement();
    }


    @And("User clicks Roles button")
    public void userClicksRolesButton() {

        rpp.rolesButtonClick();
    }



    @Then("User should verifies the Roles is displayed")
    public void userShouldVerifiesTheRolesIsDisplayed() {

        rpp.verifyAllRoles();
    }


}

