package managers;
  
import org.openqa.selenium.WebDriver;

import Pages.DataStructureDropdown;
import Pages.Homepage;
import Pages.RegisterPage;
import Pages.SigninPage;
import Pages.TreePage;



public class PageObjectManager {
 
	private WebDriver driver;
 
	//private ProductsPage productsPage;
 
	//private AddToCartPage addToCartPage;
 
	private Homepage homePage;
	private DataStructureDropdown dataStructureDropdown;
	private RegisterPage registerPage;
	private SigninPage signinPage;
	private TreePage treePage;
	//private CheckOutPage checkoutPage;
	
	//private LoginPage loginPage;

 
	
 
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
		return (registerPage  == null) ? registerPage = new RegisterPage(driver) : registerPage;
		
	}
	public SigninPage signinPage() {
		return (signinPage  == null) ? signinPage = new SigninPage(driver) : signinPage;
		
	}
	public TreePage treePage() {
		return (treePage  == null) ? treePage = new TreePage(driver) : treePage;
		
	}
	//public ProductsPage getProductListingPage() {
 
		//return (productsPage == null) ? productsPage = new ProductsPage(driver) : productsPage;
 
	//}
 
	
 
//	=public AddToCartPage getAddToCartPage() {
 
		//return (addToCartPage == null) ? addToCartPage = new AddToCartPage(driver) : addToCartPage;
 
	//}
 
	
 
	//public CheckOutPage getCheckoutPage() {
 
		//return (checkoutPage == null) ? checkoutPage = new CheckOutPage(driver) : checkoutPage;
 
	//}
	
	//public LoginPage getLoginPage() {
		 
		//return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
 
	//}
 
	
}