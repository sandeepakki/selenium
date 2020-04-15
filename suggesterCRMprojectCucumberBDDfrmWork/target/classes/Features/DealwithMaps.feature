Feature: creating deals in suggester CRM 


#with table using Maps
Scenario: test case for deal creation 

	Given user should goto login page 
	
	When retrieve title of page 
	
	Then enter username and password 
		|username|password|
		|sandeepakkic2@gmail.com|San@30041994|
		
	Then click on login button 
	
	Then retrieve CRM dashboard page 
	
	Then enter deal details and Save 
		|  Name | Value |
		|  Deal1| 30000 |
		|  Deal2| 40000|
		|  Deal3| 50000|
		
	And finally logout from CRM