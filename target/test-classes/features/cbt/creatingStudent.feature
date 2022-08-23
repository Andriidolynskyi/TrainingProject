Feature: All test related to create a students

  @cbt
  Scenario: Creating a student
    Given user should be able go to the website <cbt>
    When user on a main page should be see student module, click it drop down and click create student
    And user should fill out all field in application
    Then click submit and virify if user on a list

