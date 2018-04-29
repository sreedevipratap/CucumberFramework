package managers;


import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
//import pageObjects.ConfirmationPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private ProductListingPage productListingPage;
	
	private CartPage cartPage;
	
	private CheckOutPage checkOutPage;
	
	private HomePage homePage;
	
	//private ConfirmationPage confirmationPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return(homePage==null)? homePage=new HomePage(driver):homePage;
	}
	public CartPage getCartPage() {
		return(cartPage==null)? cartPage=new CartPage(driver):cartPage;
	}
	
	public CheckOutPage getCheckOutPage() {
		return(checkOutPage==null)? checkOutPage=new CheckOutPage(driver):checkOutPage;
	}
	
	public ProductListingPage getProductListingPage() {
		return(productListingPage==null)? productListingPage=new ProductListingPage(driver):productListingPage;
	}
	
	
	
	}
