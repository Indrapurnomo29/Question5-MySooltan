package Runner_OctoClick;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/octoclick", glue = "OctoClick")
public class RunnerOctoClick {
}
