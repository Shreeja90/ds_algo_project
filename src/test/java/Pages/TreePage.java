package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class TreePage {

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		public TreePage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(50)));
			this.actions = new Actions(driver);
		}
		
		@FindBy(xpath="//a[@href='tree']")
		WebElement treeGetStartedButton;
		
		public void clickTreeGetStartedButton() {
			wait.until(ExpectedConditions.visibilityOf(treeGetStartedButton));
			treeGetStartedButton.click();
		}
		
		@FindBy(xpath="//h4[text()='Tree']")
		WebElement checkTreeTitle;
		
		public void validateTreeTitle() {
			checkTreeTitle.isDisplayed();
		}
		public void navigateToOverviewOfTrees() {
			driver.navigate().to((FileReaderManager.getInstance().getConfigReader().getApplicationUrl()+"tree/overview-of-trees/"));
		}

		////a[contains (text(),'Practice Questions')]
		public void goToTreeLink(String testlink) {
			String locatorLink= "//a[contains(text(),'"+testlink+"')]";
			WebElement locatorLinkTree = driver.findElement(By.xpath(locatorLink));
			try {
			wait.until(ExpectedConditions.visibilityOf(locatorLinkTree));
			locatorLinkTree.click();
			}
	        catch (NoSuchElementException e) 
	        {
	        	e.printStackTrace();
	        	throw new AssertionError("Test Case Failed" + e.getMessage());
	        }
		}
		
		public void validateTreeLink(String testlink) {
			String locatorLink = "//p[contains(text(),'"+testlink+"')]";
			WebElement locatorLinkTree = driver.findElement(By.xpath(locatorLink));
			wait.until(ExpectedConditions.visibilityOf(locatorLinkTree));
			
			//driver.close();
				
		}
		
		@FindBy(xpath="//a[@href='/tryEditor']")
		WebElement tryHere;
		
		public void goToTryHereButton() {
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			wait.until(ExpectedConditions.visibilityOf(tryHere));
			tryHere.click();
		}
		
        @FindBy(xpath="//pre[@class=' CodeMirror-line ']")
        WebElement textBox;
        
		public void writeInTextBox() {
			wait.until(ExpectedConditions.visibilityOf(textBox));
			textBox.click();
			String textToInput = "print 'Hello'";
			actions.sendKeys(textBox, textToInput).perform();
		}
		
		@FindBy(xpath="//button[text()='Run']")
		WebElement runButton;
		
		public void clickRunButton() {
			runButton.click();
		}
		
		@FindBy(xpath="//a[contains (text(),'Practice Questions')]")
		WebElement practiceQuestionsButton;
		
		public void clickPracticeQuestionsButton() {
			practiceQuestionsButton.click();
		}
		
		
}