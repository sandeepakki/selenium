package SuggesterCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class advXpath {
	@Test
	public void testavXpath() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://sandeepakkic2.sugester.com/login");
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Send e-mail")).click();
		driver.findElement(By.id("s2id_autogen1")).sendKeys("swa"+Keys.ENTER);
		driver.findElement(By.id("post_title")).sendKeys("Issue Resolved"+Keys.TAB+"Hi pls find the attachment");
		}

}
