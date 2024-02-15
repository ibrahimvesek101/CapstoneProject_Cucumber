package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.ConfigReader;
import utils.Driver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Hooks {

    @Before()
    public void beforeSteps(){

       Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


    @After()
    public void close(){

        Driver.closeDriver();
    }



    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            captureAndSaveScreenshot(scenario.getName());
        }

        Driver.closeDriver();
    }




    private void captureAndSaveScreenshot(String screenshotName) {
        try {
            File screenshotFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

            String destinationPath = "screenshots/" + screenshotName + ".png";
            Files.createDirectories(Paths.get("screenshots"));
            Files.copy(screenshotFile.toPath(), Paths.get(destinationPath));
            System.out.println("Screenshot saved: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }


}
