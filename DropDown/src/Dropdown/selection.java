package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selection {

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
		WebElement w1=driver.findElement(By.name("customerProject.shownCustomer"));
		WebElement w2=driver.findElement(By.name("customerProject.shownProject"));
		Select s1=new Select(w1);
		Select s2=new Select(w2);
		s1.selectByVisibleText("sandeep");
		s2.selectByVisibleText("sugester");
		int i = s1.getOptions().size();
		System.out.println(i);
		List<WebElement> a = s1.getOptions();
		for(int i1=0;i1<a.size();i1++)
		{
			String s=a.get(i1).getText();
			System.out.println(s);
			}
		List<WebElement> a1 = s2.getOptions();
		for(int i2=0;i2<a1.size();i2++)
		{
			String s3=a1.get(i2).getText();
			System.out.println(s3);
		}
		boolean t = s1.isMultiple();
		boolean t1 = s2.isMultiple();
		if(t==true)
		{
			if(t1==true)
			{
				System.out.println("The options in dropdown is of multi select:");
			}
			else
			{
				System.out.println("The dropdown options are single select:");
			}
		}
		
		
		
		
		
		
		}
}
