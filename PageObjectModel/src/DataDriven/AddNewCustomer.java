package DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	@FindBy(name="name")   //-------------locate element address
	
	private WebElement CustomerName;     //---------Store address

	
	@FindBy(name="createCustomerSubmit")  //-------------locate element address
	
	private WebElement createCustomerButton;    //---------Store address
	
	public AddNewCustomer() {
		
		PageFactory.initElements(BaseClass.driver, this);          //browser control is given to current webpage under execution;
	}
	
	public void enterCustomerName(String customername) {
		
		CustomerName.sendKeys(customername);
	}
	public void clickOncreateCustomer() {
		
		createCustomerButton.click();
	}
	
}
