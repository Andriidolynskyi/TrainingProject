Feature: Deleting teacher service

@test
  @teacherDelete
  Scenario: Positive teacher deleting
    Given user deletes teacher at "/teacher/delete/21885"
    And user verifies deleted teacher at "/teacher/21885"
    Then user verifies response message with "Teacher with id = 21885 NOT FOUND!"
