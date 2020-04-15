package SuggesterCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class lock_App {
	@Test
	public void testlock_App() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://sandeepakkic2.sugester.com/login");
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'sandeepakkic2@gmail.com')]")).click();
		driver.findElement(By.linkText("Lock screen")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='unlock']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-white btn-xs dropdown-toggle')]")).click();
		driver.findElement(By.linkText("Show")).click();
	}
}
