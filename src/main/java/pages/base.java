package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public WebDriver driver;
	
	public WebDriver set() {
		driver = WebDriverManager.chromedriver().create();		
		return driver;
		
	}
	
	
}
