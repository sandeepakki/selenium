package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taskswithMaps {
	
	WebDriver driver;

    @Given("^user present on actTime login page$")
  public void user_present_on_actTime_login_page() {
  	  
  			System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
  			driver=new FirefoxDriver();
  		driver.get("http://127.0.0.1:81/login.do");
  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	
  }
    
   @When("^title of login page is actiTime$")
    public void title_of_login_page_is_actiTime() {
  	 
  	String s= driver.getTitle();
  	 System.out.println(s);
  	 Assert.assertEquals("actiTIME - Login",s);
   }
    
 //  \"(.*)\"       regular exp
  // @Then("^user enters \"(.*)\" and \"(.*)\"$")
  // public void user_enters_username_and_password(String username,String password) {
  	 
  	// driver.findElement(By.name("username")).sendKeys(username);
  	// driver.findElement(By.name("pwd")).sendKeys(password);
  // }
   
   @Then("^user enters username and password$")
   public void user_enters_username_and_password(DataTable credentials) {
	   for(Map<String, String> data :credentials.asMaps(String.class,String.class))  {
  	 driver.findElement(By.name("username")).sendKeys(data.get("username"));
  	 driver.findElement(By.name("pwd")).sendKeys(data.get("password"));
   }
   }
   
   @Then("^user clicks on login button$")
   public void user_clicks_on_login_button() {
  	 
  	 driver.findElement(By.xpath("//input[@type='submit']")).click();
  	 
   }
   
   @Then("^user will direct to actiTime HomePage$")
   public void user_will_direct_to_actiTime_HomePage() throws InterruptedException {
  	 
  	 String title=driver.getTitle();
  	 System.out.println("Home page title:"+title);
  	 Assert.assertEquals("actiTIME - Open Tasks", title);
   }
   
  @Then("^user clicks on Add New Task$")
   public void user_clicks_on_Add_New_Task(DataTable tasks) {
	  
	  for(Map<String, String> Name :tasks.asMaps(String.class,String.class))  {
		  
		  driver.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		  
	  WebElement w1 = driver.findElement(By.name("customerId"));
	  Select s1=new Select(w1);
	  s1.selectByVisibleText("Qspider Noida");
	  
	  WebElement w2 = driver.findElement(By.name("projectId"));
	  Select s2=new Select(w2);
	  s2.selectByVisibleText("Apploye INC");
	  
	  driver.findElement(By.name("task[0].name")).sendKeys(Name.get("TaskName"));
	  driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
	  
		 String s3 = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		 System.out.println(s3);
	  }
	  
  }
   
   @And("^finally logout close browser$")
   public void finally_logout_close_browser() {
  	 driver.findElement(By.className("logoutImg")).click();
		driver.close();
   }
}
