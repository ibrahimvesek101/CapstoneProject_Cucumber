package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ResuableMethods;

import java.util.List;

public class US01_StepDefinitions {

    LoginPage lp=new LoginPage();
    @Given("User clicks the login button")
    public void userClicksTheLoginButton() {

        lp.clickLogin();
    }

    @When("User enter a valid email which contains {string} and {string} signs.")
    public void userEnterAValidEmailWhichContainsAndSigns(String a, String dot) {

        String email= "bo2"+a+"qualitron"+dot+"com";
        lp.sendEmail(email);

        lp.sendPassword(ConfigReader.getProperty("password"));
    }

    @Then("User verify the email contains {string} and {string} signs")
    public void userVerifyTheEmailContainsAndSigns(String a, String dot) {

        String email= "bo2"+a+"qualitron"+dot+"com";
        Assert.assertTrue(email.contains("@") & email.contains("."));
    }

    @And("User clicks signIn button")
    public void userClicksSignInButton() {
        lp.clickSignIn();
        ResuableMethods.waitFor(2);
    }

    @Then("User verifies the site login.")
    public void userVerifiesTheSiteLogin() {
        lp.loginEmailIsDisplayed();
    }

    @When("User enters an email address that does not match the credentials")
    public void userEntersAnEmailAddressThatDoesNotMatchTheCredentials(List<String> items) {
        String email = "bo2" + items.get(0) + "qualitron";
        lp.sendEmail(email);

        lp.sendPassword(ConfigReader.getProperty("password"));
    }


    @Then("User verifies that they received the {string}")
    public void userVerifiesThatTheyReceivedThe(String arg0) {
        lp.getNotAuthorizedText();
        System.out.println("error mesaj " + arg0);
      Assert.assertEquals( lp.getNotAuthorizedText(), arg0);

    }
    @When("Enter valid username.")
    public void enterValidUsername() {

        lp.sendEmail(ConfigReader.getProperty("email"));
    }

    @And("Leave password field empty")
    public void leavePasswordFieldEmpty() {

        lp.sendPassword(" ");

    }


    @And("Leave username field empty")
    public void leaveUsernameFieldEmpty() {
        lp.sendEmail(" ");

    }

    @And("Enter valid password")
    public void enterValidPassword() {
        lp.sendPassword(ConfigReader.getProperty("password"));
    }

    @When("User enters an email address  with valid credentials")
    public void userEntersAnEmailAddressWithValidCredentials() {

        lp.sendEmail(ConfigReader.getProperty("email"));
        lp.sendPassword(ConfigReader.getProperty("password"));

    }

    @And("user goes to the All Product Page")
    public void userGoesToTheAllProductPage() {
        lp.allProductPageIsDisplayed();
    }

    @And("user clicks profile dropdown")
    public void userClicksProfileDropdown() {

        lp.clickProfileDropdown();
    }

    @And("User clicks on the Log Out button")
    public void userClicksOnTheLogOutButton() {
        lp.clickLogout();
    }

    @Then("Verify the redirected the login page")
    public void verifyTheRedirectedTheLoginPage() {
        lp.loginButtonIsDisplayed();
    }
}
