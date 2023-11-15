package managers;

import org.openqa.selenium.WebDriver;

import Pages.ArrayPage;
import Pages.DataStructureDropdown;
import Pages.Homepage;
import Pages.RegisterPage;
import Pages.SigninPage;
import Pages.DatastructuresPage;


public class PageObjectManager {
 
	private WebDriver driver;
 
	//private ProductsPage productsPage;
 
	//private AddToCartPage addToCartPage;
 
	private Homepage homePage;
 
	//private CheckOutPage checkoutPage;
	
	//private LoginPage loginPage;
	
	private RegisterPage registerPage;
	
	private DataStructureDropdown dataStructureDropdown;
	
	private SigninPage signinPage;
	
	private DatastructuresPage datastructurePage;
	
	private ArrayPage arrayPage;
	
	
 
	
 
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
	}
 
	
	public Homepage getHomePage(){

		return (homePage == null) ? homePage = new Homepage(driver) : homePage;

	}
	
	public DataStructureDropdown getDataStructureDropdown() {
		return (dataStructureDropdown == null) ? dataStructureDropdown = new DataStructureDropdown(driver) : dataStructureDropdown;
		
	}
	
	public RegisterPage getRegisterPage() {
		
		return (registerPage == null)? registerPage = new RegisterPage(driver): registerPage;
		
	}
	
	public SigninPage signinPage() {
		return (signinPage  == null) ? signinPage = new SigninPage(driver) : signinPage;
		
	}
	
	public DatastructuresPage getdatastructurespage() {
		return(datastructurePage == null)?  datastructurePage = new DatastructuresPage(driver) : datastructurePage;
	}
	
	public ArrayPage getArrayPage() {
		return(arrayPage == null)?  arrayPage = new ArrayPage(driver) : arrayPage;
	}
	
}