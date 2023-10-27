package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.SigninPage;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SigninPageSteps {
	
	
	TestContext testContext;
	WebDriver driver;
	SigninPage signinPage;
	WebDriverWait wait;
	
	
	public SigninPageSteps(TestContext context) {
		testContext = context;
		signinPage = testContext.getPageObjectManager().signinPage();
	}
	
	@And("The user clicks on sign in button")
	public void goToSignInTab() {
		signinPage.waitForSigninPage();
		signinPage.clickSignin();
	}
	
	
	@And("User enter valid {string} and {string}")
	public void enterLoginDetails(String username , String password1) 
	{
		signinPage.enterUserName(username);
	    signinPage.enterPassword(password1);
	}
	
	@And("User clicks sign in")
	public void clickSignin() {
		
		signinPage.clickLogin();
		
	}

	@Then("User is navigated to inside account page")
	public void accountPageIsOpen() {
		//signinPage.validatesuccessfulsignin();
	  
	}


}



