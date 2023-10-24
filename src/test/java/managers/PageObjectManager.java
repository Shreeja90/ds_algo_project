package managers;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import Pages.Register;
import Pages.Signin;


public class PageObjectManager {
 
	private WebDriver driver;
 
	//private ProductsPage productsPage;
 
	//private AddToCartPage addToCartPage;
 
	private Homepage homePage;
 
	//private CheckOutPage checkoutPage;
	
	//private LoginPage loginPage;
	
	private Register registerPage;
	
	
	private Signin signinPage;

 
	
 
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
	}
 
	
	public Homepage getHomePage(){

		return (homePage == null) ? homePage = new Homepage(driver) : homePage;

	}
	
	public Register getRegisterPage() {
		
		return (registerPage == null)? registerPage = new Register(driver): registerPage;
		
	}
	
	public Signin getSigninPage() {
		return(signinPage == null)? signinPage = new Signin(driver): signinPage;
	}
}