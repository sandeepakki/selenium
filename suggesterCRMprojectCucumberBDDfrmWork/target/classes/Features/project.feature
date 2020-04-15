Feature: creating project in suggester CRM


#without examples keyword
 #Scenario: test case for project creation
 
 #Given user should goto login page
 
 #When retrieve title of page
 
 #Then enter username and password
 
 #Then click on login button
 
# Then retrieve CRM dashboard page
 
 #Then click on project New Project
 
#Then enter project details
 
 #Then click on save project
 
 #And finally logout from CRM


#with examples keyword
 Scenario Outline: test case for project creation
 
 Given user should goto login page
 
 When retrieve title of page
 
 Then  enters "<username>" and "<password>"
 
 Then click on login button
 
 Then retrieve CRM dashboard page
 
 Then click on project New Project
 
 Then enter project details "<Project Name>"
 
 Then click on save project
 
 And finally logout from CRM
 
 Examples:
 
 | username                | password     |Project Name|
 | sandeepakkic2@gmail.com | San@30041994 | heritage   |
 | sandeepakkic2@gmail.com | San@30041994 | Reliance   |
 
         
  