package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggingStepDefFile {
	
	
	
	public static WebDriver driver;
	
	  @Before(order=0)
		public void Setup() {
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
		
		@Before(order=1)
		public void Login() {
			
			 driver.findElement(By.id("login")).sendKeys("sandeepakkic2@gmail.com");
	    	 driver.findElement(By.id("password")).sendKeys("San@30041994");
	    	 driver.findElement(By.name("commit")).click();
		}
		 
		@After(order=0)
		public void Logout() {
			driver.findElement(By.xpath("//span[contains(text(),'sandeepakkic2@gmail.com')]")).click();
	    	driver.findElement(By.linkText("Log out")).click();
	    	driver.close();
		}
		
	
	
	
	
		@Given("^selnium clicks on tasks link$")
	public void selnium_clicks_on_tasks_link() throws Throwable {
	   
	}

	@When("^clicks on New task$")
	public void clicks_on_New_task() throws Throwable {
	  
	}

	@Then("^enters required fields$")
	public void enters_required_fields() throws Throwable {
	   
	}

	@Then("^clicks on save$")
	public void clicks_on_save() throws Throwable {
	
	}

	@Given("^Selnium clicks on Tickets link$")
	public void selnium_clicks_on_Tickets_link() throws Throwable {
	 
	}

	@When("^clicks on More$")
	public void clicks_on_More() throws Throwable {
	   
	}

	@Then("^clicks on Deleted$")
	public void clicks_on_Deleted() throws Throwable {
	
	}

	@Then("^take screenshot$")
	public void take_screenshot() throws Throwable {
	 
	}

	@Given("^selenium clicks on CRM list and selects clients$")
	public void selenium_clicks_on_CRM_list_and_selects_clients() throws Throwable {
	
	}

	@When("^clicks on Ne client$")
	public void clicks_on_Ne_client() throws Throwable {
	  
	}

	@Then("^New page with clients fields to be entered$")
	public void new_page_with_clients_fields_to_be_entered() throws Throwable {
	    
	}

	@Given("^selnum clicks on Deals in CRM list$")
	public void selnum_clicks_on_Deals_in_CRM_list() throws Throwable {
	  
	}

	@Then("^clicks on New Deal$")
	public void clicks_on_New_Deal() throws Throwable {
	  
	}

	@Then("^enters Deal details$")
	public void enters_Deal_details() throws Throwable {
	 
	}

	@Then("^save the deal$")
	public void save_the_deal() throws Throwable {
	
	}

	@Given("^selnum clicks on Email campaigns list and selects contact list$")
	public void selnum_clicks_on_Email_campaigns_list_and_selects_contact_list() throws Throwable {

	}

	@Then("^clicks on New list$")
	public void clicks_on_New_list() throws Throwable {
	   
	}

	@Then("^enters contact name and saves$")
	public void enters_contact_name_and_saves() throws Throwable {
	  
	}

	@Then("^Back to contact list and take screenshot$")
	public void back_to_contact_list_and_take_screenshot() throws Throwable {
	
	}

	@Given("^click on project$")
	public void click_on_project() throws Throwable {
		
		driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();
	    
	  
	}

	@When("^click on New project$")
	public void click_on_New_project() throws Throwable {
	
		driver.findElement(By.xpath("//span[contains(text(),'New project')]")).click();
	}

	@Then("^enter project details \"(.*)\"$")
	public void enter_project_details(String projectName) {
		driver.findElement(By.id("project_name")).sendKeys(projectName);
	   driver.findElement(By.id("project_any_in_team")).click();
	}

	@Then("^save the project$")
	public void save_the_project() throws Throwable {
	  
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).click();
	}
}
