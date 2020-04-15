package actiTime;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Window_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String main = driver.getWindowHandle();
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
		Set<String> a1 = driver.getWindowHandles();
		for(String s:a1)
		{
			driver.switchTo().window(s);
			if(driver.getTitle().contains("Calendar"))
			{
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//span[text()='7']")).click();
				break;
			}
		}
		driver.switchTo().window(main);
		driver.findElement(By.className("logoutImg")).click();
	}

}
