package gettitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class titlepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://lappy-sandy:81/login.do");
		String s=driver.getTitle();
		System.out.println(s);
	}

}
