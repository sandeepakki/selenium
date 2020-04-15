package crnt_pg_url;

import org.openqa.selenium.firefox.FirefoxDriver;

public class currntpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://drivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String s=driver.getCurrentUrl();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		System.out.println(s);
		
	}

}
