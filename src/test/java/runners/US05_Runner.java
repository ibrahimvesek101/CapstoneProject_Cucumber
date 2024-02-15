package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {
                "html:reports/html-reports/cucumber.html", //html formatinda rapor almak icin kullanilan plugin
                "json:reports/json-reports/cucumber.json", //json formatinda rapor almak icin kullanilan plugin
                "junit:reports/xml-reports/cucumber.xml",  //xml formatinda rapor almak icin kullanilan plugin
                "pretty"  },                           //konsol ciktilarinin daha okunakli olmasi icin plugin
        features = {"src/test/resources/features/US05.feature"},
        glue = {"stepdefinitions","hooks"},
        dryRun = false



)

public class US05_Runner {
}
