package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/US03.feature"},
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty",
                "html: reports/htmlReport.html",
                "json: reports/jsonReport.json",
                "junit: reports/xmlReport.xml "},
        tags = "@Smoke"
)

public class US03_Runner {
}
