package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructureDropdown {
	
	WebDriver driver;
	
	public DataStructureDropdown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//a[text()='Data Structures']")
	   WebElement dataStructures;
	   
	   public void clickDataStructures() {
		   dataStructures.click();
	   }
      public void dsElementVisible() {     //to check whether Datastructuredropdown element is visible
	dataStructures.isDisplayed();
     }
     }
