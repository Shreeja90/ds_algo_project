package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GraphPage {
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		public GraphPage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(60)));
			this.actions = new Actions(driver);
		}
		
		@FindBy(xpath="//a[@href='graph']")
		WebElement GraphGetStartedButton;
		
		public void clickGraphGetStartedButton() {
			wait.until(ExpectedConditions.visibilityOf(GraphGetStartedButton));
			GraphGetStartedButton.click();
		}
		
		@FindBy(xpath="//h4[text()='Graph']")
		WebElement checkGraphTitle;
		
		public void validateGraphTitle() {
			checkGraphTitle.isDisplayed();
		}
		/*
		 * public void navigateToIntroduction() {
		 * driver.navigate().to((FileReaderManager.getInstance().getConfigReader().
		 * getApplicationUrl()+"linked-list/introduction/")); }
		 */
		
		public void goToGraphLink(String testlink) {
			//String locatorLink= "//a[contains(text(),'"+testlink+"')]";	
			// WebElement locatorLinkGraph = driver.findElement(By.xpath(locatorLink));
			 WebElement locatorLinkGraph = driver.findElement(By.linkText(testlink));
			 wait.until(ExpectedConditions.visibilityOf(locatorLinkGraph));
			 locatorLinkGraph.click();
				
		}
		public void validateGraphLink(String testlink) {
			String locatorLink = "//p[contains(text(),'"+testlink+"')]";
			WebElement locatorLinkGraph = driver.findElement(By.xpath(locatorLink));
			wait.until(ExpectedConditions.visibilityOf(locatorLinkGraph));
			
			//driver.close();
				
		}
		
		@FindBy(xpath="//a[text()='Try here>>>']")
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
		
		
		
}

