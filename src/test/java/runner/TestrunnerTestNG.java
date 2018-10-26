package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
features = "src/test/java/features",
glue= {"seleniumgluecodeKennisavond"},
plugin = { "pretty", "html:target/htmlreports" }
//tags = {"@Regressie"}
)

public class TestrunnerTestNG extends AbstractTestNGCucumberTests{

	
}
