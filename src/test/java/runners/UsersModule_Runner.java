package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features/US15.feature",
                "src/test/resources/features/US16.feature" },

        glue = {"stepdefinitions", "Hooks"},

        plugin = {
               "html: reports/htmlReport.html",
               "json: reports/jsonReport.json",
               "junit: reports/xmlReport.xml "}
        )


public class UsersModule_Runner {
}
