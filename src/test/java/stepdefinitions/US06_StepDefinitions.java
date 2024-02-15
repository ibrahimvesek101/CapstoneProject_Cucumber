package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CompanyPage;
import pages.LoginPage;
import utils.ResuableMethods;

public class US06_StepDefinitions {

    CompanyPage cp = new CompanyPage();
    LoginPage loginPage= new LoginPage();

    @Given("The user logs inn")
    public void theUserLogsInn() {
        loginPage.signInToAccountManagement();
    }

    @And("User clicks Company Button")
    public void userClicksCompanyButton() {
        cp.getCompanyButton().click();
    }

    @And("User clicks the edit button")
    public void userClicksTheEditButton() {
        cp.getEditButton().click();
        ResuableMethods.waitFor(3);
    }

    @And("User changes company name with Her Company")
    public void userChangesCompanyNameWithHerCompany() {
        cp.getNameField().click();
        cp.getNameField().clear();
        cp.getNameField().sendKeys("Her Company");
        ResuableMethods.waitFor(2);
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        ResuableMethods.waitFor(3);
        cp.getSaveButton().click();
        ResuableMethods.waitFor(3);
    }

    @Then("User should see the company name is Her Company")
    public void userShouldSeeTheCompanyNameIsHerCompany() {
        String newName = "Her Company";
        Assert.assertEquals(cp.getVerifyName().getText(),"Her Company");
    }

    @And("User deletes company name")
    public void userDeletesCompanyName() {
        ResuableMethods.waitFor(3);
        cp.getNameField().clear();
        ResuableMethods.waitFor(2);
    }
    @And("User clicks save buttonn")
    public void userClicksSaveButtonn() {
        cp.getSaveButton().click();
        ResuableMethods.waitFor(3);
    }


    @Then("User should see the Please enter a name for company text.")
    public void userShouldSeeThePleaseEnterANameForCompanyText() {
        ResuableMethods.waitFor(5);
        System.out.println(cp.getEnterNameTxt().getText());
        cp.getEnterNameTxt().isDisplayed();
        ResuableMethods.waitFor(3);
    }

    @And("User edits company name with blank space")
    public void userEditsCompanyNameWithBlankSpace() {
        cp.getNameField().click();
        cp.getNameField().clear();
        cp.getNameField().sendKeys(" ");
        ResuableMethods.waitFor(2);


    }

    @Then("Please enter a name for company text should have seen")//Görünmüyor, bug1
    public void pleaseEnterANameForCompanyTextShouldHaveSeen() {
        Assert.assertTrue(cp.getEnterNameTxt().isDisplayed());
        ResuableMethods.waitFor(3);
    }


    @And("User edits company email with Hello")
    public void userEditsCompanyEmailWithHello() {
        cp.getEmailField().click();
        cp.getEmailField().clear();
        cp.getEmailField().sendKeys("Hello");
        ResuableMethods.waitFor(3);

    }

    @Then("User should see an error about it is not a valid email")// @ olmadan da emaili kabul ediyor-->bug2
    public void userShouldSeeAnErrorAboutItIsNotAValidEmail() {
        String text= cp.getEmailTxt().getText();
        ResuableMethods.waitFor(3);
        Assert.assertTrue(text.contains("@"));
    }

    @And("User edits company email with gulertuzuner@gmail.com")
    public void userEditsCompanyEmailWithGulertuzunerGmailCom() {
        cp.getEmailField().click();
        cp.getEmailField().clear();
        cp.getEmailField().sendKeys("gulertuzuner@gmail.com");
        ResuableMethods.waitFor(3);

    }

    @Then("User should see the this email address is displayed.")
    public void userShouldSeeTheThisEmailAddressIsDisplayed() {
        Assert.assertEquals("gulertuzuner@gmail.com",cp.getEmailTxt().getText());

    }


    @And("User clicks the cancel button")
    public void userClicksTheCancelButton() {
        cp.getCancelButton().click();
        ResuableMethods.waitFor(3);

    }

    @Then("User should see the old name appears.")
    public void userShouldSeeTheOldNameAppears() {
        System.out.println(cp.getVerifyName().getText());
        Assert.assertTrue(cp.getVerifyName().isDisplayed());

    }

    @Then("User should see the error message disappears.")
    public void userShouldSeeTheErrorMessageDisappears() {
        Assert.assertFalse(cp.getEnterNameTxt().isDisplayed());
    }

    @And("User changes company name with Queen Company")
    public void userChangesCompanyNameWithQueenCompany() {
        cp.getNameField().clear();
        cp.getNameField().sendKeys("Queen Company");
        ResuableMethods.waitFor(2);
    }


    @And("User clicks the save button")
    public void userClicksTheSaveButton() {
        cp.getSaveButton().click();
        ResuableMethods.waitFor(2);
    }

    @And("User logs out")
    public void userLogsOut() {
        loginPage.logOut();
    }
    @And("The user logs in again")
    public void theUserLogsInAgain() {
        loginPage.signInLogin();
    }

    @Then("User should see the name is changed on profile dropdown")
    public void userShouldSeeTheNameIsChangedOnProfileDropdown() {
        ResuableMethods.waitFor(5);
        System.out.println(cp.getCompanyNameOnDropdown().getText());
        String name= "Queen Company";
        Assert.assertEquals(name,cp.getCompanyNameOnDropdown().getText());
    }



}
