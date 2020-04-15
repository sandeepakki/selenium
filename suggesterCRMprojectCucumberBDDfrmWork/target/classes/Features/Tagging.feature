@FunctionalTest 
Feature: All possible test scenarios of suggesterCRM 


@SmokeTest 
Scenario: Create Task 
Given  selnium clicks on tasks link 
When  clicks on New task 
Then  enters required fields 
Then  clicks on save 

@SmokeTest @RegressionTest 
Scenario: validate Tickets 
Given   Selnium clicks on Tickets link 
When  clicks on More 
Then  clicks on Deleted 
Then  take screenshot 

@RegressionTest 
Scenario: create clients 
Given  selenium clicks on CRM list and selects clients 
When  clicks on Ne client 
Then  New page with clients fields to be entered 
Then  clicks on save 

@RegressionTest @SanityTest 
Scenario: create Deal 
Given  selnum clicks on Deals in CRM list 
Then  clicks on New Deal 
Then  enters Deal details 
Then  save the deal 


@SanityTest @End2End 
Scenario: create contact and display 
Given  selnum clicks on Email campaigns list and selects contact list 
Then  clicks on New list 
Then   enters contact name and saves 
Then  Back to contact list and take screenshot 

@ExploratoryTest 
Scenario Outline: create project 
Given  click on project 
When  click on New project 
Then  enter project details "<Project Name>" 
Then  save the project 

Examples: 
|Project Name|
|Heriage|
|Reliance|