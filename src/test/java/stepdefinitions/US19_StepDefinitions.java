package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.RolesPermissionPage;
import utils.Driver;
import utils.ResuableMethods;



public class US19_StepDefinitions {

    RolesPermissionPage rpp = new RolesPermissionPage();

    LoginPage lp=new LoginPage();



    @When("User sohuld login")
    public void userSohuldLogin() {

        lp.signInToAccountManagement();
    }

    @Then("Click the Roles tab")
    public void clickTheRolesTab() {

        rpp.rolesButtonClick();
    }


    @Then("User should click a role")
    public void userShouldClickARole() {

        ResuableMethods.waitFor(5);
        rpp.clickARole();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa-gm3.quaspareparts.com/a3m/#/role/30");
    }
}
