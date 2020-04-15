package DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasks {

	@FindBy(linkText="Projects & Customers")           //--------------locate element address
	private WebElement projectsAndcustomerLink;        //--------------Store Element address
	
	public OpenTasks() {
		PageFactory.initElements(BaseClass.driver, this);          //browser control is given to current webpage under execution;
	}
	
	
	public void clickOnprojectAndcustomersLink(){
	
		projectsAndcustomerLink.click();
	}
	
}
