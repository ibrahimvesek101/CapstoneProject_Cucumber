package pages;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ResuableMethods;

import java.util.List;


public class TeamsPage {



    LoginPage lp=new LoginPage();

    public TeamsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    static String newTeamName;


    @FindBy(xpath = "(//button[@id='loginButton'])[2]")
    public WebElement accountM;
    @FindBy(xpath = "(//a[@class='navbar-brand'])")
    public WebElement drugB;

    @FindBy(xpath = "//a[@href='#/department/386']")
    public WebElement teamThird;

    @FindBy(xpath = "//a[@href='#/department/711']")
    public WebElement newname9;

    @FindBy(xpath = "//b[text()='011silmeyin']")
    public  WebElement deleteChoisse;
    ////b[text()='newteam']

    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
    public WebElement addButon;

    @FindBy(xpath= "//input[@id='name']")
    WebElement nameInput;
    // css-13cymwt-control
    @FindBy(xpath= "//div[@class=' css-13cymwt-control']")
    WebElement depType;
    ////button[@class='btn btn-info text-white px-3']
    @FindBy(xpath= "//button[@class='btn btn-info text-white px-3']")
    WebElement saveButton;
    //btn btn-danger text-light fw-bold
    @FindBy(xpath= "//button[@class='btn btn-danger text-light fw-bold']")
    WebElement delButton;

    @FindBy(linkText = "Teams")
    WebElement teamsButton;
    @FindBy(xpath = "(//div[@class='row'])[5]")
    public List<WebElement> teamsList;
    @FindBy(xpath = "//li[@id='link6']//a") //nav-sub-icon     //li[@id='link6']
    public WebElement teamsB;
    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
    WebElement addNewAndEditTeamButton;
    @FindBy(xpath = "//label[@id='name']")
    WebElement newTeamDetay;
    @FindBy(xpath = "//input[@id='name']")
    WebElement inputTeam;
    @FindBy(xpath = "//button[@class='btn btn-danger text-light fw-bold']")
    WebElement deleteTeamButton;
    @FindBy(xpath = "(//div//span[@class='fw-bold'])[3]")
    WebElement saveBekleme;


    public void logInMethod2 () throws InterruptedException {

        lp.clickLogin();
        lp.sendEmail(ConfigReader.getProperty("email"));
        lp.sendPassword(ConfigReader.getProperty("password"));
        lp.clickSignIn();
        ResuableMethods.waitFor(5);
        lp.clickProfileDropdown();
        lp.clickAccountManagement();
    }


    public void showTeamList(){
        for (WebElement teamName : teamsList) {
            if (teamName.getText().length() > 0){
                System.out.println(teamName.getText());
            }
        }
    }
    public void listAssertion(){
        ResuableMethods.waitFor(3);
        teamsB.click();
        Assert.assertTrue(teamsList.size() > 0);
    }


    public void clickFirstTeam() {
        teamsB.click();
        ResuableMethods.waitFor(5);
        teamThird.click();
    }

    public void teamsPage() throws InterruptedException {

        logInMethod2();    }




    public void teamInfoAssertion() {
        ResuableMethods.waitFor(5);
        Assert.assertTrue(newname9.isDisplayed());
    }


    public void addNewAndEditTeam() {
        ResuableMethods.waitFor(3);
        teamsB.click();
        ResuableMethods.waitFor(3);
        addButon.click();
    }

    public void inputInfo() {

        ResuableMethods.waitFor(3);
        nameInput.sendKeys("newname");
        depType.click();

       Actions act = new Actions(Driver.getDriver());

        act.moveToElement(inputTeam).click().sendKeys(Keys.TAB).sendKeys("Team0006"+Keys.TAB)
                .sendKeys("Team"+Keys.ENTER+Keys.TAB).sendKeys("Team0006"+Keys.TAB)
                .sendKeys("Business"+Keys.ENTER+Keys.ESCAPE+Keys.TAB+Keys.ENTER).perform();

    }

    public void newTeamListAssertion() {
        System.out.println("Team Names= ");
        String teams = " ";
        for (WebElement teamName : teamsList) {
            if (teamName.getText().length() > 0){
                teams += teamName.getText();
            }
        }
        System.out.println(teams);
        Assert.assertTrue(teams.contains("newname"));
    }

    public void teamsclick() throws InterruptedException {
        ResuableMethods.waitFor(5);
        teamsB.click();
    }

    public void teamsBackPage() {
        teamsB.click();
    }

    public void updateTeam() {
        teamsB.click();
        ResuableMethods.waitFor(5);
        newname9.click();
        ResuableMethods.waitFor(3);
        addButon.click();
        ResuableMethods.waitFor(3);
        nameInput.clear();
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(inputTeam).click().sendKeys("edittedNewName"+Keys.TAB+Keys.TAB)
                .sendKeys("Team"+Keys.ENTER+Keys.TAB).sendKeys("Team0007"+Keys.TAB)
                .sendKeys("Business"+Keys.ENTER+Keys.ESCAPE+Keys.TAB+Keys.ENTER).perform();
        ResuableMethods.waitFor(3);
        //saveButton.click();

    }

    public void verifyTeam() {
        ResuableMethods.waitFor(3);
        teamsB.click();
        ResuableMethods.waitFor(3);
        System.out.println("Team Names= ");
        String teams = " ";
        for (WebElement teamName : teamsList) {
            if (teamName.getText().length() > 0){
                teams += teamName.getText();
            }
        }
        System.out.println(teams);
        Assert.assertTrue(teams.contains("edittedNewName"));
    }

    public void deleteTeam() {
        teamsB.click();
        ResuableMethods.waitFor(7);
        deleteChoisse.click();
        ResuableMethods.waitFor(3);
        addButon.click();
        ResuableMethods.waitFor(3);
        delButton.click();
        ResuableMethods.waitFor(3);

    }

    public void alertMessage() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    public void assertVerified() {


        ResuableMethods.waitFor(3);
        teamsB.click();
        ResuableMethods.waitFor(3);
        System.out.println("Team Names= ");
        String teams = " ";
        for (WebElement teamName : teamsList) {
            if (teamName.getText().length() > 0){
                teams += teamName.getText();
            }
        }
        System.out.println(teams);
        Assert.assertFalse(teams.contains("011silmeyin"));
    }
}
