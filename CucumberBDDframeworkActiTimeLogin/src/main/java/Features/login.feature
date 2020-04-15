Feature: login into actiTime


#without examples keyword
#Scenario: login into actiTime test case

#Given user present on actTime login page

#When title of login page is actiTime

#Then user enters "admin" and "manager"

#Then user clicks on login button

#Then user will direct to actiTime HomePage



#with examples keyword
Scenario Outline: login into actiTime test case

Given user present on actTime login page

When title of login page is actiTime

Then user enters "<username>" and "<password>"

Then user clicks on login button

Then user will direct to actiTime HomePage

Examples:
        | username | password |
        | admin    | manager  |
        | sandy    | manager  |

