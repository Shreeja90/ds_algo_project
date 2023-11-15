package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DatastructuresPage {
	
	
	WebDriver driver;
	

  WebDriverWait wait;
  JavascriptExecutor js = (JavascriptExecutor) driver;
	
  
	
	public DatastructuresPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait= new WebDriverWait(driver, (Duration.ofSeconds(60)));
	}
	
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement label1;
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement datastructbtngetStarted;
	
	@FindBy(xpath="//a[@href='time-complexity']")
	WebElement timecmpllink;
	
	@FindBy(xpath="//p[@class='bg-secondary text-white']")
	WebElement label;
	
	@FindBy(xpath="//a[@href='/data-structures-introduction/practice']")
	WebElement Practiceqtnpage;
	
	@FindBy(xpath="//a[@href='navbar-brand']")
	WebElement Numpyninjatext;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryherebtn;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	WebElement texteditor;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement RunButton;
	
	@FindBy(id="output")
	WebElement Consoletext;
	
	
	public void validatelogin() {
		label1.isDisplayed();
	}
	
	public void clickgetstartedbutton() {
		datastructbtngetStarted.click();
		
	}
	
	public void scrolltotimecomplexitylink() {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public void clicktimecomplexitylink() {
		wait.until(ExpectedConditions.visibilityOf(timecmpllink));
		timecmpllink.click();
		
	}
	
	public void validateredirection() {
		label.isDisplayed();
		}
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logoutbutton;
	
	@FindBy(xpath="/html/body/div[1]/nav/a")
	WebElement heading;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement user;
	
	public void practicequestionpage() throws InterruptedException {
		Practiceqtnpage.click();
		wait.until(ExpectedConditions.visibilityOf(logoutbutton));
		wait.until(ExpectedConditions.visibilityOf(heading));
		wait.until(ExpectedConditions.visibilityOf(user));
		//Thread.sleep(500);
	}
	
	
	
	
	public void navigateback() throws InterruptedException {
		driver.navigate().back();
		
		
	}
	
	
	public void dovalidations() throws InterruptedException {
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		wait.until(ExpectedConditions.visibilityOf(tryherebtn));
		tryherebtn.click();
		texteditor.sendKeys("print \"Hello World!\"");
		RunButton.click();
		Consoletext.isDisplayed();
		
		
	}
	
}