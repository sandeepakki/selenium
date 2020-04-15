package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sandeepkumarakki/Desktop/My%20%20Projects/Frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("sandeep");
		driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("akki");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("sandeepakki03@gmail.com");
	WebElement w1 = driver.findElement(By.xpath("//iframe[@src='child.html']"));
		driver.switchTo().frame(w1);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='reset']")).click();
		
	}

}
