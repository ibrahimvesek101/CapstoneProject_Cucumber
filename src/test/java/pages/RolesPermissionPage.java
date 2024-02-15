package pages;

import org.bouncycastle.est.LimitedSource;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ResuableMethods;

import java.awt.event.ActionListener;
import java.util.List;

public class RolesPermissionPage {

    WebDriver driver;

    public RolesPermissionPage() {

        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class='text-start text-nowrap d-none d-md-block ps-2']")
    WebElement profileDropdown;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    WebElement accountManagementButton;

    @FindBy(xpath = "//*[@id='link8']/a[1]")
    WebElement rolesButton;

    @FindBy(xpath = "(//button[@class='btn btn-light border w-100 mw-100 text-start'])[8]")
    WebElement roleOfQualityController;

    @FindBy(xpath = "(//button[@class='btn btn-light border w-100 mw-100 text-start'])[9]")
    WebElement roleOfQualityManager;

    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-4 col-sm-6 col-12 d-grid mb-2'])[1]")
    WebElement theFirstprivilegeOfQualityManager;

    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-4 col-sm-6 col-12 d-grid mb-2'])[5]")
    WebElement theFifthprivilegeOfQualityController;

    @FindBy(xpath = "//*[@id='link9']/a[1]")
    WebElement permissionsButton;

    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2'])[1]")
    WebElement theFirstpermissionOfPermissionsButton;

    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2'])[85]")
    WebElement theEightyFifthtpermissionOfPermissionsButton;

    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2'])[136]")
    WebElement oneHundredandThirtySixthPermissionOfPermissionsButton;


    @FindBy(xpath = "//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2']")
    List<WebElement> rolesList;



    @FindBy(xpath = "//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2']")
    List<WebElement> permissionList;


    public void verifyPermissionList(){

        Assert.assertTrue(permissionList.size() > 0);

    }







    public void profileDropdownClick() {
        profileDropdown.click();
    }



    public void rolesButtonClick() {rolesButton.click();}

    public void qualityControllerButtonClick() {roleOfQualityController.click();}

    public void qualityManagerButtonClick() {roleOfQualityManager.click();
        ResuableMethods.waitFor(2);
    }

    public void theFirstprivilegeOfQualityManagerDisplay() {theFirstprivilegeOfQualityManager.isDisplayed();}

    public void theFifthprivilegeOfQualityControllerDisplay() {theFifthprivilegeOfQualityController.isDisplayed();}

    public void permissionsButtonClick() {permissionsButton.click();}

    public void theFirstpermissionOfPermissionsButtonClick() {theFirstpermissionOfPermissionsButton.click();}

    public void theEightyFifthtpermissionOfPermissionsButtonClick() {theEightyFifthtpermissionOfPermissionsButton.click();}

    public void oneHundredandThirtySixthPermissionOfPermissionsButtonClick() {oneHundredandThirtySixthPermissionOfPermissionsButton.click();}

    public void verificationOfRolesButton(){
        System.out.println("rolesButton.getText()=" + rolesButton.getText());
        Assert.assertTrue(rolesButton.getText().contains("Customer"));
    }
    public void verificationOfPrivileges(){
        System.out.println("theFifthprivilegeOfQualityController.getText()=" + theFifthprivilegeOfQualityController.getText());
        Assert.assertTrue(theFifthprivilegeOfQualityController.getText().contains("file-read"));
    }
    public void verificationOfPermissionsButton(){
        System.out.println("oneHundredandThirtySixthPermissionOfPermissionsButton.getText()=" + oneHundredandThirtySixthPermissionOfPermissionsButton.getText());
        Assert.assertTrue(theFifthprivilegeOfQualityController.getText().contains("zzzzz"));
    }



    public void clickARole(){

        ResuableMethods.waitFor(5);
        rolesList.get(2).click();
        ResuableMethods.waitFor(5);
    }


    public void verifyAllRoles(){

        Assert.assertEquals( rolesList.get(7).getText(), "Quality Controller");
    }








}


