$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/api/student/studentGETService.feature");
formatter.feature({
  "name": "Scenarios related to GET request",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "GET one student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GETStudent"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to get one specific user \"/student/34165\"",
  "keyword": "When "
});
formatter.match({
  "location": "GEToneStudent_stepDefs.user_should_be_able_to_get_one_specific_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print and verify all information about user",
  "keyword": "Then "
});
formatter.match({
  "location": "GEToneStudent_stepDefs.print_and_verify_all_information_about_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});