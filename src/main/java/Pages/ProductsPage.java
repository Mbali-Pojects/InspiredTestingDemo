package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import Base.BaseClass;

public class ProductsPage extends BaseClass{
	

    public Locators locators;

    public ProductsPage() {

        this.locators = new Locators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 2);
        PageFactory.initElements(factory, this.locators);
    }
    
    public void products() {
    	
    	Assert.assertTrue(isElementPresent((By) locators.verifyProductsPage), "Failed to load Productspage");
    	locators.addBackPack.click();
    	locators.addTShirt.click();
    	locators.cartIcon.click();
    	
    	Assert.assertTrue(isElementPresent((By) locators.insideCart), "Failed to load cart page");
    	
    	
    	boolean InsideCart = true;
    	
    	if (InsideCart) {
    		
    		locators.checkifBackPackIsPresent.isDisplayed();
			
		}else if (InsideCart) {
			
			locators.checkIfTshirtIsPresent.isDisplayed();
			
		}else {
			System.out.println("Cart is empty");
		}
    	
    	locators.checkout.click();
    	
    }

		
	}
    	
    	
    


