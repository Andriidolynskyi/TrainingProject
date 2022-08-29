Feature: Scenarios related to DELETE student

  @DELETEStudent
  Scenario: DELETE one specific student
    When user should be able to delete student "/student/delete/33061"
    Then checking if the student NOT exist "/student/33061"