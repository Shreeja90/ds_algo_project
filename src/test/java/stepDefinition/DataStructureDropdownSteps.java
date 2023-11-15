package stepDefinition;

import Pages.DataStructureDropdown;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class DataStructureDropdownSteps {

	TestContext testContext;
	DataStructureDropdown dataStructureDropdown;

	public DataStructureDropdownSteps(TestContext context) {
		testContext = context;
		dataStructureDropdown = testContext.getPageObjectManager().getDataStructureDropdown();
	}
	 
	 @And("User clicks on data structure dropdown")
	    public void Clickdata_structures() {
		 dataStructureDropdown.clickDataStructures();
	    	}
	    @Then("I should see 6 different data structure entries in that dropdown")
	    public void dropdownDataStructures() {
	    	dataStructureDropdown.dsElementVisible();;
	    	
	    }
	
}