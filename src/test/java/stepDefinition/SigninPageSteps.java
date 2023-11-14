package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.SigninPage;
import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	
	@When("User enter valid credentials")
	public void enterLoginDetails(DataTable table) 
	{
		
	    List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	    for (Map<String, String> columns : rows) {   
			signinPage.enterUserName(columns.get("username"));
		    signinPage.enterPassword(columns.get("password"));
	    }
	  
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



