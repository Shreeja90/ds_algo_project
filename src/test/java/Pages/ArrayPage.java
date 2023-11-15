package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ArrayPage {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	public ArrayPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait= new WebDriverWait(driver,(Duration.ofSeconds(60)));
		this.actions = new Actions(driver);
		
	}
	
	@FindBy(xpath="/html/body/div[2]")
	WebElement label2;
	
	@FindBy(xpath="//a[@href='array']")
	WebElement Arraygetstartedbtn;
	
	@FindBy(xpath="/html/body/div[2]/h4")
	WebElement arraylbl;
	
	public void getStarted() {
		wait.until(ExpectedConditions.visibilityOf(Arraygetstartedbtn));
		Arraygetstartedbtn.click();
		
	}
	public void successfulRedirection() {
		arraylbl.isDisplayed();
	}
	
	@FindBy(xpath="//a[@href='arrays-in-python']")
	WebElement ArraysinPythonlink;
	
	@FindBy(xpath="//p[@class='bg-secondary text-white']")
	WebElement label3;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryherebutton;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	WebElement texteditorbox;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement Runbutton;
	
	@FindBy(id="output")
	WebElement consoletext;
	
	public void naviagte_to_Arrays_in_Python() {
		wait.until(ExpectedConditions.visibilityOf(ArraysinPythonlink));
		ArraysinPythonlink.click();
		
		
	}
	
	public void redirecttoArraysinPythonPage() {
		label3.isDisplayed();
		
	}
	
	
	
	
	
	@FindBy(xpath="//a[@href='/array/arrays-using-list/']")
	WebElement ArraysUsingListlink;
	
	@FindBy(xpath="//p[@class='bg-secondary text-white']")
	WebElement ArraysUsingListpage;
	
	public void navigatebacktoArraysusinglist() throws InterruptedException {
		driver.navigate().back();
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		wait.until(ExpectedConditions.visibilityOf(ArraysUsingListlink));
		ArraysUsingListlink.click();
		
	}
	
	public void redirecttoArraysusinglist() {
		ArraysUsingListpage.isDisplayed();
	}
	
	

	
	@FindBy(xpath="//a[@href='/array/basic-operations-in-lists/']")
	WebElement basicoperationsinlistlink;
	
	@FindBy(xpath="//p[@class='bg-secondary text-white']")
	WebElement basicoperationsinlistpage;
	
	public void navigatebacktoBasicOperationsusinglistpage() throws InterruptedException {
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(basicoperationsinlistlink));
		basicoperationsinlistlink.click();
		
	}
	
	public void redirecttoBasicOperationsUsingusinglist() {
		basicoperationsinlistpage.isDisplayed();
	}
	
	
	@FindBy(xpath="//a[@href='/array/applications-of-array/']")
	WebElement ApplicationsofArraylink;
	
	@FindBy(xpath="//p[@class='bg-secondary text-white']")
	WebElement ApplicationsofArraypage;
	
	public void navigatebacktoApplicationsofArray() throws InterruptedException {
		driver.navigate().back();
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		wait.until(ExpectedConditions.visibilityOf(ApplicationsofArraylink));
		ApplicationsofArraylink.click();
		
	}
	
	public void redirecttoApplicationsofArray() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(ApplicationsofArraypage));
		ApplicationsofArraypage.isDisplayed();
	}
	
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")
	WebElement practicequeslink;
	
	@FindBy(xpath="//a[@href='/question/1']")
	WebElement link1;
	
	@FindBy(xpath="//a[@href='/question/2']")
	WebElement link2;
	
	@FindBy(xpath="//a[@href='/question/3']")
	WebElement link3;
	
	@FindBy(xpath="//a[@href='/question/4']")
	WebElement link4;
	
	
	@FindBy(xpath="//button[@type='button']")
	WebElement Run;
	
	public void navigate_to_practice_qtn_page() throws InterruptedException {
		driver.navigate().back();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		wait.until(ExpectedConditions.visibilityOf(practicequeslink));
		practicequeslink.click();
		
	}
	
	public void redirecttopracticeqtnslink() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(link1));
		link1.isDisplayed();
				
	}
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div")
    WebElement textBox;
	
	public void textboxinputvalidations() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(textBox));
		actions.click(textBox);
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.sendKeys(Keys.BACK_SPACE);
		actions.build().perform();
		textBox.click();
		String textToInput = "print 'Hello World'";
		actions.sendKeys(textBox, textToInput).perform();
		Run.click();
		
	}
	
	public void clickLink1() throws InterruptedException {
			link1.click();
			
			
		}
	
	
	public void clickLink2() throws InterruptedException {
		driver.navigate().back();
		link2.click();
		
	}
	
	public void clickLink3() throws InterruptedException {
		driver.navigate().back();
		link3.click();
		
	}
	
	public void clickLink4() throws InterruptedException {
		driver.navigate().back();
		link4.click();
		
		
	}
	

}
