package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	

    public Locators locators;

    public LoginPage() {

        this.locators = new Locators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 2);
        PageFactory.initElements(factory, this.locators);
    }
    
  

	public void login(String userName, String password) {
		locators.userName.sendKeys(userName);
    	locators.passowrd.sendKeys(password);
    	locators.loginButton.click();
		
	}

}
