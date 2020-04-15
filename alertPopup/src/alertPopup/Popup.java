package alertPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Selinium");
		driver.findElement(By.name("createCustomerSubmit")).click();
		String s2=driver.findElement(By.className("successmsg")).getText();
		System.out.println(s2);
		driver.findElement(By.linkText("Selinium")).click();
		driver.findElement(By.xpath("//input[@value='Archive This Customer']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Archives")).click();
		driver.findElement(By.linkText("Selinium")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		String s1=driver.findElement(By.className("successmsg")).getText();
		System.out.println(s1);
		}

}
