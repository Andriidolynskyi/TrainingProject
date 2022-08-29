Feature: Scenarios related to UPDATE student

  @PUTstudent
  Scenario: PUT one specific student
    When GET and UPDATE student "/student/33062"
    Then Check if the student was updated "/student/33062"