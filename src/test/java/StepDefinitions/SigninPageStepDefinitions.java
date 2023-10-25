package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.Signin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import cucumber.TestContext;

public class SigninPageStepDefinitions {
	TestContext testContext;
	//WebDriver driver;
	Signin signinPage;
	//WebDriverManager webDriverManager;
	//PageObjectManager pageObjectManager;
	
	public SigninPageStepDefinitions(TestContext context) {
		testContext = context;
		signinPage = testContext.getPageObjectManager().getSigninPage();
	}
	
	
	
	
	
	@Given("User is on DSAlgo Portal sign in page")
	public void user_is_on_ds_algo_portal_sign_in_page() {
		
		//webDriverManager = new WebDriverManager();
		//driver = webDriverManager.getDriver();
		//pageObjectManager = new PageObjectManager(driver);
		//signinPage = pageObjectManager.getSigninPage();
		signinPage.navigateTo_Signinpage();
	}
	
	
	@When ("user clicks sign in")
	public void user_clicks_sign_in() {
		signinPage.clickSignin();
	}
	
	
	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password1) {
		signinPage.entercredentials(username, password1);
	    
	}
	
	@When ("User clicks sign in")
	public void User_clicks_sign_in() {
		signinPage.clicklogin();
		
	}

	@Then("User is navigated to inside account page")
	public void user_is_navigated_to_inside_account_page() {
		signinPage.validatesuccessfulsignin();
	  
	}


}
