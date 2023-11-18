package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.QueuePage;
import cucumber.TestContext;
import io.cucumber.java.en.When;

public class QueuePageSteps {
	
	TestContext testContext;
	WebDriver driver;
	QueuePage queuePage;
	WebDriverWait wait;
	
	private static final Logger logger = LogManager.getLogger(QueuePageSteps.class.getName());
	
	public QueuePageSteps(TestContext context) {
		testContext = context;
		queuePage = testContext.getPageObjectManager().queuePage();
	}

	@When("The user clicks the Getting Started button of Queue module")
	public void the_user_clicks_the_getting_started_button_of_queue_module() {
		queuePage.clickGetStartedQueue();
		logger.info("**** -- Get Started Button in Queue Pane is clicked -- ****");
	}

	@When("Clicks Implementation of Queue in Python")
	public void clicks_implementation_of_queue_in_python() {
		queuePage.clickImpleListsLink();
		logger.info("User clicked the Implementation Lists link");
	}

	@When("Clicks Implemention using collections.dequeue link")
	public void clicks_implemention_using_collections_dequeue_link() {
		queuePage.clickImpleCollectionsLink();
		logger.info("User clicked the Implementation using Collections DeQueue link");
	}

	@When("Clicks Implementation using array link")
	public void clicks_implementation_using_array_link() {
		queuePage.clickImpleArrayLink();
		logger.info("User clicked the Implementation Using Array link");
	
	}

	@When("Clicks Queue Operations")
	public void clicks_queue_operations() {
		queuePage.clickQueueOpLinkLink();
		logger.info("User clicked the Queue Operations link");
	}	
	
}