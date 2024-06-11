package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class admin extends base {

	private WebDriver driver;
	
	public admin(WebDriver driver) {
			
			this.driver=driver;
		}
	
	//Admin Panel job menu
	
	public void adminjob() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//nav[@role='navigation' and @class='oxd-topbar-body-nav']//li[2]")).click();
		Thread.sleep(5000);	
		
	}
	
	//admin panel job menus job catagories
	//adding job catagories
	
	public void jobcatagories() throws InterruptedException {
		driver.findElement(By.xpath("//nav[@role='navigation' and @class='oxd-topbar-body-nav']//li[2]//ul//li[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']/parent::*//div//button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(), 'Name')]/parent::*//following::div//input")).sendKeys("Client Coordinater");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//div[contains(text(), 'Client Coordinater')]/parent::*/parent::*/parent::*/following::div[3]/button[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Client Coordinater')]/parent::*/following::div[2]/button[2]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]")).click();
		Thread.sleep(9000);
	}
	
}
