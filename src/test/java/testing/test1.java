package testing;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLClassLoader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.admin;
import pages.base;
import pages.login;
import pages.pim;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1{

	private WebDriver driver;
	private login ob;
	
	@BeforeClass
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		
		
	}
	
	@AfterClass
	public void quit() {
		driver.close();
	}
	
	
	
	
	@Test(dataProvider="logininput", description="checking login inputs")
	public void testlogin(String uname, String pswrd) throws InterruptedException {
		ob=new login(driver);
		if(uname!=null && pswrd!=null)
		{
			ob.logdetails(uname, pswrd);
			System.out.println(uname + pswrd);
			String urll=driver.getCurrentUrl();
			if(urll.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
		Assert.assertTrue(true);
			
		}
		else
		{
			//captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
		}
		
		
	}
	
	
	
	
	
	@DataProvider(name="logininput")
	public String[][] logininput() throws IOException{
		
		//String excelfilepath=System.getProperty("user.dir")+"\\Testdata\\datas.xlsx";
		String excelfilepath="E:\\practice excel\\datas.xlsx";
		FileInputStream file=new FileInputStream(excelfilepath);
		
		
		Workbook excel=null;
		excel=new XSSFWorkbook(file);
		Sheet sheet=excel.getSheet("login");
		
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		int colcount=sheet.getRow(0).getLastCellNum();
       String [][] data= new String[rowcount][colcount];
		
		for(int r=1; r<=rowcount; r++) {
			//Row row=sheet.getRow(r);
       
			for(int c=0; c<=1; c++) {
		 		Cell cell=excel.getSheet("login").getRow(r).getCell(c);
				data[r-1][c]=cell.getStringCellValue();								
			}
		}
		return data;
		
		
	}
	
	
	
	
}
