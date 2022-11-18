package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	 public static WebDriver driver;
	    public static Properties config = new Properties();
	    public static FileInputStream fis;

	    //public static ExcelReader excel = new ExcelReader(
	  
	     //System.getProperty("user.dir") + "\\src\\test\\java\\Testdata\\Test.xlsx");
	    public static WebDriverWait wait;
	   //public ExtentReports extentReports = ExtentManager.getInstance();
	    public static ExtentTest test;
	    public static String browser;

	    @BeforeSuite
	    public void setUp() throws IOException {

	        //Load the config file
	        fis = new FileInputStream("src/test/java/Files/Config.properties");
	        config.load(fis);
	        

	        if (config.getProperty("browser").equals("chrome")) {
	            System.setProperty("webdriver.chrome.driver",
	                    System.getProperty("user.dir") + "\\src\\test\\java\\Executables\\chromedriver.exe");
	            driver = new ChromeDriver();


	        } else if (config.getProperty("browser").equals("Firefox")) {
	            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
	                    "src\\test\\java\\Executables\\geckodriver.exe");
	            driver = new FirefoxDriver();

	        }

	        driver.get(config.getProperty("siteUrl"));
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")), TimeUnit.SECONDS);

	    }

	    public boolean isElementPresent(By by){

	        try{
	            driver.findElement(by);
	            return true;
	        }catch (NoSuchElementException e){

	            return false;
	        }
	    }

	    @AfterSuite
	    public void tearDown() throws InterruptedException {

	        if (driver != null) {
	            driver.quit();

	        }

	    }

}
