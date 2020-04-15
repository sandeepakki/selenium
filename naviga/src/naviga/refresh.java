package naviga;

import org.openqa.selenium.firefox.FirefoxDriver;

public class refresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://drivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://atom.io/");
		Thread.sleep(10000);
		driver.navigate().refresh();
	}

}
