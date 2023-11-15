package Pages;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

import managers.FileReaderManager;
import stepDefinition.LinkedListSteps;

public class LinkedList {

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	private static Logger logger = LogManager.getLogger(LinkedList.class);
	JavascriptExecutor js = (JavascriptExecutor) driver;
		public LinkedList (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(60)));
			this.actions = new Actions(driver);
		}
		
		@FindBy(xpath="//a[@href='linked-list']")
		WebElement LinkedListGetStartedButton;
		
		public void clickLinkedListGetStartedButton() {
			wait.until(ExpectedConditions.visibilityOf(LinkedListGetStartedButton));
			LinkedListGetStartedButton.click();
		}
		
		@FindBy(xpath="//h4[text()='Linked List']")
		WebElement checkLinkedListTitle;
		
		public void validateLinkedListTitle() {
			checkLinkedListTitle.isDisplayed();
		}
		/*
		 * public void navigateToIntroduction() {
		 * driver.navigate().to((FileReaderManager.getInstance().getConfigReader().
		 * getApplicationUrl()+"linked-list/introduction/")); }
		 */
		
		public void goToLinkedListLink(String testlink) {
			String locatorLink= "//a[contains(text(),'"+testlink+"')]";
			WebElement locatorLinkLinkedList = driver.findElement(By.xpath(locatorLink));
			wait.until(ExpectedConditions.visibilityOf(locatorLinkLinkedList));
			locatorLinkLinkedList.click();
				
		}
		
		public void validateLinkedListLink(String testlink) {
			String locatorLink = "//p[contains(text(),'"+testlink+"')]";
			WebElement locatorLinkLinkedList = driver.findElement(By.xpath(locatorLink));
			wait.until(ExpectedConditions.visibilityOf(locatorLinkLinkedList));
			
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
			logger.info(" entered clickRunButton  ");
			runButton.click();
		}
		
		
		
}
	

