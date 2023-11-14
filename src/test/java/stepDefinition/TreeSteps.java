package stepDefinition;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.TreePage;
import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {
	
	TestContext testContext;
	WebDriver driver;
	TreePage treePage;
	WebDriverWait wait;
	Logger logger = LogManager.getLogger(TreeSteps.class);
	
	
	public TreeSteps(TestContext context) {
		testContext = context;
		treePage = testContext.getPageObjectManager().treePage();
	}
	
	
	@Given("The user clicks the \"Getting Started\" button in Tree Pane")
	public void goingToTreePane() {
		treePage.clickTreeGetStartedButton();
		logger.info("Button Clicked");
	}
	
	  @When ("The user should be directed to \"Tree\" Page")
	  public void treePaneIsOpen() {
		  treePage.validateTreeTitle();
	  }
	 
	  @When ("Navigate to Overview of Trees")
	  public void overviewOfTreeIsOpen() {
		  treePage.navigateToOverviewOfTrees();
	  }
	  
	  @When ("Click on the Tree links {string}")
	  public void clickonTreeLink(String testlink) {
		  treePage.goToTreeLink(testlink);
	  }
	  // using method overloading concept from java that is writing same method multiple times using different parameters
	  
	  @When ("Click on the links and Validate the links")
	  public void clickonTreeLink(DataTable table) {
		  logger.info("Click on the links and Validate the links");
		    List<Map<String, String>> rows = table.asMaps(String.class, String.class);  
		    //List<Map<String, String>> rows: This line declares a List of Map objects
		   // Each element in the list is a map where the keys and values are both of type String
		    //table.asMaps(String.class, String.class): This is a Cucumber method call on a DataTable object named table. 
		    //The asMaps method is used to convert the tabular data in the DataTable into a list of maps.
		    //The first argument, String.class, specifies the type of keys in the map, which is String in this case.
		    //The second argument, String.class, specifies the type of values in the map, which is also String.
		    for (Map<String, String> columns : rows) {
		    	treePage.navigateToOverviewOfTrees();
		    	treePage.goToTreeLink(columns.get("testlink"));
		    	treePage.validateTreeLink(columns.get("testlink"));
		    	treePage.goToTryHereButton();
		    	treePage.writeInTextBox();
		    	treePage.clickRunButton();
		    }

	  }
	  
	  @When ("Validate the {string}")
	  public void validateTestLink(String testlink) {
		  treePage.validateTreeLink(testlink);
	  }
	  @When ("The user clicks \"Try Here\" button")
	  public void clickingTryHereButton() {
		  treePage.goToTryHereButton();
	  }
	  
	  @When ("The user enters text print \"hello\" and clicks the run button")
	  public void checkTextBox() {
		  treePage.writeInTextBox();
		  
     }
	  @Then("hello should be printed")
	  public void validateRunButton() {
		  treePage.clickRunButton();
	  }
	  @When("When User Clicks on Practice Questions")
	  public void checkPracticeQuestions() {
		  treePage.clickPracticeQuestionsButton();
	  }
	  @Then("Then User is navigated to Practice Questions Page")
	  public void validatePracticeQuestionsPage() {
		  System.out.println("Im in Practice Questions Page");
	  }
	  
	  
}
