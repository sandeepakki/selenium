package Apploye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Project_creation {
	@Test
	public void testProject_creation() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Organizations']")).click();
		Thread.sleep(1000);
		        WebElement el = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
		        el.click();
		        
		        //creating organization
		        driver.findElement(By.id("organizationName")).sendKeys("Ram chendar software solutions ");
		        driver.findElement(By.id("address")).sendKeys("Hyderabad"+Keys.TAB+"IT & Software"+Keys.ENTER+Keys.TAB+"(UTC+05:30) Asia/Kolkata"+Keys.ENTER+Keys.TAB+"Monitored  - $6.00/User/Month"+Keys.ENTER);
		        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-spec-hover']")).click();
		}}