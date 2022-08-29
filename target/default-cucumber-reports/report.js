$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/api/student/PUTstudent.feature");
formatter.feature({
  "name": "Scenarios related to UPDATE student",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "PUT one specific student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PUTstudent"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "GET and UPDATE student \"/student/33062\"",
  "keyword": "When "
});
formatter.match({
  "location": "PUTStudent_stepDefs.get_and_UPDATE_student(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if the student was updated \"/student/33062\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PUTStudent_stepDefs.check_if_the_student_was_updated(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});