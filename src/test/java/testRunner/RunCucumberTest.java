package testRunner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import managers.FileReaderManager;


//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("Ds_algo")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/featureFiles", tags = "@TreePage",
				glue= {"stepDefinition"},
				dryRun = false,
				monochrome = true, 
				plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class RunCucumberTest {


}
	


