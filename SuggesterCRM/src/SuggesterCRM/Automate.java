package SuggesterCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Automate {
	@Test
	public void testAutomate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://sugester.com/crm");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Signup")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[@title='sandeepakkic2@gmail.com']")).click();
		driver.findElement(By.linkText("Edit profile")).click();
		driver.findElement(By.id("user_nick")).sendKeys("sunny");
		WebElement w1=driver.findElement(By.xpath("//input[@value='Save']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).build().perform();
		
		
	}

}
