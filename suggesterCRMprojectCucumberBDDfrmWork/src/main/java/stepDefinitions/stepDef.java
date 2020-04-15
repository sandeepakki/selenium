//package stepDefinitions;



//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



//public class stepDef {
	
	//public static WebDriver driver;

	//@Given("^user should goto login page$")
	//public void user_should_goto_login_page() {
		//String browser="chrome";
		//if(browser.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
			//driver=new FirefoxDriver();//up-casting fire-fox with WebDriver interface;
		//}
		//else if(browser.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
			//driver=new ChromeDriver();
		//}
		//driver.get("https://sandeepakkic2.sugester.com/login");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
			

     //}

    // @When("^retrieve title of page$")
    // public void retrieve_title_of_page() {
	   
    	// String title=driver.getTitle();
    	// System.out.println(title);
    	 
	
    //}

    // @Then("^enters \"(.*)\" and \"(.*)\"$")
//    public void enter_username_and_password(String username,String password) {
	
  //  	 driver.findElement(By.id("login")).sendKeys(username);
    //	 driver.findElement(By.id("password")).sendKeys(password);
  //  }

   //@Then("^click on login button$")
  // public void click_on_login_button() {
	
	//   driver.findElement(By.name("commit")).click();
	
   //}

    //@Then("^retrieve CRM dashboard page$")
    //public void retrieve_CRM_dashboard_page() {
	
    	//String title1=driver.getTitle();
    	//System.out.println(title1);
    	
	
  //}

    //@Then("^click on project New Project$")
    //public void click_on_project_New_Project(){
	
    	//driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();
    //	driver.findElement(By.xpath("//span[contains(text(),'New project')]")).click();
    	
    //}

     //@Then("^enter project details \"(.*)\"$")
   //  public void enter_project_details(String projectName) {
    	 
    //	 driver.findElement(By.id("project_name")).sendKeys(projectName);
   // 	 driver.findElement(By.id("project_any_in_team")).click();
    	 
    //}

   // @Then("^click on save project$")
   // public void click_on_save_project() {
    	
    //	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).click();
	
    //}

   // @And("^finally logout from CRM$")
    //public void finally_logout_from_CRM() {
	
    	//driver.findElement(By.xpath("//span[contains(text(),'sandeepakkic2@gmail.com')]")).click();
    	//driver.findElement(By.linkText("Log out")).click();
//    	driver.close();
	
  //  }

//}

