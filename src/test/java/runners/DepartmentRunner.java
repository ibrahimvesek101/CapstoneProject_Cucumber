package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features/US07.feature",
                "src/test/resources/features/US08.feature",
                "src/test/resources/features/US09.feature",
        },
        glue = {"stepdefinitions", "hooks"},

        plugin = {
                "html: reports/htmlReport.html",
                "json: reports/jsonReport.json",
                "junit: reports/xmlReport.xml "}



)
public class DepartmentRunner {

}
