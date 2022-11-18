package Tests;

import java.util.Hashtable;
import org.junit.Test;



import com.relevantcodes.extentreports.ExtentReports;

import Base.BaseClass;
import Pages.LoginPage;
import Pages.ProductsPage;

public class Tests extends BaseClass {
	
	 ExtentReports extentReport = new ExtentReports(null);
	 
	 @Test()
	 public void onlineshopping(Hashtable<String, String> data) {
		 
		 
		 extentReport.startTest(data.get("Test_Case_Description"));
		 
		
		 LoginPage loginPage = new LoginPage();
		 loginPage.login(data.get("Username"), data.get("Passoword"));
		
		 
		 ProductsPage productsPage = new ProductsPage();
		 productsPage.products();
	


	 }
}
