package Apploye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Automate {
	@Test
	public void testAutomate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/register");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("first_name")).sendKeys("sandeep");
		driver.findElement(By.name("last_name")).sendKeys("akki");
		driver.findElement(By.name("email")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.name("username")).sendKeys("sandeep1994");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("San@30041994");
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.linkText("Back to Sign In")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("organizationName")).sendKeys("Ramchendar Software Solutions Pvt Ltd.");
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("Hyderabad"+Keys.TAB+"Agency"+Keys.TAB+Keys.TAB+"(UTC+05:30) Asia/Kolkata"+Keys.TAB+Keys.TAB+"Monitored  - $6.00/User/Month"+Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='custom-header-button btn-spec-hover btn btn-secondary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		
	}}