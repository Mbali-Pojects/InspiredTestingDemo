package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class Locators {
	

	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passowrd;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement loginButton;
	
	
	@FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
	public WebElement verifyLoginPage;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement addBackPack;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	public WebElement addTShirt;
	
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement cartIcon;
	
	@FindBy(xpath = "//span[contains(.,'Your Cart')]") 
	public WebElement insideCart;
	
	@FindBy(xpath = "//button[contains(.,'Checkout')]")
	public WebElement checkout;
	
	@FindBy(xpath = "//span[contains(.,'Products')]")
	public WebElement verifyProductsPage;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	public WebElement checkifBackPackIsPresent;
	
	@FindBy(xpath = "//button[@name='remove-sauce-labs-bolt-t-shirt']")
	public WebElement checkIfTshirtIsPresent;
	
	
	
	
	
	
	
	
	 
	 
	

}
