Feature: Feature related to POST request

  @POSTStudent
  Scenario: POST one student
    Given create user with POST request "/student/create"
    Then user should be able to get this student