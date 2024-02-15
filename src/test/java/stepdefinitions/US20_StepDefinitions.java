package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.RolesPermissionPage;
import utils.Driver;




public class US20_StepDefinitions {
    RolesPermissionPage rpp = new RolesPermissionPage();

    LoginPage lp=new LoginPage();


    @When("User logins")
    public void userLogins() {
        lp.signInToAccountManagement();
    }

    @And("User clicks Permissions button")
    public void userClicksPermissionsButton() {
        rpp.permissionsButtonClick();
    }



    @Then("User should verifies all permissions is displayed")
    public void userShouldVerifiesAllPermissionsIsDisplayed() {

        rpp.verifyPermissionList();

    }


}
