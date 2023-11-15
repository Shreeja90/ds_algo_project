package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.GraphPage;
import Pages.LinkedList;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GraphSteps {
	
	TestContext testContext;
	WebDriver driver;
	GraphPage graphPage;
	WebDriverWait wait;
	private static Logger logger = LogManager.getLogger(GraphSteps.class);
	
	
	
	
	public GraphSteps(TestContext context) {
		testContext = context;
		logger.info(" GraphSteps called ");
		graphPage = testContext.getPageObjectManager().getGraphPage();
		logger.info(" graphPage Object Created: " + graphPage);
	}
	
	@And("The user clicks the \"Getting Started\" button in Graph pane")
	public void goingToGraphPane() {
		logger.info(" goingToGraphPane called ");
		graphPage.clickGraphGetStartedButton();
		logger.info(" exist from clickGraphGetStartedButton ");
		
	}
	
	  @And ("The user should be directed to \"Graph\" Page")
	  public void GraphPaneIsOpen() {
		  logger.info(" GraphPaneIsOpen called ");
		  graphPage.validateGraphTitle();
	  }
	 
		
		/*
		 * @And("Navigate to Introduction of Linked List") public void
		 * introductionIsOpen() { linkedList.navigateToIntroduction(); }
		 */
		 
	  
	  @And ("Click on the Graph links {string}")
	  public void clickonGraphLink(String testlink) {
		  logger.info(" clickonGraphLink called ");
		  graphPage.goToGraphLink(testlink);
	  }

		/* This is duplicate with linkedList
		 * @And ("Validate the {string}") public void validateTestLink(String testlink)
		 * { graphPage.validateGraphLink(testlink); }
		 */
		/* This is duplicate with linkedList
		 * @And("The user clicks \"Try Here\" button") public void
		 * clickingTryHereButton() { graphPage.goToTryHereButton(); }
		 */
	  
		/* This is duplicate with linkedList
		 * @And ("The user enters text print \"hello\" and clicks the run button")
		 * public void checkTextBox() { graphPage.writeInTextBox();
		 * 
		 * }
		 */
		/* This is duplicate with linkedList
		 * @Then("hello should be printed") public void validateRunButton() {
		 * graphPage.clickRunButton(); }
		 */
	  
	  

	
}
