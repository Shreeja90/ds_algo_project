package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.StackPage;
import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackPageSteps {
	
	TestContext testContext;
	WebDriver driver;
	StackPage stackPage;
	WebDriverWait wait;
	
	private static final Logger logger = LogManager.getLogger(StackPageSteps.class.getName());
	
	public StackPageSteps(TestContext context) {
		testContext = context;
		stackPage = testContext.getPageObjectManager().stackPage();
	}
		
	@When("The user clicks the Getting Started button in Stack Pane")
	public void the_user_clicks_the_getting_started_button_in_stack_pane() {
	  	stackPage.clickGetStartedBtnStack();
	  	logger.info("**** -- Get Started Button in Stack Pane is clicked -- ****");
	}

	@When("Clicks Operations in Stack")
	public void clicks_operations_in_stack() {
		stackPage.clickOperationsInStack();
		logger.info("User clicked the Operations in Stack link");
	}
	
	@When("The user clicks Try Here button and enters the python code")
	public void the_user_clicks_try_here_button_and_enters_the_python_code() {
		stackPage.clickTryHere();
		logger.info("Try here button is clicked");
		
		stackPage.editor();
		logger.info("Code is written inside editor");
	}
	
	@When("Clicks run button, code is printed and then returns to the previous page")
	public void clicks_run_button_code_is_printed_and_then_returns_to_the_previous_page() {
		stackPage.clickRunBtn();
		logger.info("Run button is clicked");
		
		stackPage.checkOutput();
		logger.info("Output has been printed on the screen");
		
		stackPage.returnToPrevURL();
		logger.info("User returns to the previous page url");
	}

	@When("Clicks Implemention link")
	public void clicks_implemention_link() {
		stackPage.clickImplementationLink();
		logger.info("User clicked the Implementation link");
    }

	@When("Clicks Application link")
	public void clicks_application_link() {
		stackPage.clickApplicationsLink();
		logger.info("User clicked the Application link");
	}
	
	@Then("Clicks Practice Questions Link")
	public void clicks_practice_questions_link() {
		stackPage.clickPractQstnsLink();
		logger.info("User clicked Practice Questions Link");
	}

}
