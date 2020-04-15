package SuggesterCRM;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class RobotClas {
	@Test
	public void testRobotClas() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","c://drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://sugester.com/crm");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://sandeepakkic2.sugester.com/login");
		driver.findElement(By.name("login")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("San@30041994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
	List<WebElement> list = driver.findElements(By.xpath("//span[contains(@class,'hidden-md hidden-sm inline-block')]"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("sandeepakkic2@gmail.com")) {
			list.get(i).click();
			break;
	}

}
	driver.findElement(By.linkText("Log out")).click();}}
