package stepDefinition;


import io.cucumber.java.en.And;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.LinkedList;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LinkedListSteps {
	
	TestContext testContext;
	WebDriver driver;
	LinkedList linkedList;
	WebDriverWait wait;
	private static Logger logger = LogManager.getLogger(LinkedListSteps.class);
	
	
	public LinkedListSteps(TestContext context) {
		testContext = context;
		linkedList = testContext.getPageObjectManager().getLinkedlist();
	}
	
	@And("The user clicks the \"Getting Started\" button in Linked List pane")
	public void goingToLinkedListPane() {
		logger.info(" goingToLinkedListPane called ");
		linkedList.clickLinkedListGetStartedButton();
	}
	
	  @And ("The user should be directed to \"Linked List\" Page")
	  public void LinkedListPaneIsOpen() {
		  logger.info(" LinkedListPaneIsOpen called ");
		  linkedList.validateLinkedListTitle();
	  }
	 
		
		/*
		 * @And("Navigate to Introduction of Linked List") public void
		 * introductionIsOpen() { linkedList.navigateToIntroduction(); }
		 */
		 
	  
	  @And ("Click on the Linked List links {string}")
	  public void clickonLinkedListLink(String testlink) {
		  logger.info(" clickonLinkedListLink called ");
		  linkedList.goToLinkedListLink(testlink);
	  }
	  @And ("Validate the {string}")
	  public void validateTestLink(String testlink) {
		  logger.info(" validateTestLink called ");
		  linkedList.validateLinkedListLink(testlink);
	  }
	  @And("The user clicks \"Try Here\" button")
	  public void clickingTryHereButton() {
		  logger.info(" clickingTryHereButton called ");
		  linkedList.goToTryHereButton();
	  }
	  
	  @And ("The user enters text print \"hello\" and clicks the run button")
	  public void checkTextBox() {
		  logger.info(" checkTextBox called ");
		  linkedList.writeInTextBox();
		  
     }
	  @Then("hello should be printed")
	  public void validateRunButton() {
		  logger.info(" validateRunButton called ");
		  linkedList.clickRunButton();
	  }
	  
	  
	  
}


