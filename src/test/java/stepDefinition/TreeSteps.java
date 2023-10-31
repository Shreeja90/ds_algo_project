package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.TreePage;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TreeSteps {
	
	TestContext testContext;
	WebDriver driver;
	TreePage treePage;
	WebDriverWait wait;
	
	
	public TreeSteps(TestContext context) {
		testContext = context;
		treePage = testContext.getPageObjectManager().treePage();
	}
	
	@And("The user clicks the \"Getting Started\" button in Tree Pane")
	public void goingToTreePane() {
		treePage.clickTreeGetStartedButton();
	}
	
	  @And ("The user should be directed to \"Tree\" Page")
	  public void treePaneIsOpen() {
		  treePage.validateTreeTitle();
	  }
	 
	  @And("Navigate to Overview of Trees")
	  public void overviewOfTreeIsOpen() {
		  treePage.navigateToOverviewOfTrees();
	  }
	  
	  @And ("Click on the Tree links {string}")
	  public void clickonTreeLink(String testlink) {
		  treePage.goToTreeLink(testlink);
	  }
	  @And ("Validate the {string}")
	  public void validateTestLink(String testlink) {
		  treePage.validateTreeLink(testlink);
	  }
	  @And("The user clicks \"Try Here\" button")
	  public void clickingTryHereButton() {
		  treePage.goToTryHereButton();
	  }
	  
	  @And ("The user enters text print \"hello\" and clicks the run button")
	  public void checkTextBox() {
		  treePage.writeInTextBox();
		  
     }
	  @Then("hello should be printed")
	  public void validateRunButton() {
		  treePage.clickRunButton();
	  }
	  
	  
	  
}
