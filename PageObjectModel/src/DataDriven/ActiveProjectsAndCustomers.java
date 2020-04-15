package DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomers {
	
	@FindBy(xpath="//input[@value='Add New Customer']")    //-------------locate element address
	private WebElement  AddNewCustomerButton;              //-------------store element address
	
	@FindBy(className="successmsg")        //   -------------locate element address
	private WebElement SuccessMessage;      //-------------store element address
	
	@FindBy(xpath="//input[@value='Add New Project']") 
	private WebElement AddNewProjectButton;
	
	public ActiveProjectsAndCustomers(){
		PageFactory.initElements(BaseClass.driver, this);   //constructor:browser control is given to current webpage under execution;
	}
	
	
	public void clickOnAddNewCustomer()
	{
		AddNewCustomerButton.click();
	}
	public String retrieveSuccessMessage() {
		String s=SuccessMessage.getText();
		return s;
	}
	
	public void clickOnAddNewProjectButton() {
		
		AddNewProjectButton.click();
		
	}
}
