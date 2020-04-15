package Apploye;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class screenshot {
	@Test
	public void testscreenshot() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File f1=efw.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Screenshots/ApplHomePage.jpg");
		FileUtils.moveFile(f1, f2);
	}

}
