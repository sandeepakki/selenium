////package stepDefinitions;
//
////import java.util.List;
////import java.util.concurrent.TimeUnit;
//
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.support.ui.Select;
//
////import cucumber.api.DataTable;
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
//
////public class dealsStepDef {
//
//	//public static WebDriver driver;
//
//	//@Given("^user should goto login page$")
//	//public void user_should_goto_login_page() {
//		//String browser = "chrome";
//	//	if (browser.equals("firefox")) {
//		//	System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
//	//		driver = new FirefoxDriver();// up-casting fire-fox with WebDriver interface;
////		} else if (browser.equals("chrome")) {
////			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
////			driver = new ChromeDriver();
////		}
////		driver.get("https://sandeepakkic2.sugester.com/login");
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.manage().window().maximize();
//
////	}
//
////	@When("^retrieve title of page$")
////	public void retrieve_title_of_page() {
//
//	//	String title = driver.getTitle();
////		System.out.println(title);
//
////	}
//
////	@Then("^enter username and password$")
////	public void enter_username_and_password(DataTable credentials) {
////		List<List<String>> data = credentials.raw();
////		driver.findElement(By.id("login")).sendKeys(data.get(0).get(0));
////		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
////	}
//
////	@Then("^click on login button$")
////	public void click_on_login_button() {
//
////		driver.findElement(By.name("commit")).click();
//
////	}
//
////	@Then("^retrieve CRM dashboard page$")
////	public void retrieve_CRM_dashboard_page() {
//
////		String title1 = driver.getTitle();
////		System.out.println(title1);
//
////	}
//
////	@Then("^click on CRM and select deals$")
////	public void click_on_CRM_and_select_deals() {
//
////		driver.findElement(By.xpath("//span[contains(text(),'CRM')]")).click();
////		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//
////	}
//
////	@Then("^click on New Deal$")
////	public void click_on_project_New_Deal() {
//
//		driver.findElement(By.xpath("//span[contains(text(),'New deal')]")).click();
//
//	}
//
//	@Then("^enter deal details$")
//	public void enter_deal_details(DataTable dealDetails) {
//		List<List<String>> deal = dealDetails.raw();
//		driver.findElement(By.id("deal_name")).sendKeys(deal.get(0).get(0));
//		WebElement w1 = driver.findElement(By.id("deal_status_id"));
//		Select s1 = new Select(w1);
//		s1.selectByVisibleText("Potential");
//		driver.findElement(By.id("deal_price")).sendKeys(deal.get(0).get(1));
//		driver.findElement(By.id("deal_description")).sendKeys(deal.get(0).get(2));
//
//	}
//
//	@Then("^click on save deal$")
//	public void click_on_save_deal() {
//
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//
//	}
//
//	@And("^finally logout from CRM$")
//	public void finally_logout_from_CRM() {
//
//		driver.findElement(By.xpath("//span[contains(text(),'sandeepakkic2@gmail.com')]")).click();
//		driver.findElement(By.linkText("Log out")).click();
//		driver.close();
//
//	}
//
//}
