package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.admin;
import pages.login;
import pages.pim;

public class test2 {

	private WebDriver driver;
	private login ob;
	private pim ob1;
	private admin ob2;
	
	@BeforeClass
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		
		
	}
	
	@AfterClass
	public void quit() {
		driver.close();
	}
	
	@Test(description= "adding new user")
	public void addusr() throws InterruptedException {
		
		ob=new login(driver);
		ob.logdetails("Admin", "admin123");;
		ob1=new pim(driver);		
		ob1.empinfo();
	}
	
}
