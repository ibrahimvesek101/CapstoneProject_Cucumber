package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SubscriptionPage {

    public SubscriptionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#/subscriptions']")
    private WebElement subscriptionButton;

    @FindBy(className = "mainHeader")
    private WebElement subscriptionHeader;

    @FindBy(xpath = "//h5[@class='mb-0']")
    private WebElement GM3Dev;

    @FindBy(xpath = "//h5[@class='card-title']")
    private WebElement subsInfoHeader;

    @FindBy(xpath = "//*[.='Subscription ID']")
    private WebElement subsID;

    @FindBy(xpath = "//*[text()='Ali']")
    private WebElement subsTypeAli;

    public WebElement getSubscriptionButton() {
        return subscriptionButton;
    }

    public WebElement getSubscriptionHeader() {
        return subscriptionHeader;
    }

    public WebElement getGM3Dev() {
        return GM3Dev;
    }

    public WebElement getSubsInfoHeader() {
        return subsInfoHeader;
    }

    public WebElement getSubsID() {
        return subsID;
    }

    public WebElement getSubsTypeAli() {
        return subsTypeAli;
    }

    public void subsInfoHeader(){
        subsInfoHeader.isDisplayed();
    }


    public void subsID(){
        subsID.isDisplayed();
    }

    public void subsType(){
        subsTypeAli.isDisplayed();
    }


}
