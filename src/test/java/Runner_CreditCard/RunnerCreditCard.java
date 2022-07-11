package Runner_CreditCard;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/creditcard", glue = "CreditCard")
public class RunnerCreditCard {
}