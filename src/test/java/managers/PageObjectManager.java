package managers;
  
import org.openqa.selenium.WebDriver;

import Pages.Homepage;


public class PageObjectManager {
 
	private WebDriver driver;
 
	//private ProductsPage productsPage;
 
	//private AddToCartPage addToCartPage;
 
	private Homepage homePage;
 
	//private CheckOutPage checkoutPage;
	
	//private LoginPage loginPage;

 
	
 
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
	}
 
	
	public Homepage getHomePage(){

		return (homePage == null) ? homePage = new Homepage(driver) : homePage;

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