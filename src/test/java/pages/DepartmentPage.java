package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;
import utils.ResuableMethods;
import java.util.Iterator;
import java.util.List;

import static utils.ResuableMethods.wait;


public class DepartmentPage {
    WebDriver driver;

    public DepartmentPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='text-start text-nowrap d-none d-md-block ps-2']")
    WebElement dropdownButton;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    WebElement accountManagementButton;
    @FindBy(xpath = "//li[@id='link4']")
    WebElement departmentsButton;
    @FindBy(xpath = "//*[@class='row mb-3']")
    WebElement numberOfDepartmens;

    @FindBy(xpath = "//*[text()='selam10']")
    WebElement selam10Departmens;
    @FindBy(xpath = "//*[@class='roles-box p-2 me-2']")
    WebElement departmensRole;
    @FindBy(xpath = "//*[@class='btn btn-info float-end text-white']")
    WebElement addNewDepartmensButton;
    @FindBy(xpath = "//*[@id='name']")
    WebElement departmensNameInput;
    @FindBy(xpath = "//*[@class=' css-1xc3v61-indicatorContainer']")
    WebElement departmensTypeButton;
    @FindBy(xpath = "//*[@id='react-select-2-option-0']")
    WebElement departmensSelect;
    @FindBy(xpath = "//*[@class='btn btn-info text-white px-3']")
    WebElement saveButton;
    @FindBy(xpath = "//b[text()='tester10']")
    WebElement tester10Department;
    @FindBy(xpath = "//*[@class='fw-bold fs-4']")
    WebElement testerDepartmentName;
    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
    WebElement editDepartmentButton;
    @FindBy(xpath = "//button[@class='btn btn-danger text-light fw-bold']")
    WebElement deleteDepartmentButton;
    @FindBy(xpath = "//*[@class='text-danger']")
    WebElement pleaseEnterANameForDepartmentText;
    @FindBy(xpath = "//*[@class='text-danger']")
    WebElement pleaseSelectATypeForDepartmentText;
    @FindBy(xpath = "//b[text()='selamEdit']")
    WebElement selamEditDepartment;
    @FindBy(xpath = "//b[text()='selamEditNew']")
    WebElement selamEditNewDepartment;
    @FindBy(xpath = "(//*[@class='css-8mmkcg'])[1]")
    WebElement deleteDepartmentTypeButton;
    @FindBy(xpath = "//*[@id='react-select-4-option-1']")
    WebElement remoteUnits;
    @FindBy(xpath = "//li[@id='link5']")
    WebElement remoteUnitsButton;
    @FindBy(xpath = "//*[@class='col-9']")
    List<WebElement> elementList;
    @FindBy(xpath = "//*[@id='react-select-2-option-3']")
    WebElement tazeSimitUnit;
    @FindBy(xpath = "non-existent button :)")
    WebElement tazeSimitUnitDepartmentButton;
    @FindBy(xpath = "//b[text()=' ']")
    WebElement spaceDepartment;


    //***************************** METHOD LAR ***********************************//
    public void dropdownButtonClick() {
        dropdownButton.click();
    }

    public void accountManagementButtonClick() {
        accountManagementButton.click();
    }

    public void departmentsButtonClick() {
        departmentsButton.click();
    }

    public void departmentCountVerification() {

        String numberOfDepartmensText = numberOfDepartmens.getText();
        String numberOfDepartmensStr = "";

        for (int i = 0; i < numberOfDepartmensText.length() - 1; i++) {
            if (Character.isDigit(numberOfDepartmensText.charAt(i))) {
                numberOfDepartmensStr += numberOfDepartmensText.charAt(i);
            }
        }

        int departmentNumberInt = Integer.parseInt(numberOfDepartmensStr);
        System.out.println("NumberOfDepartments= " + departmentNumberInt);


        List<WebElement> elements = elementList;

        Iterator<WebElement> iterator = elements.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            WebElement element = iterator.next();
            if (element.isDisplayed()) {
                count++;
            }
        }
        int departmentsCount = count;
        System.out.println("departmentsCount = " + departmentsCount);
        Assert.assertEquals(departmentsCount, departmentNumberInt);
    }

    public void selam10DepartmensClick() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", selam10Departmens);
    }

    public void departmensRoleVerification() {
        System.out.println("departmensRole.getText() = " + departmensRole.getText());
        Assert.assertTrue(departmensRole.getText().contains(" Business Owner"));
    }

    public void addNewDepartmensButtonClick() {
        addNewDepartmensButton.click();
    }

    public void enterDepartmentName() {
        String departmentName = "tester10";
        departmensNameInput.sendKeys(departmentName);
    }

    public void enterDepartmentType() {
        departmensTypeButton.click();
        ResuableMethods.waitFor(1);
        departmensSelect.click();
    }

    public void saveButtonClick() {
        saveButton.click();
    }

    public void tester10DepartmentClick() {
        ResuableMethods.jsClick(tester10Department);
    }

    public void testerDepartmentNameVerification() {

        String testerDepartmentNameText = testerDepartmentName.getText();
        System.out.println("testerDepartmentNameText = " + testerDepartmentNameText);
        Assert.assertEquals(testerDepartmentNameText, "tester10");

        // kaydedilen departmanı siliyoruz...
        editDepartmentButton.click();
        ResuableMethods.waitFor(8);
        deleteDepartmentButton.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println("Alert Metni: " + alertText);
        alert.accept();
    }

    public void pleaseEnterANameForDepartmentTextVerification() {
        Assert.assertTrue(pleaseEnterANameForDepartmentText.isDisplayed());
    }

    public void enterDepartmentNameForType() {
        String departmantName = "tester101";
        departmensNameInput.sendKeys(departmantName);
    }

    public void pleaseSelectATypeForDepartmentTextVerification() {
        Assert.assertTrue(pleaseSelectATypeForDepartmentText.isDisplayed());
    }

    public void selamEditDepartmentCreateForEdit() {
        addNewDepartmensButton.click();
        departmensNameInput.sendKeys("selamEdit");
        departmensTypeButton.click();
        departmensSelect.click();
        saveButton.click();
        ResuableMethods.waitFor(3);
        departmentsButton.click();
        ResuableMethods.waitFor(3);
        ResuableMethods.jsClick(selamEditDepartment);
        ResuableMethods.waitFor(4);
    }

    public void editDepartmentButtonClick() {
        editDepartmentButton.click();
    }

    public void deleteDepartmentName() {
        for (int i = 1; i <= 9; i++) {
            departmensNameInput.sendKeys(Keys.BACK_SPACE);
        }
    }

    public void enterNewNameForSelamEdit() {
        departmensNameInput.sendKeys("selamEditNew");

    }

    public void verifyingTheChangingDepartmentName() {
        Assert.assertTrue(selamEditNewDepartment.isDisplayed());
    }

    public void deleteDepartmentsForEdit() {
        ResuableMethods.jsClick(selamEditNewDepartment);
        ResuableMethods.waitFor(3);
        editDepartmentButton.click();
        ResuableMethods.waitFor(8);
        deleteDepartmentButton.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println("Alert Metni: " + alertText);
        alert.accept();
        ResuableMethods.waitFor(5);
    }

    public void deleteDepartmentType() {
        deleteDepartmentTypeButton.click();
    }

    public void selectRemoteUnits() {
        departmensTypeButton.click();
        remoteUnits.click();
    }

    public void remoteUnitsButtonClick() {
        remoteUnitsButton.click();

    }

    public void remoteUnitsSelamEditVerification() {
        Assert.assertTrue(selamEditDepartment.isDisplayed());
        ResuableMethods.jsClick(selamEditDepartment);
        ResuableMethods.waitFor(3);
        editDepartmentButton.click();
        ResuableMethods.waitFor(5);
        deleteDepartmentButton.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println("Alert Metni: " + alertText);
        alert.accept();
        ResuableMethods.waitFor(5);
    }

    public void deleteDepartmentButtonClick() {
        deleteDepartmentButton.click();
    }

    public void deleteDepartmentOkButtonClick() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println("Alert Metni: " + alertText);
        alert.accept();
        ResuableMethods.waitFor(5);
    }

    public void verificationOfDeletedDepartment() {

        try {
            selamEditDepartment.isDisplayed();
            System.out.println("selamEdit adındaki departman SİLİNEMEDİ...");

        } catch (Exception e) {

            System.out.println("Create edilen selamEdit adındaki departman başarıyla SİLİNDİ...");
        }
    }

    public void departmentNameForTazeSimit() {
        departmensNameInput.sendKeys("simitçi");
    }

    public void tazeSimitDepartmentClick() {
        departmensTypeButton.click();
        tazeSimitUnit.click();
    }

    public void tazeSimitUnitDepartmentButtonClick() {
        tazeSimitUnitDepartmentButton.click();
    }

    public void nameForSpaceDepartment() {
        departmensNameInput.sendKeys(" ");
    }

    public void spaceDepartmentClick() {
        spaceDepartment.click();
    }


}
