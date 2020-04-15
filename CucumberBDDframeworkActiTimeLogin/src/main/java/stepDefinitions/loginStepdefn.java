//package stepDefinitions;
//
//
//import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class loginStepdefn {
//
//WebDriver driver;
//
//      @Given("^user present on actTime login page$")
//    public void user_present_on_actTime_login_page() {
//    	  
//    			System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
//    			driver=new FirefoxDriver();
//    		driver.get("http://127.0.0.1:81/login.do");
//    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    	
//    }
//      
//     @When("^title of login page is actiTime$")
//      public void title_of_login_page_is_actiTime() {
//    	 
//    	String s= driver.getTitle();
//    	 System.out.println(s);
//    	 Assert.assertEquals("actiTIME - Login",s);
//     }
//      
//   //  \"(.*)\"       regular exp
//    // @Then("^user enters \"(.*)\" and \"(.*)\"$")
//    // public void user_enters_username_and_password(String username,String password) {
//    	 
//    	// driver.findElement(By.name("username")).sendKeys(username);
//    	// driver.findElement(By.name("pwd")).sendKeys(password);
//    // }
//     
//     @Then("^user enters \"(.*)\" and \"(.*)\"$")
//     public void user_enters_username_and_password(String username,String password) {
//    	 
//    	 driver.findElement(By.name("username")).sendKeys(username);
//    	 driver.findElement(By.name("pwd")).sendKeys(password);
//     }
//     
//     @Then("^user clicks on login button$")
//     public void user_clicks_on_login_button() {
//    	 
//    	 driver.findElement(By.xpath("//input[@type='submit']")).click();
//    	 
//     }
//     
//     @Then("^user will direct to actiTime HomePage$")
//     public void user_will_direct_to_actiTime_HomePage() throws InterruptedException {
//    	 
//    	 String title=driver.getTitle();
//    	 System.out.println("Home page title:"+title);
//    	 Assert.assertEquals("actiTIME - Open Tasks", title);
//    	 Thread.sleep(1000);
//    	 driver.findElement(By.className("logoutImg")).click();
// 		driver.close();
//     }
//}
