Feature: login into actiTime


#withTable using Maps
Scenario: login into actiTime test case

Given user present on actTime login page

When title of login page is actiTime

Then user enters username and password
|username|password|
|admin|manager|

Then user clicks on login button

Then user will direct to actiTime HomePage

Then user clicks on Add New Task
|TaskName|
|Task1|
|Task2|
|Task3|

And finally logout close browser

