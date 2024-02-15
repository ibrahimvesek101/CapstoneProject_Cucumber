package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDefinitions {
    LoginPage lp = new LoginPage();


    @When("User click the login button")
    public void userClickTheLoginButton() {
        lp.clickLogin();
    }

    @And("Enter the email and the password")
    public void enterTheEmailAndThePassword() {
        lp.sendEmail(ConfigReader.getProperty("email"));
        lp.sendPassword(ConfigReader.getProperty("password"));
    }

    @And("Click the sign in button")
    public void clickTheSignInButton() {
        lp.clickSignIn();
    }

    @And("Click profile dropdown")
    public void clickProfileDropdown() {
        lp.clickProfileDropdown();
    }

    @Then("Click the Account Management tab")
    public void clickTheAccountManagementTab() {
        lp.clickAccountManagement();
    }


}
