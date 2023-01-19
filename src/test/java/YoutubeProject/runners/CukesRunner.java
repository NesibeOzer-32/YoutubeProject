package YoutubeProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.text",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
        },
        features = "src/test/resources/features",
        glue = "YoutubeProject/stepDefinitions",
        dryRun =false,
        tags = "@nesibe",
        publish = false

)

public class CukesRunner {
}
