package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CompanyPage {

    public CompanyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#/company/12']")
    private WebElement companyButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-dark']")
    private WebElement editButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@class='btn btn-info text-white px-3']")
    private WebElement saveButton;


    @FindBy(xpath = "//label[@placeholder='Company Name']")
    private WebElement verifyName;

    @FindBy(xpath = "//button[@class='btn btn-dark']")
    private WebElement cancelButton;

    @FindBy(xpath = "//*[.='Please enter a name for company']")
    private WebElement enterNameTxt;

    @FindBy(xpath = "//label[@placeholder='Company Email']")
    private WebElement emailTxt;

    @FindBy(xpath = "(//span[text()='Queen Company'])[1]")
    private WebElement companyNameOnDropdown;

    public WebElement getCompanyNameOnDropdown() {
        return companyNameOnDropdown;
    }

    public WebElement getEmailTxt() {
        return emailTxt;
    }

    public WebElement getCompanyButton() {
        return companyButton;
    }

    public WebElement getVerifyName() {
        return verifyName;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getEnterNameTxt() {
        return enterNameTxt;
    }

    @Override
    public String toString() {
        return "CompanyPage{" +
                "verifyName=" + verifyName +
                '}';
    }


}
