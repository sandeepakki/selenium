package HandlingBulk;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bulk_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sandeepkumarakki/Desktop/My%20%20Projects/MultiField.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String s[]= {"Ram","Laxman","Bharat","shetragn"};
		List<WebElement> l1 = driver.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<l1.size();i++)
		{
				l1.get(i).sendKeys(s[i]);
				}
		driver.findElement(By.className("male")).click();
		}
	}

