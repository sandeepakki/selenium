Feature: creating deals in suggester CRM


#with table
 Scenario: test case for deal creation
 
 Given user should goto login page
 
 When retrieve title of page
 
 Then enter username and password
 |sandeepakkic2@gmail.com|San@30041994|
 
 Then click on login button
 
 Then retrieve CRM dashboard page
 
 Then click on CRM and select deals
 
 Then click on New Deal
 
Then enter deal details
|Deal|300000|Won the deal|
 
 Then click on save deal
 
 And finally logout from CRM