package Runner_BCAKlik;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/bcaklik", glue = "BCAKlik")
public class RunnerBCAKlik {
}
