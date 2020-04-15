package buttonText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettext {
	public static void main(String[] args) {
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
		driver.findElement(By.className("name")).sendKeys("sunny");
	String	s=driver.findElement(By.id("DiscardChangesButton")).getAttribute("value");
	System.out.println(s);
	String	s1=driver.findElement(By.id("RemainOnThePageButton")).getAttribute("value");
	System.out.println(s1);
	driver.findElement(By.id("DiscardChangesButton")).click();
	}
}