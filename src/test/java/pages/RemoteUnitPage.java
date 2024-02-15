package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ResuableMethods;
import java.util.List;

public class RemoteUnitPage {

    WebDriver driver;
    public RemoteUnitPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//tbody)[1]")
    WebElement dropdownMenu;

    @FindBy(xpath = "//ul//li//a[text()='Account Management']")
    WebElement accountManagement;

    @FindBy(xpath = "//a[text()='Remote Units']")
    WebElement remoteUnitsTab;

    @FindBy(xpath = "//div[@class='col-4']")
    List<WebElement> remoteUnitsList;

    @FindBy(xpath = "//button[@type='button'][text()=' Add New ']")
    WebElement addNewRemoteUnitButton;

    @FindBy(xpath = "//input[@placeholder='Department Name']")
    public WebElement departmentName;

    @FindBy(xpath = "(//div[@class=' css-1wy0on6'])[1]")
    WebElement departmentType;

    @FindBy(xpath = "//div[@id='react-select-2-option-1']")
    WebElement departmentTypeRemoteUnit;

    @FindBy(xpath = "(//div[@class=' css-1wy0on6'])[2]")
    WebElement departmentRoles;

    @FindBy(xpath = "//div[@id='react-select-3-option-0']")
    WebElement businessOwner;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveButton;

    @FindBy(linkText = "Hello world")
    public WebElement helloWorldRemoteUnit;

    @FindBy(xpath = "//span[text()='Please enter a name for department']") // isim eksikse uyarı yazısı
    WebElement pleaseEnterName;

    @FindBy(xpath = "//span[text()='Please select a type for department']") // type seçilmediyse uyarı yazısı
    WebElement pleaseEnterType;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    WebElement editRemoteUnitButton;

    @FindBy(xpath = "//button[text()='Delete Department']")
    WebElement deleteDepartmentButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-dark']") //(add new remote unit içinde)
    WebElement editButton;


    public void clickDropdownMenu(){
        ResuableMethods.jsClick(dropdownMenu);
       // ResuableMethods.waitFor(4);
       // dropdownMenu.click();
    }

    public void clickAccountManagement(){
        accountManagement.click();
    }
    public void clickRemoteUnitsTab(){
        remoteUnitsTab.click();
    }

    public void clickAddNewRemoteUnitButton(){
        addNewRemoteUnitButton.click();
    }

    public void sendKeysDepartmentName(String name){
        departmentName.sendKeys(name);
    }

    public void selectDepartmentTypeRemoteUnit(){
        departmentType.click();
       departmentTypeRemoteUnit.click();
    }

    public void clickDepartmentRoles(){
        departmentRoles.click();
    }

    public void selectBusinessOwner(){
        businessOwner.click();
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void pleaseEnterName(){
       Assert.assertTrue(pleaseEnterName.isDisplayed());
        System.out.println(pleaseEnterName.getText());
    }

    public void pleaseEnterType(){
        Assert.assertTrue(pleaseEnterType.isDisplayed());
        System.out.println(pleaseEnterType.getText());
    }

    public void clickEditRemoteUnitButton(){
        editRemoteUnitButton.click();
    }

    public void clickDeleteDepartmentButton(){
        ResuableMethods.waitFor(2);
        deleteDepartmentButton.click();
    }

    public void verifyFromRemoteUnitsList(String name){
        for (WebElement element : remoteUnitsList) {
            if(element.getText().contains(name)) {
                Assert.assertTrue(element.isDisplayed());
            }
        }
    }

    public void verifyRemoteUnitsList(){
        for (WebElement element : remoteUnitsList) {
           Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());
        }
    }

    public void clickDepartmentName(){
        departmentName.click();
    }

    public void verifyDeletedFromRemoteUnitsList(String name){
        for (WebElement element : remoteUnitsList) {
            Assert.assertFalse(element.getText().contains(name));
        }
    }

    public void clickEditButton(){
        editButton.click();
    }

    public void verifyRemoteUnitDoesNotExist(){
        for (WebElement element : remoteUnitsList) {
            Assert.assertFalse(element.getText().contains("lşx"));
        }
    }


    public void verifyChangedName(){
        String firstName= "Hello ";
        String actualName= helloWorldRemoteUnit.getAccessibleName();
        System.out.println(actualName);
        Assert.assertNotEquals(firstName,actualName);
    }


}
