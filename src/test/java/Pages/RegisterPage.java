package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class RegisterPage {
	WebDriver driver;
	
	
	WebDriverWait wait;

		
		public RegisterPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(60)));
		}
		
		@FindBy(xpath="//a[text()=' Register ']")
		WebElement registerLink;

	    public void waitForRegisterLink() {
	        wait.until(ExpectedConditions.visibilityOf(registerLink));
	    }
		
		public void clickRegisterLink() {
			registerLink.click();
			}
		
		@FindBy(id="id_username")
		WebElement userNameText;
		
	    public void waitForUsernameTextField() {
	    	//System.out.println("Checking the Usernametext");
	        //wait.until(ExpectedConditions.visibilityOf(userNameText));
	    }
		
		/*public void elementIsDisplayed() {
			boolean status;
			status = userNameText.isDisplayed();
			System.out.println(status);
			}*/
		
		@FindBy(id="id_username")
		WebElement userName;
		
		public void enterUserName(String username) {
			wait.until(ExpectedConditions.visibilityOf(userName));
			userName.sendKeys(username);
		}
		
		@FindBy(id="id_password1")
		WebElement password;
		
		public void enterPassword(String password1) {
			password.sendKeys(password1);
			
		}
		
		@FindBy(id="id_password2")
		WebElement passwordConfirmation;
		
		public void enterPasswordConfirmation(String password2) {
			passwordConfirmation.sendKeys(password2);
		}
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement registerButton;
		
		public void clickRegisterButton() {
			registerButton.click();
		}
		 public void waitToRedirectedToHomepage() {
		        wait.until(ExpectedConditions.visibilityOf(successMessage));
		    }
		@FindBy(xpath="//div[contains (text(),'New Account Created')]")
		WebElement successMessage;
		
		public void validateSuccessMessage() {
			successMessage.isDisplayed();
			System.out.println(successMessage.getText());
			
		}
	}