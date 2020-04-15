package EmailAWS;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailKick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.emailkick.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("logoIcon")).click();
		driver.findElement(By.linkText("Mail API")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Register for free")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Signup for FREE")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sandeep Kumar Akki");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Terms and Condition")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		

	}

}
