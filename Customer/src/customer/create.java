package customer;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class create {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	driver.findElement(By.name("name")).sendKeys("Sandeep kumarss Akki");
	driver.findElement(By.name("description")).sendKeys("Hello Selenium");
	driver.findElement(By.xpath("//input[@value='Create Customer']")).click();
	String s=driver.findElement(By.className("successmsg")).getText();
	driver.findElement(By.className("logoutImg")).click();
	driver.close();
	System.out.println(s);
	

	
	}

}
