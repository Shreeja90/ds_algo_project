package StepDefinitions;

	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;

import Pages.Homepage;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import managers.PageObjectManager;
	import managers.WebDriverManager;
	import cucumber.TestContext;

	public class HomePageStepDefinitions {
		
		TestContext testContext;
		//WebDriver driver;
		Homepage homePage;
		//WebDriverManager webDriverManager;
		//PageObjectManager pageObjectManager;
		
			public HomePageStepDefinitions(TestContext context) {
			testContext = context;
			homePage = testContext.getPageObjectManager().getHomePage();
		}
		
		
		@Given("The user opens DS Algo portal link")
	    public void openDsAlgoportal() {
	    	//webDriverManager = new WebDriverManager();
			//driver = webDriverManager.getDriver();
			//pageObjectManager = new PageObjectManager(driver); 
			//homePage = pageObjectManager.getHomePage();
			homePage.navigateTo_HomePage();
	    	
	    }
	   
	    @When("The user clicks the get started button")
	    public void the_user_clicks_the_get_started_button() {
	        homePage.clickGetStarted();
	    }

	    @Then("The user should be redirected to homepage")
	    public void The_user_should_be_redirected_to_homepage() {
	    	/*String title = driver.getTitle();
	    	Assert.assertTrue(title.contains("NumpyNinja"));
	    	System.out.println("Page Title:" +title);*/
	    }
	}


