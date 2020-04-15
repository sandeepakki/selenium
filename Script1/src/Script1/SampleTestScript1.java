package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTestScript1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/sandeepkumarakki/Desktop/HTML%20Concepts/form.html");
		driver.manage().window().maximize();
		int n=1;
		for(int i=0;i<=n;i++)
		{
		driver.findElement(By.id("name")).sendKeys("akki sandeep kumar");
		Thread.sleep(1000);
		driver.findElement(By.id("passkey")).sendKeys("san@3004");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("sandeepakki03@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("tel1")).sendKeys("9502627001");
		Thread.sleep(1000);
		driver.findElement(By.className("male")).click();
		driver.findElement(By.name("ch2")).click();
		driver.findElement(By.id("action1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("action2")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		}
	}}
