Feature: Scenarios related to GET request

  @
  Scenario: GET all student
    When user should be able to get all student "/student/all"
    Then print all student names and lastnames

  @GETStudent
  Scenario:  GET one student
    When  user should be able to get one specific user "/student/34165"
    Then print and verify all information about user