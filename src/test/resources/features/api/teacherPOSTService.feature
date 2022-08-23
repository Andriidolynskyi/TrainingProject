Feature: Related to creating a teacher

  @e2e
  Scenario: Creating a teacher with positive scenario
    Given creating teacher in java object
    And hit POST methode "/teacher/create" to create a teacher
    Then verify if a teacher was created