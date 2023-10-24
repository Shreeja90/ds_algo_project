package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Register {
	WebDriver driver;
	
	
	public Register (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_RegisterPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getRegisterpageUrl());
	}
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement registerbutton;
	
	public void clickRegisterButton() {
		registerbutton.click();
	}
	
	@FindBy(id="id_username")
	WebElement usrname;
	@FindBy(id="id_password1")
	WebElement pwd1;
	@FindBy(id = "id_password2")
	WebElement pwd2;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[5]")
	WebElement submit;
	@FindBy(xpath="/html/body/div[2]")
	WebElement successmsg;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	WebElement signout;
	
	public void enterValidCredentials(String username, String password1, String password2) {
		usrname.sendKeys(username);
		pwd1.sendKeys(password1);
		pwd2.sendKeys(password2);
		
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void verifySuccessfulLogin() {
		
		successmsg.isDisplayed();
		
		
	}
	public void clicksignout() {
		signout.click();
	}
	

}
