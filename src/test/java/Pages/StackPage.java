package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StackPage {
	WebDriver driver;
	WebDriverWait wait;
	
		public StackPage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(60)));
		}
		
		@FindBy(xpath = "//a[@href='stack']")
		WebElement getStartedBtnStack;
		
		public void clickGetStartedBtnStack() {
			getStartedBtnStack.click();
		}
		
		@FindBy(xpath = "//a[@href='operations-in-stack']")
		WebElement operationsInStackLink;
		
		public void clickOperationsInStack() {
			operationsInStackLink.click();
		}
		
		@FindBy(xpath="//a[@href='/tryEditor']")
		WebElement tryHere;
		
		public void clickTryHere() {
			tryHere.click();
		}
		
		@FindBy(className = "CodeMirror-code")
		WebElement pythonEditor;
		
		public void editor() {
			String code= "print 'Hello World'";
			Actions action = new Actions(driver);
			action.moveToElement(pythonEditor).click().sendKeys(code).perform();	
		}
		
		@FindBy(xpath = "//button[text()='Run']")
		WebElement runBtn;
		
		public void clickRunBtn() {
			runBtn.click();
		}
		
		@FindBy(id = "output")
		WebElement output;
		public void checkOutput() {
			Assert.assertEquals("Hello World",output.getText());
		}
		
		public void returnToPrevURL() {
			driver.navigate().back();
		}
		
		@FindBy(xpath = "//a[@href='/stack/implementation/']")
		WebElement implementationLink;
		
		public void clickImplementationLink() {
			implementationLink.click();
		}
		
		@FindBy(xpath = "//a[@href='/stack/stack-applications/']")
		WebElement applicationsLink;
		
		public void clickApplicationsLink() {
			applicationsLink.click();
		}
		
		@FindBy(xpath = "//a[text()='Practice Questions']")
		WebElement practiceQstns;
		
		public void clickPractQstnsLink() {
			practiceQstns.click();
		}
		
}
