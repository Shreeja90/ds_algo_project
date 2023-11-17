package stepDefinition;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.SigninPage;
import cucumber.TestContext;
import dataproviders.CSVFileReader;
import dataproviders.ConfigFileReader;
import dataproviders.User;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninCSVSteps {
	
	
	TestContext testContext;
	WebDriver driver;
	SigninPage signinPage;
	WebDriverWait wait;
	
	
	private CSVFileReader csvReader;
	
	
	public SigninCSVSteps(TestContext context) throws IOException {
		
		testContext = context;
		signinPage = testContext.getPageObjectManager().signinPage();
		
		
	}
	
	
	
	@When("user log in with valid credentials from {string} and {string}")
	public void user_log_in_with_valid_credentials_from_and(String csvfilepath, String row) {
		
		CSVFileReader reader = new CSVFileReader();
		ConfigFileReader configReader = new ConfigFileReader();
		String csvfilepath1 = configReader.getCSVFilepath();
		
          int rowNum = Integer.parseInt(row);
        
        String[] credentials = reader.readCSVRow(csvfilepath1,rowNum);
        String username = credentials[0];
        String password = credentials[1];
        
        signinPage.enterUserName(username);
        signinPage.enterPassword(password);
	    
	}

       
    
	 @Then ("user click login button")
	 public void userclickLogin() {
		 signinPage.clickLogin();
	 }
		
	
	
	@Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
       
    }

   
}