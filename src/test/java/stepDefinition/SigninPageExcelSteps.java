package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.SigninPage;
import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import dataproviders.ConfigFileReader;
import dataproviders.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class SigninPageExcelSteps {
	
	
	TestContext testContext;
	WebDriver driver;
	SigninPage signinPage;
	WebDriverWait wait;
	
	
	private ExcelReader excelReader;
	
	
	public SigninPageExcelSteps(TestContext context) throws IOException {
		
		testContext = context;
		signinPage = testContext.getPageObjectManager().signinPage();
		
		
	}
	
	@And("The user clicks on log in button")
	public void The_user_clicks_on_log_in_button() {
		signinPage.waitForSigninPage();
		signinPage.clickSignin();
	}
	
	
	@When("User enters data from Excel file with SheetName {string} and RowNumber {int}")
    public void userEntersDataFromExcel(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {


       
		ExcelReader reader = new ExcelReader();
		ConfigFileReader configReader = new ConfigFileReader();
        String excelFilePath = configReader.getExcelFilePath();
        String sheetName1 = configReader.getSheetName();

		List<Map<String, String>> testdata = reader.getData(excelFilePath, sheetName1);

		String username = testdata.get(rowNumber).get("username");

		String password = testdata.get(rowNumber).get("password");
		signinPage.enterUserName(username);
		signinPage.enterPassword(password);

        
        System.out.println("Entering username: " + username + " and password:" + password +"from excel sheet");
    }
		
		
	
	
	@And("User clicks log in")
	public void clickLogin() {
		
		signinPage.clickLogin();
		
	}

	/*@Then("User is navigated to inside account page")
	public void accountPageIsOpen() {
		signinPage.validatesuccessfulsignin();
	  
	}*/
	
	

}