package DataDrivn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class createProject {
	
	@Test
	public void testcreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
		//Step 1 Fetching all necessary data from excel
		String url=ExcelOperation.readData("Sheet1", 1, 0);
		String un=ExcelOperation.readData("Sheet1", 1, 1);
		String psd=ExcelOperation.readData("Sheet1", 1, 2);
		String prjName=ExcelOperation.readData("Sheet1",14,3);
		String expRes=ExcelOperation.readData("Sheet1",14,4);
		
		//Step 2 Writing Testing Logic
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
		WebElement w1 = driver.findElement(By.name("customerId"));
		Select s=new Select(w1);
		s.selectByIndex(4);
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys(prjName);
		driver.findElement(By.name("createProjectSubmit")).click();
		String actRes = driver.findElement(By.className("successmsg")).getText();
		ExcelOperation.writeData("Sheet1",14,5,actRes);
		Thread.sleep(1000);
		if(expRes.equals(actRes))
		{
			
			
			ExcelOperation.writeData("Sheet1", 14,6,"Pass");
			
		}
		else {
			
			ExcelOperation.writeData("Sheet1", 14,6,"Fail");
		}	
		
		Thread.sleep(2000);
		driver.findElement(By.className("logoutImg")).click();
		driver.close();
		
	}
	
}
