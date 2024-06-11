package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pim extends base {
	private WebDriver driver;
	
public pim(WebDriver driver) {
		
		this.driver=driver;
	}
	
//adding employee details

	public void empinfo() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='oxd-topbar-body']//li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("alaw");
		driver.findElement(By.name("middleName")).sendKeys("ss");
		driver.findElement(By.name("lastName")).sendKeys("abaz");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("singh");
		WebElement enable=driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		if(enable.isSelected()==false) {
			enable.click();
		}
		driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[2]//input")).sendKeys("alaw123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("alaw123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(9000);
		
	}
	
	
	
}

