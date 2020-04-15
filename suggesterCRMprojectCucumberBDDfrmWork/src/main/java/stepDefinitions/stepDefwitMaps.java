package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefwitMaps {
	
	public static WebDriver driver;

	@Given("^user should goto login page$")
	public void user_should_goto_login_page() {
		String browser="chrome";
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
			driver=new FirefoxDriver();//up-casting fire-fox with WebDriver interface;
		}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("https://sandeepakkic2.sugester.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			

     }

     @When("^retrieve title of page$")
     public void retrieve_title_of_page() {
	   
    	 String title=driver.getTitle();
    	 System.out.println(title);
    	 
	
    }

     @Then("^enter username and password$")
    public void enter_username_and_password(DataTable credentials) {
         for(Map<String, String> data :credentials.asMaps(String.class,String.class)) {
    	 driver.findElement(By.id("login")).sendKeys(data.get("username"));
    	 driver.findElement(By.id("password")).sendKeys(data.get("password"));
         }
    }

   @Then("^click on login button$")
   public void click_on_login_button() {
	
	   driver.findElement(By.name("commit")).click();
	
   }

    @Then("^retrieve CRM dashboard page$")
    public void retrieve_CRM_dashboard_page() {
	
    	String title1=driver.getTitle();
    	System.out.println(title1);
    	
	
  }
    @Then("^enter deal details and Save$")
     public void enter_deal_details(DataTable dealDetails) throws InterruptedException {
    	  for(Map<String, String> deal :dealDetails.asMaps(String.class,String.class)) {
    driver.findElement(By.xpath("//span[contains(text(),'CRM')]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'New deal')]")).click();
    driver.findElement(By.id("deal_name")).sendKeys(deal.get("Name")+Keys.ENTER);
    Thread.sleep(1000);	
	driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[7]/div[1]/a[1]/i[1]")).click();
    	  }	 
    }

    @And("^finally logout from CRM$")
    public void finally_logout_from_CRM() {
	
    	driver.findElement(By.xpath("//span[contains(text(),'sandeepakkic2@gmail.com')]")).click();
    	driver.findElement(By.linkText("Log out")).click();
    	driver.close();
	
    }
}
