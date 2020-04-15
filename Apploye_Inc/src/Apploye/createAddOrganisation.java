package Apploye;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class createAddOrganisation {
	


	@Test
	public void testcreateAddOrganisation() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://app.apploye.com/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username or email...']")).sendKeys("sandeep1994");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.findElement(By.xpath("//p[text()='Organizations']")).click();
Thread.sleep(1000);
        WebElement el = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
        el.click();
        
        //creating organization
        driver.findElement(By.id("organizationName")).sendKeys("Ram chendar software solutions ");
        driver.findElement(By.id("address")).sendKeys("Hyderabad"+Keys.TAB+"IT & Software"+Keys.ENTER+Keys.TAB+"(UTC+05:30) Asia/Kolkata"+Keys.ENTER+Keys.TAB+"Monitored  - $6.00/User/Month"+Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-spec-hover']")).click();
        String s=driver.findElement(By.xpath("//div[text()='Successfully created!']")).getText();
        System.out.println(s);
//deleting organization
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[contains(@class,'fa fa-trash editProject mr-2')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.CLEAR+"San@30041994");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        String s1=driver.findElement(By.xpath("//div[text()='Organization is being deleted. You will be notified via email.']")).getText();
        System.out.println(s1);
    //logout    
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='photo']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
        
}
}
