package SuggesterCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RobotClass {

	public void testSuggesterCRM() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://sandeepakkic2.sugester.com/login");
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tickets")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("New task")).click();
		driver.findElement(By.id("task_modal_post_title")).sendKeys("Technical problem");
		driver.findElement(By.id("task_modal_post_content")).sendKeys("system is not working properly");
		WebElement w1=driver.findElement(By.xpath("//select[@data-user-changed='no']"));
		Select s=new Select(w1);
		s.selectByVisibleText("swathi mula");
		WebElement w2=driver.findElement(By.id("task_modal_post_status_id"));
		Select s1=new Select(w2);
		s1.selectByVisibleText("Accepted");
		WebElement w3=driver.findElement(By.id("task_modal_post_project_id"));
		Select s2=new Select(w3);
		s2.selectByVisibleText("She Safe");
		driver.findElement(By.id("task_modal_post_deadline")).click();
		driver.findElement(By.id("submit-task-modal")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accepted")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onclick='Firmlet.bulk_select();']")).click();
		driver.findElement(By.xpath("//a[@data-original-title='Delete']")).click();
		driver.switchTo().alert().accept();
		}

}
