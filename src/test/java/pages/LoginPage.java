package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ResuableMethods;

import java.util.List;


public class LoginPage {


    WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "loginButton")
    WebElement login_button;

    @FindBy(xpath = "//input[@id='username']")
    WebElement email_input;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password_input;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit_button;

    @FindBy(xpath = "(//span[@class='fw-bold'])[1]")
    WebElement profileDropdown;

    @FindBy(xpath = "//a[@class='dropdown-item'][text()='Account Management']")
    WebElement accountManagement_button;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logout_button;

    @FindBy(xpath = "(//span[@class='fw-bold'])[1]")
    WebElement loginemailTxt;

    @FindBy(xpath = "//h5[@class]")
    WebElement notAuthorizedText;

    @FindBy(xpath = "//h4[text()='All Products ']")
    WebElement allProductTxt;

    @FindBy(xpath = "//div//a//img[@class]")
    WebElement logo;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement goToMarketPlaceButton;

    @FindBy(xpath = "//div[@class='container-fluid sidenav']")
    WebElement sidebar;

    @FindBy(xpath = "//a[text()='Wishlist']")
    WebElement sidebarItemWish;

    @FindBy(xpath = "//a[text()='Purchasing']")
    WebElement sidebarItemPurchasing;


    @FindBy(xpath = "(//span[text()='bo2@qualitron.com'])[2]")
    WebElement usernameText;

    @FindBy(xpath = "(//span[text()='Business Owner'])[2]")
    WebElement RoleText;


    @FindBy (xpath = "//a[@class= 'dropdown-item']")
    List<WebElement>profileDropdownItems;

    public void clickLogin() {
        login_button.click();
    }

    public void sendEmail(String email) {
        email_input.sendKeys(email);

    }

    public void sendPassword(String password) {
        password_input.sendKeys(password);
    }

    public void clickSignIn() {
        submit_button.click();
    }

    public void signInLogin(){

        login_button.click();
        email_input.sendKeys(ConfigReader.getProperty("email"));
        password_input.sendKeys(ConfigReader.getProperty("password"));
        submit_button.click();


    }

    public void signInToAccountManagement(){

        login_button.click();
        email_input.sendKeys(ConfigReader.getProperty("email"));
        password_input.sendKeys(ConfigReader.getProperty("password"));
        submit_button.click();
       profileDropdown.click();
       accountManagement_button.click();

    }

    public void logOut(){

       profileDropdown.click();
       logout_button.click();
    }




    public void clickProfileDropdown() {
        ResuableMethods.waitForVisibility(profileDropdown, 3);
        profileDropdown.click();
    }

    public void clickAccountManagement() {
        accountManagement_button.click();
    }

    public void clickLogout() {
        logout_button.click();
    }

    public void loginEmailIsDisplayed() {
        loginemailTxt.isDisplayed();
    }

    public String getNotAuthorizedText() {
        System.out.println("mesaj: " + notAuthorizedText.getText());
        return notAuthorizedText.getText();
    }

    public void allProductPageIsDisplayed() {
        allProductTxt.isDisplayed();
    }

    public void loginButtonIsDisplayed() {
        login_button.isDisplayed();
    }

    public void clickLogo() {

        logo.click();
    }


    public void clickGoToMarketPlaceButton() {
        goToMarketPlaceButton.click();
    }


    public void sidebarIsDisplayed() {
        sidebar.isDisplayed();
    }

    public void clickSideBarItem5() {
        sidebarItemWish.click();
    }

    public void clickSideBarItem7() {
        sidebarItemPurchasing.click();
    }


    public boolean verifyUsername() {

        return usernameText.isDisplayed();
    }

    public boolean verifyRole() {


        return  RoleText.isDisplayed();
    }

    public int profileDropdownItemsSize(){
        return profileDropdownItems.size();
    }

    public void verifyProfileDropdownItems(){
        Assert.assertEquals(profileDropdownItems.get(0).getText(), "Profile");
        System.out.println(profileDropdownItems.get(0).getText());

    }

    public void clickProfileItem(){
        ResuableMethods.waitFor(2);
        ResuableMethods.jsClick(profileDropdownItems.get(0));
        ResuableMethods.waitFor(2);

    }

    public void clickAccountManagementItem(){
        ResuableMethods.waitFor(2);
        ResuableMethods.jsClick(profileDropdownItems.get(4));
        ResuableMethods.waitFor(2);

    }


}


