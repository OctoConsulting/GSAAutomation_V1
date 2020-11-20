package Runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = { "pretty" }, 
		features = "src\\test\\resources\\features\\FH2",
		glue = {"stepdefinitions"},
		//tags =  {"@FH"},
		monochrome = true,
        dryRun = false)

public class CucumberTestSuite {

}

