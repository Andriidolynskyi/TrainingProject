Feature: GETing teacher feature

  @gettingTeacher
  Scenario: user trying to get one teacher
    Given user get the teacher "/teacher/21928"
    Then verify if the teacher have firstName and lastName