package Apploye;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Activity {
	
	@Test
	public void testActivity() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		WebElement w1 = driver.findElement(By.xpath("//img[@src='/static/media/Activity.8ecb53c4.svg']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).click().build().perform();
		Thread.sleep(2000);
		WebElement w2 = driver.findElement(By.xpath("//a[@href='/user/activity/screenshots']"));
		a1.moveToElement(w2).click().build().perform();
	}

}
