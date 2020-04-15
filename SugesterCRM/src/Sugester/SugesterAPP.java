package Sugester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SugesterAPP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://sugester.com/crm");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Signup")).click();
		Thread.sleep(20000);
		driver.navigate().back();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
