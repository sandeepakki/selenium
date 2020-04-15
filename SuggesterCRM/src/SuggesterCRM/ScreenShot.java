package SuggesterCRM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
	public void testScreenshot() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://sandeepakkic2.sugester.com/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File f1=efw.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Screenshots/suggesterCRM.jpg");
		FileUtils.moveFile(f1,f2);
	}

}
