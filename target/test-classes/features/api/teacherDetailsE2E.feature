Feature: All testings related to End to End for UI vs API

  @e2e
  Scenario Outline: UI vs API cross data validation
    Given user get the teacher "<resource>"
    And user goes to cybertek training application
    Then user opens teacher profile details page "<teacherID>"
    And user cross validates teacher details on API and on UI

    Examples:
      | resource       | teacherID |
      | /teacher/21887 | 21887     |
      | /teacher/21888 | 21888     |