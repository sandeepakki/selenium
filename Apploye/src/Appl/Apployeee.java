package Appl;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apployeee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/register");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("first_name")).sendKeys("sandeep");
		driver.findElement(By.name("last_name")).sendKeys("akki");
		driver.findElement(By.name("email")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.name("username")).sendKeys("sandeep1994");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("San@30041994");
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.linkText("Back to Sign In")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.findElement(By.xpath("//button[@class='mb-3 btn btn-md btn-block login-button add-or-join-org-button btn btn-secondary']")).click();
		driver.findElement(By.id("organizationName")).sendKeys("Qspiders");
		driver.findElement(By.id("address")).sendKeys("Panjagutta");
		driver.findElement(By.xpath("//button[@class='custom-header-button btn-spec-hover btn btn-secondary']")).click();
		WebElement w2 = driver.findElement(By.xpath("//div[@class=' css-1wy0on6']"));
		Select s1=new Select(w2);
		s1.selectByVisibleText("E-Commerce");
		



	}

}
