package stepDefinition;

import Pages.ArrayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import cucumber.TestContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayPageSteps {
	
		TestContext testContext;
		//WebDriver driver;
		
		ArrayPage array1;
		private static final Logger logger = LogManager.getLogger(ArrayPageSteps.class.getName());
		
		//WebDriverManager webDriverManager;
		//PageObjectManager pageObjectManager;
		
		public ArrayPageSteps(TestContext context) {
			testContext = context;
			array1 = testContext.getPageObjectManager().getArrayPage();
			logger.info("user successfully navigated to Home Page");
		}
	


	@When("user clicks \"Get Started\" button under Array")
	public void user_clicks_get_started_button_under_array() {
	    array1.getStarted();
	    logger.info("user successfully clicked the get started button under Array Module");
	}

	@Then("user is redirected to the Array page")
	public void user_is_redirected_to_the_array_page() {
		array1.successfulRedirection();
		logger.info("user is redirected to the Array Page");
	}

	@When("user clicks the link \"Arrays in Python\"")
	public void user_clicks_the_link() {
		array1.naviagte_to_Arrays_in_Python();
		logger.info("user successfully clicked the Arrays in Python link");
			   
	}

	@Then("user is navigated to \"Arrays in Python\" page")
	public void user_is_navigated_to_page() {
	    array1.redirecttoArraysinPythonPage();
	    logger.info("user successfully redirected to the Arrays in Python page and successfully validated try here button");
	}
	
	
	
	@When("user navigates back and scrolls up the page and clicks \"Arrays Using List\" link")
	public void user_navigates_back_and_scrolls_up_the_page_and_clicks_link() throws InterruptedException {
		array1.navigatebacktoArraysusinglist();
		 logger.info("user successfully clicked back and scrolled up the page and clicked arrays using list link");
	}

	@Then("user will be redirected to \"Arrays Using List\" page")
	public void user_will_be_redirected_to_page() {
	    array1.redirecttoArraysusinglist();
	    logger.info("user successfully redirected to arrays using list page and successfully validated try here button");
	}

	
	@When("user navigates back and clicks \"Basic Operations in Lists\" link")
	public void user_navigates_back_and_clicks_page() throws InterruptedException {
	    array1.navigatebacktoBasicOperationsusinglistpage();
	    logger.info("user successfully clicked back and clicked Basic Operations in Lists link");
	}

	@Then("user moves to \"Basic Operations in Lists\" page")
	public void user_moves_to_page() {
	    array1.redirecttoBasicOperationsUsingusinglist();
	    logger.info("user is redirected to Basic Operations in Lists Page");
	}
	
	
	@When("user navigates back clicks \"Applications of Array\" link")
	public void user_navigates_back_clicks_link() throws InterruptedException {
	    array1.navigatebacktoApplicationsofArray();
	    logger.info("user successfully clicked back and clicked Applications of Array link");
	}


	@Then("user gets redirected to \"Applications of Array\" page")
	public void user_gets_redirected_to_page() throws InterruptedException {
	    array1.redirecttoApplicationsofArray();
	    logger.info("user successfully redirected to Applications of Array link");
	}

	
	@Then("user navigates back and clicks \"Practice Questions\" link")
	public void user_navigates_back_and_clicks_link() throws InterruptedException {
	    array1.navigate_to_practice_qtn_page();
	    logger.info("user successfully navigated back and clicked Practice questions link");
	}

	@Then("user is navigated to the practice links list page")
	public void user_is_navigated_to_the_practice_links_list_page() throws InterruptedException {
	    array1.redirecttopracticeqtnslink();
	    logger.info("user successfully navigated to Practice Links list page");
	}

	@Then("user clicks \"Search the array\" link")
	public void user_clicks_link1() throws InterruptedException {
	    array1.clickLink1();
	    logger.info("user successfully clicked search the array link");
	}

	@And("performs textbox input validations")
	public void performs_textbox_input_validations() {
	    array1.textboxinputvalidations();
	    logger.info("user successfully validated textbox input validations");
	}

	@Then("user navigates back and clicks \"Max Consecutive ones\" link")
	public void user_navigates_back_and_clicks_link2() throws InterruptedException {
	    array1.clickLink2();
	    logger.info("user successfully navigated back and clicked Max Consecutive ones link and validated text box input validations");
	    
	}

	@Then("user clicks back and hits \"Find Numbers with even number of digits\" link")
	public void user_clicks_back_and_hits_link3() throws InterruptedException {
	    array1.clickLink3();
	    logger.info("user successfully clicked back and hit Find Numbers with even number of digits link and validated textbox input validations ");
	}

	@Then("user goes back and clicks \"Squares of a sorted Array\" link")
	public void user_goes_back_and_clicks_link4() throws InterruptedException {
	    array1.clickLink4();
	    logger.info("user successfully clicked back and clicked squares of a sorted Array link and validated textbox input validations ");
	    
	}

}
