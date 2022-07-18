package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "step_definitions",
        tags = "@e2e",
        dryRun = false
        //dryRun, plugin, tags...
)

public class CukesRunner {

}
