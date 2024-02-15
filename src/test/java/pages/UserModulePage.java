package pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ResuableMethods;

public class UserModulePage {

    WebDriver driver;



    public UserModulePage(){

        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "loginButton")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id='username']")
    WebElement emailField;

    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement signIn;

    @FindBy(xpath = "(//span[@class='fw-bold'])[1]")
    WebElement dropDownTab;

    @FindBy(xpath = "//a[@class='dropdown-item'][text()='Account Management']")
    WebElement accountManagement;

    @FindBy(xpath = "//*[@id='link7']//a")
    WebElement usersButton;

    @FindBy(xpath = "//h4[text()='All Users']")
    WebElement displayUsers;

    @FindBy(xpath = "//*[@id=\"MainContent\"]/div/div[1]/div[2]/button[2]")
    WebElement registerNewUserButton;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    WebElement selectRoleField;

    @FindBy(xpath = "//*[@id='react-select-2-option-4']")
    WebElement enterRole;

    @FindBy(xpath = "//*[@id='email']")
    WebElement selectEmailField;

    @FindBy(xpath = "//button[@class='btn btn-info text-white float-end']")
    WebElement registerButton;

    @FindBy(xpath = "//button[@class='btn btn-info text-white float-end']")
    WebElement verifySuccessful;

    @FindBy(xpath = "//*[@id='search']")
    WebElement searchByUsernameOrEmailField;

    @FindBy(xpath = "//*[@id='search']")
    WebElement verifySearchUsernameByUsernameOrEmailField;

    @FindBy(xpath = "//select[@id='statusFilter']")
    WebElement searchUsernameByStatusField;

    @FindBy(xpath = "//*[.='Active']")
    WebElement statusActive;

    @FindBy(xpath = "//*[@id='MainContent']/div/div[3]/div/table/tbody/tr/td[2]/a")
    WebElement selectAUserEmail;

    @FindBy(xpath = "//*[@id=\"MainContent\"]/div/div/div[1]/div[2]/span/button")
    WebElement clickEditPencilButton;

    @FindBy(xpath = "//*[@id=\"MainContent\"]/div/div/div[1]/div[2]/span/button")
    WebElement username1AtComField;


    public void clickLogin() {  loginButton.click();  }

    public void sendEmail(String email) {  emailField.sendKeys(email);  }

    public void sendPassword(String password) {  passwordField.sendKeys(password);  }

    public void signIn() {   signIn.click();  }

    public void clickDropdownTab() {
        dropDownTab.click();
        ResuableMethods.waitForVisibility(dropDownTab, 5);
    }

    public void clickAccountManagement() {

        try {   ResuableMethods.waitFor(3);
            accountManagement.click();
            System.out.println("accountManagement = " + accountManagement.getText());

        } catch (NoSuchElementException e) {         }

    }

    public void UsersButton() {  ResuableMethods.click(usersButton);   }

    public void DisplayUsers() {
        Assert.assertTrue(displayUsers.isDisplayed());
    }

    public void RegisterNewUser() {
        registerNewUserButton.click();
        ResuableMethods.waitFor(5);
    }

    public void SelectRoleField() {
        selectRoleField.click();
        ResuableMethods.waitFor(3);
        enterRole.click();
        ResuableMethods.waitFor(3);
    }

    public void SelectEmailField() {
        selectEmailField.click();
        selectEmailField.sendKeys("hakan@efe.com");
        ResuableMethods.waitFor(3);
    }

    public void RegisterButton() {
        registerButton.click();
        ResuableMethods.waitFor(3);
    }

    public void VerifiedSuccessful() {
        Assert.assertTrue(verifySuccessful.isDisplayed());
    }

    public void SearchUsernameByUsernameOrEmailField() {
        searchByUsernameOrEmailField.click();
        searchByUsernameOrEmailField.sendKeys("hakan@efe.com");
        ResuableMethods.waitFor(10);
    }

    public void VerifySearchUsernameByUsernameOrEmailField() {
        Assert.assertTrue(verifySearchUsernameByUsernameOrEmailField.isDisplayed());
    }

    public void SearchUsernameByStatusField() {
        searchUsernameByStatusField.click();
        searchUsernameByStatusField.sendKeys("Pending User Action");
        ResuableMethods.waitFor(3);
    }

    public void StatusActive() {
        statusActive.click();
    }

    public void SelectAUserEmail() {
        selectAUserEmail.click();
    }

    public void ClickEditPencilButton() {
        clickEditPencilButton.click();
    }







    ///////   US17-User Page Objects and methods   ///////



    String emailForUserInvitation = "team02@gmail.com";


    @FindBy (id = "link7")
    private WebElement userLinkLi;

    public void clickUserLinkLi(){
        userLinkLi.click();
    }

    //////////////////////////////
    @FindBy(xpath = "//button[.='+ Invite New User']")
    private WebElement inviteNewUserButton;

    public void clickInviteNewUserButt(){
        inviteNewUserButton.click();
    }
    //////////////////////////////

    @FindBy(xpath = "//button[.='+ Register New User']")
    private WebElement registerNewUserButt;

    public void clickRegisterNewUserButton(){
        registerNewUserButt.click();
    }


        //////////////////////////////

    @FindBy(xpath = "//div[@class=' css-b62m3t-container']")
    private WebElement selectRoleDivv;

    public void clickSelectRoleDiv(){
        selectRoleDivv.click();
    }

    //////////////////////////////
    @FindBy(xpath = "//*[.='Store Manager']")
    private WebElement storeManagerAsRolee;

    public void clickStoreManagerAsRolee(){
        storeManagerAsRolee.click();
    }
    //////////////////////////////

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInputInRoleDiv;

    public void sendKeysEmailInputInRoleDiv(){
        emailInputInRoleDiv.sendKeys(emailForUserInvitation);
    }
    //////////////////////////////
    @FindBy(xpath = "//button[.='Register']")
    private WebElement registerButtonInRoleDive;


    public void clickRegisterButtonInRoleDiv(){
        registerButtonInRoleDive.click();
    }

        //////////////////////////////

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    private WebElement selectRoleInInviteDiv;


    public void clickSelectRoleInInviteDiv(){
        selectRoleInInviteDiv.click();
        ResuableMethods.waitFor(2);
    }


    //////////////////////////////
    @FindBy(xpath = "//*[.='Purchase Personnel']")
    private WebElement purchasePersonnelAsRolee;

    public void clickPurchasePersonnelAsRole(){
        purchasePersonnelAsRolee.click();
    }


        //////////////////////////////

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement emailInputInInviteDivv;


    public void sendKeysEmailInputInInviteDiv(){
        ResuableMethods.waitFor(2);
        emailInputInInviteDivv.sendKeys(emailForUserInvitation);
    }

    //////////////////////////////
    @FindBy(xpath = "//button[.='Send Invitation']")
    private WebElement sendInvitationButt;

    public void clickSendInvitationButton(){
        ResuableMethods.waitFor(2);
        sendInvitationButt.click();
    }
    //////////////////////////////
    @FindBy(xpath = "//strong[.='Successful']")
    private WebElement successfulMesage;

    public void verifySuccessfulMessage(){

    }
    //////////////////////////////
    @FindBy(xpath = "//p[.='A invitation e-mail has been sent to the e-mail address you entered']")
    private WebElement successfulP;

    public void verifySuccessfulP(){
        successfulP.isDisplayed();
    }

    //////// Login Method ////////
    @FindBy(id="loginButton")
    private WebElement loginBut;

    public void clickLoginButt(){
        ResuableMethods.click(loginBut);
    }

    @FindBy(id = "username")
    private WebElement usernameLoginPagee;

    public void sendKeysUsernameLoginPage(){
        ResuableMethods.waitFor(2);
        ResuableMethods.sendKeys(usernameLoginPagee,"bo2@qualitron.com");
    }
    @FindBy(id = "password")
    private WebElement passwordLoginPagee;

    public void sendKeysPasswordLoginPagee(){
        ResuableMethods.waitFor(2);
        ResuableMethods.sendKeys(passwordLoginPagee,"iWHQfoXTnEgus2_");
    }
    /////////////////
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signinButt;

    @FindBy(xpath = "(//span[@class='fw-bold'])[1]")
    private WebElement profileDropdow;
    @FindBy(xpath = "//a[@class='dropdown-item'][text()='Account Management']")
    private WebElement accountManagement_butt;

    public void clickSiginButt(){
        ResuableMethods.waitFor(1);
        ResuableMethods.click(signinButt);
        ResuableMethods.waitFor(1);
        ResuableMethods.click(profileDropdow);
        ResuableMethods.click(accountManagement_butt);
    }





}

