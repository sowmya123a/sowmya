package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.admin;
import pages.login;


public class test3 {

	
	private WebDriver driver;
	private login ob;
	private admin ob2;
	
	@BeforeClass
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		
		
	}
	
	@AfterClass
	public void quit() {
		driver.close();
	}
	
	@Test(description= "adding new job catagory by admin")
	public void addjob() throws InterruptedException {
		
		ob=new login(driver);
		ob.logdetails("Admin", "admin123");;
		ob2=new admin(driver);		
		ob2.adminjob();
		ob2.jobcatagories();
	}
	
	
}
