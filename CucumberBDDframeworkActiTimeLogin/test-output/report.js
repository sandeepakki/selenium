$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sandeepkumarakki/eclipse-workspace/selnium/CucumberBDDframeworkActiTimeLogin/src/main/java/Features/tasks.feature");
formatter.feature({
  "line": 1,
  "name": "login into actiTime",
  "description": "",
  "id": "login-into-actitime",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#withTable using Maps"
    }
  ],
  "line": 5,
  "name": "login into actiTime test case",
  "description": "",
  "id": "login-into-actitime;login-into-actitime-test-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user present on actTime login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "title of login page is actiTime",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12
    },
    {
      "cells": [
        "admin",
        "manager"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will direct to actiTime HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on Add New Task",
  "rows": [
    {
      "cells": [
        "TaskName"
      ],
      "line": 20
    },
    {
      "cells": [
        "Task1"
      ],
      "line": 21
    },
    {
      "cells": [
        "Task2"
      ],
      "line": 22
    },
    {
      "cells": [
        "Task3"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "finally logout close browser",
  "keyword": "And "
});
formatter.match({
  "location": "taskswithMaps.user_present_on_actTime_login_page()"
});
formatter.result({
  "duration": 10581577199,
  "status": "passed"
});
formatter.match({
  "location": "taskswithMaps.title_of_login_page_is_actiTime()"
});
formatter.result({
  "duration": 9793400,
  "status": "passed"
});
formatter.match({
  "location": "taskswithMaps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 163785800,
  "status": "passed"
});
formatter.match({
  "location": "taskswithMaps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 857098301,
  "status": "passed"
});
formatter.match({
  "location": "taskswithMaps.user_will_direct_to_actiTime_HomePage()"
});
formatter.result({
  "duration": 6417300,
  "status": "passed"
});
formatter.match({
  "location": "taskswithMaps.user_clicks_on_Add_New_Task(DataTable)"
});
formatter.result({
  "duration": 6210136200,
  "status": "passed"
});
formatter.match({
  "location": "taskswithMaps.finally_logout_close_browser()"
});
formatter.result({
  "duration": 6165810800,
  "status": "passed"
});
});