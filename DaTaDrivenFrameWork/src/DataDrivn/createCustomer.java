package DataDrivn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class createCustomer {
	
	@Test
	public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException{
		//fetching all necessary data
		String url=ExcelOperation.readData("Sheet1", 1, 0);
		String un=ExcelOperation.readData("Sheet1", 1, 1);
		String psd=ExcelOperation.readData("Sheet1", 1, 2);
		String cstName=ExcelOperation.readData("Sheet1", 4, 3);
		String expRes=ExcelOperation.readData("Sheet1", 4, 4);
		//writing the testing logic
		System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(cstName);
		driver.findElement(By.name("createCustomerSubmit")).click();
		String actRes=driver.findElement(By.className("successmsg")).getText();
		System.out.println(actRes);
		Thread.sleep(1000);
		ExcelOperation.writeData("Sheet1", 4, 5, actRes);  //transfer result to excel
		if(expRes.equals(actRes))    // comparing expected vs actual result
		{
			ExcelOperation.writeData("Sheet1", 4 , 6, "Pass");
			
		}
		else
		{
			
			ExcelOperation.writeData("Sheet1", 4 , 6, "Fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.className("logoutImg")).click();
		driver.close();
		
	}
	
	

}
