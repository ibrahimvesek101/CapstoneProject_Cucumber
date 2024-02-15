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

public class US02_StepDefinitions {

    LoginPage lp=new LoginPage();
    @Given("User login with valid credentials")
    public void userLoginWithValidCredentials() {

        lp.signInLogin();
    }

    @When("User click on the logo")
    public void userClickOnTheLogo() {
        lp.clickLogo();
        ResuableMethods.waitFor(2);
    }

    @And("User verifies url changes when click the logo")
    public void userVerifiesUrlChangesWhenClickTheLogo() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));
    }

    @Then("User verifies return to marketplace page again")
    public void userVerifiesReturnToMarketplacePageAgain() {
        lp.clickGoToMarketPlaceButton();
        ResuableMethods.waitFor(2);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("marketplaceurl"));

    }

    @When("User verifies the visibility of the sidebar sections after login")
    public void userVerifiesTheVisibilityOfTheSidebarSectionsAfterLogin() {

        lp.sidebarIsDisplayed();
    }

    @Then("user clicks on each function on the sidebar verifies that the pages and the url are changing")
    public void userClicksOnEachFunctionOnTheSidebarVerifiesThatThePagesAndTheUrlAreChanging() {

        String currentUrl=Driver.getDriver().getCurrentUrl();
       lp.clickSideBarItem5();
       String secondUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrlPartUrl= "wish";
        Assert.assertTrue(secondUrl.contains(expectedUrlPartUrl));

        lp.clickSideBarItem7();
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(),currentUrl );
    }


    @And("User close page")
    public void userClosePage() {

        Driver.getDriver().close();
    }


}
