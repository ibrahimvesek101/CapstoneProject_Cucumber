package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/US11.feature"},
        glue = {"stepdefinitions","hooks"}
        /*,
        plugin = {
                "html: reports/htmlReport.html",
                "json: reports/jsonReport.json",
                "junit: reports/xmlReport.xml "}

         */
)
public class US11_Runner {

}
