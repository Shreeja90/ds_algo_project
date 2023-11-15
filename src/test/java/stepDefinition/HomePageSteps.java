package stepDefinition;

	import Pages.Homepage;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class HomePageSteps {
		
		TestContext testContext;
		//WebDriver driver;
		Homepage homePage;
		//WebDriverManager webDriverManager;
		//PageObjectManager pageObjectManager;
		
		public HomePageSteps(TestContext context) {
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
	   
		 @When("The user clicks the \"Get Started\" button") 
		 public void ClickingGetStartedButton() {
	        homePage.clickGetStarted();
	    }

	    @Then("The user should be redirected to homepage")
	    public void The_user_should_be_redirected_to_homepage() {
	    	/*String title = driver.getTitle();
	    	Assert.assertTrue(title.contains("NumpyNinja"));
	    	System.out.println("Page Title:" +title);*/
	    }
	}


