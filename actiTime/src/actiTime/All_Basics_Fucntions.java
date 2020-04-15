package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Basics_Fucntions {

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
		String s=driver.findElement(By.className("successmsg")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
	String s1=driver.switchTo().alert().getText();
	System.out.println(s1);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();	
	driver.findElement(By.className("logoutImg")).click();
	driver.close();
	}

}
