package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Signin {
	WebDriver driver;
	
	public Signin (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public void navigateTo_Signinpage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getSigninpageURL());
		
	}*/
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	WebElement signinbtn;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement loginbtn;
	
	@FindBy(id ="id_username")
	WebElement usrname;
	
	@FindBy(id = "id_password")
	WebElement pwd1;
	
	@FindBy(xpath ="/html/body/div[2]")
	WebElement successsignin;
	
	
	public void clickSignin() {
		signinbtn.click();
	}
	
	
		public void entercredentials(String username, String password1) {
		usrname.sendKeys(username);
		pwd1.sendKeys(password1);
	}
		
		public void clicklogin() {
			loginbtn.click();
		}
		
		public void validatesuccessfulsignin() {
			successsignin.isDisplayed();
		}
		
}
