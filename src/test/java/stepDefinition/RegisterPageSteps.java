package stepDefinition;


import Pages.RegisterPage;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegisterPageSteps {

	TestContext testContext;
	RegisterPage registerPage;

	public RegisterPageSteps(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}
	 
	@And("The user clicks \"Register\"")
    public void clickRegisterLink() {
		registerPage.waitForRegisterLink();
		registerPage.clickRegisterLink();
	}
	
    @And("The user should be redirected to Register form")
    public void registerFormIsOpen() {
    	//registerPage.waitForUsernameTextField();
    	//registerPage.elementIsDisplayed();
    }
     
    @And("user enters valid {string} and {string} and {string}")
    public void enterUsernamePassword(String username, String password, String password2) {
    	registerPage.enterUserName(username);
    	registerPage.enterPassword(password);
    	registerPage.enterPasswordConfirmation(password2);
    }
    @And("user clicks register button in registration page")
    public void clickOnRegisterButton() {
    	registerPage.clickRegisterButton();
    	registerPage.waitToRedirectedToHomepage();
    }
   @Then("The user should be redirected to homepage with success message")
   public void viewSuccessMessage() {
	   registerPage.validateSuccessMessage();
   }
}
