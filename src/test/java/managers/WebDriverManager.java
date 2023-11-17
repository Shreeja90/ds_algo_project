package managers;
 
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import enums.DriverType;
import enums.EnvironmentType;
 
public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String FF_DRIVER_PROPERTY = "webdriver.firefox.driver";
	private static final String EDGE_DRIVER_PROPERTY = "webdriver.msedge.driver";
	private static String dir = System.getProperty("user.dir");
 
	public WebDriverManager() {
		
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	}
 
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
 
	private WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}
 
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
 
	private WebDriver createLocalDriver() {
        switch (driverType) {	    
        case FIREFOX : 
        	String path = FileReaderManager.getInstance().getConfigReader().getDriverPathFF();
        	path = dir+path;
        	System.setProperty(FF_DRIVER_PROPERTY, path);
        	driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	path = FileReaderManager.getInstance().getConfigReader().getDriverPathChrome();
        	path = dir+path;
        	//WebDriverManager.chromedriver().clearDriverCache().setup();

			//WebDriverManager.chromedriver().clearResolutionCache().setup();
            System.setProperty(CHROME_DRIVER_PROPERTY, path);
        	driver = new ChromeDriver();
    		break;
        case SAFARI : driver = new SafariDriver();
    		break;
        case EDGE : 
        	path = FileReaderManager.getInstance().getConfigReader().getDriverPathEdge();
        	path = dir+path;
        	System.setProperty(EDGE_DRIVER_PROPERTY, path);
        	driver = new EdgeDriver();
    		break;
        case CHROMEHEADLESS : 
        	path = FileReaderManager.getInstance().getConfigReader().getDriverPathChrome();
        	path = dir+path;
        	ChromeOptions chromeOptions = new ChromeOptions();
    		chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
            System.setProperty(CHROME_DRIVER_PROPERTY, path);
            driver = new ChromeDriver(chromeOptions);
        	break;
        }
 
        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
        
		return driver;
	}	
	
	
 
	public void closeDriver() {
		driver.close();
		//driver.quit();
	}	
 
}