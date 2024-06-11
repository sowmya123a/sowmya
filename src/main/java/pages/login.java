package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class login extends base{

	private WebDriver driver;
	
	public login(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void logdetails(String user, String pass) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement unme=driver.findElement(By.name("username"));
		unme.sendKeys(user);
		WebElement psw=driver.findElement(By.name("password"));
		psw.sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
	}
	
	}
