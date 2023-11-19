package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("Ds_algo")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

@RunWith(Cucumber.class)
@CucumberOptions(

  features = "src/main/resources/featureFiles" , tags = "not @Register",
				glue= {"stepDefinition"},
				dryRun = false,
				monochrome = true, 
				plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/cucumber-reports/Cucumber.json" })


public class RunCucumberTest {
	
}
	


