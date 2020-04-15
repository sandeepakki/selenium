package Windowhandle;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/sandeepkumarakki/Desktop/HTML%20Concepts/form.html");
		driver.manage().window().maximize();
		Dimension D=new Dimension(600,500);
		driver.manage().window().setSize(D);

	}
}
