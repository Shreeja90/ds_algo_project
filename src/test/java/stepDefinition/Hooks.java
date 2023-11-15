package stepDefinition;

import java.io.ByteArrayInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;


public class Hooks {
	
	Logger logger = LogManager.getLogger(Hooks.class);

	TestContext testContext;
	//Homepage homePage;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void BeforeSteps() {
		//homePage.navigateTo_HomePage();
		//homePage.clickGetStarted();
		logger.info("Started TEST Execution");
		
	}

	@After
	public void AfterSteps(Scenario scenario) {
		
		try {
		if(scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
			testContext.getWebDriverManager().closeDriver();
            //byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            //scenario.attach(screenshot, "image/png", "Screenshot");
			
		}
		else {
			
			testContext.getWebDriverManager().closeDriver();
		}
		}
		catch (Exception e)
		{		
			e.printStackTrace();
			testContext.getWebDriverManager().closeDriver();
		
		}
		
	}
}