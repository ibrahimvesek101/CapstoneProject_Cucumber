package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class UserProfilePage {

    WebDriver driver;
    public UserProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='changePasswordButton']")
    private WebElement changePasswordButton;

    @FindBy (xpath ="//input[@id='newPassword']")
    WebElement newPassword;

    @FindBy (xpath ="//input[@id='newPassword2']")
    WebElement newPassword2;
    @FindBy (xpath="//button[@class='btn btn-dark text-white me-2']")
    WebElement  confirmButton;
    @FindBy (xpath="//*[text()='Change password successfully']")
    WebElement succesfullyYazisi;
    @FindBy (xpath="//div[@class='alert alert-danger alert-dismissible fade mt-1 show']")
    WebElement errorMasage;
    @FindBy (xpath="//div[@class='alert alert-danger alert-dismissible fade mt-1 show']")
    WebElement errorMassagekucukharf;
    ////div[@class='alert alert-danger alert-dismissible fade mt-1 show']
    @FindBy (xpath = "//div[@class='alert alert-danger alert-dismissible fade mt-1 show']")
    WebElement errorMessageDigit;
    //div[@class='alert alert-danger alert-dismissible fade mt-1 show']
    public void clickchangePasswordButton (){
        changePasswordButton.click();
    }
    public void clickNewPassword(){
        newPassword.click();
    }
    public void sendNewPassword(String password){
        newPassword.sendKeys(password);
    }
    public void clickNewPassword2(){
        newPassword2.click();
    }
    public void sendNewPassword2(String password){
        newPassword2.sendKeys(password);
    }
    public void clickConfirm(){
        confirmButton.click();
    }
    public void verifysuccesfullyText(){
        succesfullyYazisi.isDisplayed();
    }

    public void errorMassage(){
        errorMasage.isDisplayed();
    }
    public void kucukharfeksikHatası(){
        errorMassagekucukharf.isDisplayed();
    }
    public void rakamEksikHatasi(){
        errorMessageDigit.isDisplayed();
    }


    //======================İsmail============================


    @FindBy (xpath = "(//div[@class='alert alert-danger alert-dismissible fade mt-1 show'])")
    WebElement errormessage2;

    @FindBy (xpath = "(//div[@class='alert alert-danger alert-dismissible fade mt-1 show']")
    WebElement passwordMustContainAtLeastOneLowercase;

    @FindBy (xpath = "//div[@class='alert alert-danger alert-dismissible fade mt-1 show']")
    WebElement errorMessage3;


    public void setErrormessage2(){ errormessage2.isDisplayed();}
    public void passwordMustContainAtLeastOneLowercase(){passwordMustContainAtLeastOneLowercase.isDisplayed();}
    public void setErrorMessage3(){errorMessage3.isDisplayed();}


}


