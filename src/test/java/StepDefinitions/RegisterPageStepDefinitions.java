package StepDefinitions;
import org.openqa.selenium.WebDriver;
import Pages.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import cucumber.TestContext;

public class RegisterPageStepDefinitions {

	TestContext testContext;
	//WebDriver driver;
	Register registerPage;
	//WebDriverManager webDriverManager;
	//PageObjectManager pageObjectManager;
	public RegisterPageStepDefinitions(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}
	


@Given("User is on DSAlgo Registration page")
public void user_is_on_ds_algo_registration_page() {
	
	//webDriverManager = new WebDriverManager();
	//driver = webDriverManager.getDriver();
	//pageObjectManager = new PageObjectManager(driver);
	//registerPage = pageObjectManager.getRegisterPage();
	registerPage.navigateTo_RegisterPage();
	
}

@When("User clicks on Register button")
public void user_clicks_on_register_button() {
    registerPage.clickRegisterButton();
}

@When("user enters valid {string} and {string} and {string}")
public void user_enters_valid_and_and(String username, String password1, String password2) {
    // Write code here that turns the phrase above into concrete actions
   registerPage.enterValidCredentials(username, password1, password2);
}


 

@When("user clicks register button in registration page")
public void user_clicks_register_button_in_registration_page() {
	registerPage.clickSubmit();
}

@Then("user is logged into the account")
public void user_is_logged_into_the_account() {
	registerPage.verifySuccessfulLogin();
}

@Then("user clicks sign out button")
public void user_clicks_sign_out_button() {
	registerPage.clicksignout();
}

}
