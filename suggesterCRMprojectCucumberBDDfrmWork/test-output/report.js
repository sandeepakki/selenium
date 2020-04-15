$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sandeepkumarakki/eclipse-workspace/selnium/suggesterCRMprojectCucumberBDDfrmWork/src/main/java/Features/Tagging.feature");
formatter.feature({
  "line": 2,
  "name": "All possible test scenarios of suggesterCRM",
  "description": "",
  "id": "all-possible-test-scenarios-of-suggestercrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 42,
  "name": "create project",
  "description": "",
  "id": "all-possible-test-scenarios-of-suggestercrm;create-project",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@ExploratoryTest"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "click on project",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "click on New project",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "enter project details \"\u003cProject Name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "save the project",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "all-possible-test-scenarios-of-suggestercrm;create-project;",
  "rows": [
    {
      "cells": [
        "Project Name"
      ],
      "line": 49,
      "id": "all-possible-test-scenarios-of-suggestercrm;create-project;;1"
    },
    {
      "cells": [
        "Heriage"
      ],
      "line": 50,
      "id": "all-possible-test-scenarios-of-suggestercrm;create-project;;2"
    },
    {
      "cells": [
        "Reliance"
      ],
      "line": 51,
      "id": "all-possible-test-scenarios-of-suggestercrm;create-project;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19652776900,
  "status": "passed"
});
formatter.before({
  "duration": 6278617100,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "create project",
  "description": "",
  "id": "all-possible-test-scenarios-of-suggestercrm;create-project;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@ExploratoryTest"
    },
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "click on project",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "click on New project",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "enter project details \"Heriage\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "save the project",
  "keyword": "Then "
});
formatter.match({
  "location": "taggingStepDefFile.click_on_project()"
});
formatter.result({
  "duration": 5086934800,
  "status": "passed"
});
formatter.match({
  "location": "taggingStepDefFile.click_on_New_project()"
});
formatter.result({
  "duration": 2948699300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Heriage",
      "offset": 23
    }
  ],
  "location": "taggingStepDefFile.enter_project_details(String)"
});
formatter.result({
  "duration": 672905500,
  "status": "passed"
});
formatter.match({
  "location": "taggingStepDefFile.save_the_project()"
});
formatter.result({
  "duration": 1749015400,
  "status": "passed"
});
formatter.after({
  "duration": 1513753400,
  "status": "passed"
});
formatter.before({
  "duration": 11638424300,
  "status": "passed"
});
formatter.before({
  "duration": 4011968200,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "create project",
  "description": "",
  "id": "all-possible-test-scenarios-of-suggestercrm;create-project;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@ExploratoryTest"
    },
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "click on project",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "click on New project",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "enter project details \"Reliance\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "save the project",
  "keyword": "Then "
});
formatter.match({
  "location": "taggingStepDefFile.click_on_project()"
});
formatter.result({
  "duration": 1371710700,
  "status": "passed"
});
formatter.match({
  "location": "taggingStepDefFile.click_on_New_project()"
});
formatter.result({
  "duration": 1879878100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reliance",
      "offset": 23
    }
  ],
  "location": "taggingStepDefFile.enter_project_details(String)"
});
formatter.result({
  "duration": 288946500,
  "status": "passed"
});
formatter.match({
  "location": "taggingStepDefFile.save_the_project()"
});
formatter.result({
  "duration": 1451082900,
  "status": "passed"
});
formatter.after({
  "duration": 5636960600,
  "status": "passed"
});
});