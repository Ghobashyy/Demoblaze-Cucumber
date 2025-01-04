package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/Purchase.feature", glue = "stepsdef", tags = "@Positive" , plugin = {"pretty" , "html:target/reports/report.html"})
public class TestRunners {
}