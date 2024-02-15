package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.UserProfilePage;
import utils.ResuableMethods;

public class US04_StepDefinitions {
    UserProfilePage upp = new UserProfilePage();

    LoginPage lp=new LoginPage();
    @Given("User logs in")
    public void userLogsIn() {
        lp.signInToAccountManagement();

    }



    @And("I click on the Change Password button")
    public void ıClickOnTheChangePasswordButton() {
        upp.clickchangePasswordButton();

    }

    @And("I click on the New password")
    public void ıClickOnTheNewPassword() {
        upp.clickNewPassword();
    }


    @And("I enter the new password")
    public void ıEnterTheNewPassword() {
        upp.sendNewPassword("iWHQfoXTnEgus2_");
    }


    @And("I click on the New password again")
    public void ıClickOnTheNewPasswordAgain() {
        upp.clickNewPassword2();
    }


    @And("I enter the new password again")
    public void ıEnterTheNewPasswordAgain() {
        upp.sendNewPassword2("iWHQfoXTnEgus2_");
    }


    @And("I click on the Confirm button")
    public void ıClickOnTheConfirmButton() {
        upp.clickConfirm();


    }


    @Then("I should see the Subscription displayed")
    public void ıShouldSeeTheSubscriptionDisplayed() {
        ResuableMethods.waitFor(3);
        upp.verifysuccesfullyText();

    }



    @And("I click the Change Password button")
    public void ıClickTheChangePasswordButton() {
        upp.clickchangePasswordButton();
    }


    @And("I click the New password box")
    public void ıClickTheNewPasswordBox() {
        upp.clickNewPassword();
    }


    @And("I enter the new invalid password")
    public void ıEnterTheNewInvalidPassword() {
        upp.sendNewPassword("Aa123½");
    }


    @And("I click the New password box again")
    public void ıClickTheNewPasswordBoxAgain() {
        upp.clickNewPassword2();
    }


    @And("I enter the new invalid password again")
    public void ıEnterTheNewInvalidPasswordAgain() {
        upp.sendNewPassword2("Aa123½");
    }


    @And("I click the Confirm button")
    public void ıClickTheConfirmButton() {
        upp.clickConfirm();
    }


    @Then("I should see the error masage")
    public void ıShouldSeeTheErrorMasage() {
        upp.errorMassage();

    }


    @And("I click click the Change Password button")
    public void ıClickClickTheChangePasswordButton() {
        upp.clickchangePasswordButton();
    }


    @And("I click click the New password box")
    public void ıClickClickTheNewPasswordBox() {
        upp.clickNewPassword();
    }


    @And("I enter enter the new password")
    public void ıEnterEnterTheNewPassword() {
        upp.sendNewPassword("Aa123456789012345678&");
    }


    @And("I click enter the New password box again")
    public void ıClickEnterTheNewPasswordBoxAgain() {
        upp.clickNewPassword2();
    }


    @And("I enter enter the new password again")
    public void ıEnterEnterTheNewPasswordAgain() {
        upp.sendNewPassword2("Aa123456789012345678&");
    }

    @And("I click click the Confirm button")
    public void ıClickClickTheConfirmButton() {
        upp.clickConfirm();
    }


    @Then("I should should see the Subscription displayed")
    public void ıShouldShouldSeeTheSubscriptionDisplayed() {
        upp.errorMassage();
    }

    @And("I click the the Change Password button")
    public void ıClickTheTheChangePasswordButton() {
        upp.clickchangePasswordButton();
    }


    @And("I click the the New password box")
    public void ıClickTheTheNewPasswordBox() {
        upp.clickNewPassword();
    }


    @And("I enter the the new password")
    public void ıEnterTheTheNewPassword() {
        upp.sendNewPassword("A12345678&");
    }



    @And("I click the the New password box again")
    public void ıClickTheTheNewPasswordBoxAgain() {
        upp.clickNewPassword2();
    }


    @And("I enter the the new password again")
    public void ıEnterTheTheNewPasswordAgain() {
        upp.sendNewPassword2("A12345678&");
    }


    @And("I click the the Confirm button")
    public void ıClickTheTheConfirmButton() {
        upp.clickConfirm();
    }




    @Then("I should see the the Subscription displayed")
    public void ıShouldSeeTheTheSubscriptionDisplayed() {
        upp.kucukharfeksikHatası();
    }


    @And("I am clicking the Change Password button")
    public void ıAmClickingTheChangePasswordButton() {
        upp.clickchangePasswordButton();
    }


    @And("I am clicking the New password box")
    public void ıAmClickingTheNewPasswordBox() {
        upp.clickNewPassword();
    }

    @And("I am entering the new password")
    public void ıAmEnteringTheNewPassword() {
        upp.sendNewPassword("Aasdfghjk%");
    }

    @And("I am clicking the New password box again")
    public void ıAmClickingTheNewPasswordBoxAgain() {
        upp.clickNewPassword2();
    }

    @And("I am entering the new password again")
    public void ıAmEnteringTheNewPasswordAgain() {
        upp.sendNewPassword2("Aasdfghjk%");
    }

    @And("I am clicking the Confirm button")
    public void ıAmClickingTheConfirmButton() {
        upp.clickConfirm();
    }

    @Then("I should see the Subscription displayedd")
    public void ıShouldSeeTheSubscriptionDisplayedd() {
        upp.rakamEksikHatasi();
    }





    @And("I click on the {string} button")
    public void ıClickOnTheButton(String arg0) {
        upp.clickchangePasswordButton();
    }


    @And("I click on the {string} box")
    public void ıClickOnTheBox(String arg0) {
        upp.clickNewPassword();

    }

    @And("I enter the {string}")
    public void ıEnterThe(String arg0) {
        upp.sendNewPassword("A12345%");

    }

    @And("I click on the {string} box again")
    public void ıClickOnTheBoxAgain(String arg0) {
        upp.clickNewPassword2();
    }

    @And("I enter the {string} again")
    public void ıEnterTheAgain(String arg0) {
        upp.sendNewPassword2("A12345%");

    }

    @Then("I should see the {string} displayed")
    public void ıShouldSeeTheDisplayed(String arg0) {
        upp.setErrormessage2();
    }

    @And("I click on the {string} field")
    public void ıClickOnTheField(String arg0) {
        upp.clickchangePasswordButton();
    }

    @And("I enter a new password")
    public void ıEnterANewPassword() {
        upp.sendNewPassword(" ");
    }

    @And("I click on the {string} field again")
    public void ıClickOnTheFieldAgain(String arg0) {
        upp.clickchangePasswordButton();
    }

    @And("I re-enter the new password")
    public void ıReEnterTheNewPassword() {
        upp.sendNewPassword2(" ");
    }

    @Then("I should see that the {string} is displayed")
    public void ıShouldSeeThatTheIsDisplayed(String arg0) {
        upp.setErrorMessage3();
    }



 }

