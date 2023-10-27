package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SigninPage 
{
	WebDriver driver;
	WebDriverWait wait;
		public SigninPage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(60)));
		}
		
		
		
		@FindBy(xpath ="//a[text()='Sign in']")
		WebElement signinButton;
		
		public void waitForSigninPage() {
		wait.until(ExpectedConditions.visibilityOf(signinButton));
		}
 
		
		public void clickSignin(){
			signinButton.click();
		}
		

		@FindBy(xpath ="//input[@name='username']")
		WebElement userName;
		
			public void enterUserName(String username)  {
		    wait.until(ExpectedConditions.visibilityOf(userName));
			userName.sendKeys(username);
			
		}
			@FindBy(xpath = "//input[@name='password']")
			WebElement password;
			
			public void enterPassword(String password1) {
				wait.until(ExpectedConditions.visibilityOf(password));
				password.sendKeys(password1);
			}
			
			
			@FindBy(xpath = "//input[@value='Login']")
			WebElement loginButton;
			
			public void clickLogin() {
				loginButton.click();
			}
			
			@FindBy(xpath ="//div[contains(text(),'logged in')]")
			WebElement successSignIn;
			
			public void validatesuccessfulsignin() {
				wait.until(ExpectedConditions.visibilityOf(successSignIn));
				successSignIn.isDisplayed();
			}
			
	}


