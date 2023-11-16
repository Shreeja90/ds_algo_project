package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueuePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
		public QueuePage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, (Duration.ofSeconds(20)));
		}
		
		@FindBy(xpath = "//a[@href='queue']")
		WebElement getStartedQueueBtn;
		
		public void clickGetStartedQueue() {
			getStartedQueueBtn.click();
		}

		@FindBy(xpath = "//a[@href='implementation-lists']")
		WebElement implementationListsLink;
		
		public void clickImpleListsLink() {
			implementationListsLink.click();
		}
		
		public void returnToPrevURL() {
			driver.navigate().back();
		}
		
		@FindBy(xpath = "//a[@href='/queue/implementation-collections/']")
		WebElement implementationCollectionsLink;
		
		public void clickImpleCollectionsLink() {
			implementationCollectionsLink.click();
		}
	
		@FindBy(xpath = "//a[@href='/queue/Implementation-array/']")
		WebElement impleArrayLink;
		
		public void clickImpleArrayLink() {
			impleArrayLink.click();
		}
		
		@FindBy(xpath = "//a[@href='/queue/QueueOp/']")
		WebElement queueOpLink;
		
		public void clickQueueOpLinkLink() {
			queueOpLink.click();
		}
		
}
