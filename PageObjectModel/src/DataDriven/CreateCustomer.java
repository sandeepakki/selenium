package DataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass {           //execution class

	@Test  
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
	
		
		OpenTasks ot=new OpenTasks();
		ot.clickOnprojectAndcustomersLink();
		ActiveProjectsAndCustomers apac=new ActiveProjectsAndCustomers();
		apac.clickOnAddNewCustomer();
		AddNewCustomer anc=new AddNewCustomer();
		anc.enterCustomerName("Sandeep");
		anc.clickOncreateCustomer();
		String actRes = apac.retrieveSuccessMessage();
		System.out.println(actRes);
		
	}
}
