package DataDriven;

import org.testng.annotations.Test;

public class createProject extends BaseClass{

	@Test
	
	public void testcreateProject() {
		
		
		
		OpenTasks at=new OpenTasks();
		at.clickOnprojectAndcustomersLink();
		
		
		
		ActiveProjectsAndCustomers apac=new ActiveProjectsAndCustomers();
		apac.clickOnAddNewProjectButton();

		AddNewProject anp=new AddNewProject();
		anp.selectCustomerFromDropdownButton("Qspiders Chennai");
		anp.enterProjectName("Limpet Maindeka");
		anp.clickOncreateProjectButton();
		
		String s=apac.retrieveSuccessMessage();
		System.out.println(s);
	}	
}
