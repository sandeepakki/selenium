package DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProject {
	
	@FindBy(name="customerId")
	private WebElement CustomerDropdownButton;
	
	@FindBy(name="name")
	private WebElement ProjectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	
	
	
	
	public AddNewProject() {
		
		PageFactory.initElements(BaseClass.driver,this);
		
		
	}
	
	public void selectCustomerFromDropdownButton(String customerName) {
		
		Select s1=new Select(CustomerDropdownButton);
		s1.selectByVisibleText(customerName);
	}
	
	public void enterProjectName(String projectname){
		
		ProjectNameTextField.sendKeys(projectname);
	}
	
	public void clickOncreateProjectButton() {
		
		createProjectButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
