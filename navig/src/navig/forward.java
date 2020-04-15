package navig;

import org.openqa.selenium.firefox.FirefoxDriver;

public class forward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://drivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().forward();
		driver.navigate().back();

	}

}
