package stepDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Pages.DatastructuresPage;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class DatastructurePageSteps {

		TestContext testContext;
		WebDriver driver;
		DatastructuresPage datastructure;
				
		WebDriverManager webDriverManager;
		//PageObjectManager pageObjectManager;
		
		private static final Logger logger = LogManager.getLogger(DatastructurePageSteps.class.getName());
		
		public DatastructurePageSteps(TestContext context) {
			testContext = context;
			//signinPage = testContext.getPageObjectManager().getSigninPage();
			datastructure = testContext.getPageObjectManager().getdatastructurespage();
			logger.info("User is navigated to the home page");
		}
		
		
		
	@Then("user is redirected to inside account page")
	public void user_is_redirected_to_inside_account_page() {
	    datastructure.validatelogin();
	    logger.info("User successfully logged into the home page");
	}

	

	@When("user clicks \"Get Started\" button under data structures tab")
	public void user_clicks_button_under_data_structures_tab() {
	    datastructure.clickgetstartedbutton();
	    logger.info("User successfully clicked get started button");
	}

	@And("user scrolls down the page")
	public void user_scrolls_down_the_page() {
		datastructure.scrolltotimecomplexitylink();
		logger.info("User successfully scrolls down to view time complexity link");
	}
  
	@And("user clicks the \"Time complexity\" link")
	public void user_clicks_the_time_complexity_link() {
		datastructure.clicktimecomplexitylink();
		logger.info("User successfully clicked time complexity link");
	}

	@Then("user is redirected to the practice questions page")
	public void user_is_redirected_to_the_practice_questions_page() {
	    datastructure.validateredirection();
	    logger.info("User successfully redirected to practice questions page");
	}
	
	@And ("user clicks the \"Practice Questions\" link")
	public void user_clicks_the_practice_questions_button() throws InterruptedException {
		
		datastructure.practicequestionpage();
		logger.info("User successfully clicked practice questions link");
	}
	
	@Then ("user navigates back to the time complexity page")
	public void user_navigates_back_to_the_time_complexity_page() throws InterruptedException {
		datastructure.navigateback();
		logger.info("User successfully navigates back to time complexity link");
	}
	
	
	
	@Then("user scrolls down and clicks \"Try Here\" button and enters \"Hello World\" and click \"Run\" button and user input is displayed in the console")
	public void user_scrolls_down_and_clicks_button_and_enters_and_click_button_and_user_input_is_displayed_in_the_console() throws InterruptedException {
		 datastructure.dovalidations();
		 logger.info("User successfully validated try here button");
		 
	}

	 
		

}
