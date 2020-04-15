package Apploye;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClass {
	@Test
	public void testRobotClass() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(1000);
		WebElement w1=driver.findElement(By.xpath("//span[@style='text-transform: none;']"));
		Actions a1=new Actions(driver);
		a1.contextClick(w1).build().perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
	}

}
