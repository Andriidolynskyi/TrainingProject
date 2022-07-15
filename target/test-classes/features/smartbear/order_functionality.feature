Feature: All functionality related to making the order


  Scenario: Verification of the order functionality with valid credentials
    Given user should be able go to the website
    When user should be able to enter valid credential
    When the user on a main page should be able go to the orders functionality
    When user should be able fill all field to make the order
    Then Verify if the user did the order and able to see in a list on the main page

  @Smoke
  Scenario Outline: Verification of the order functionality with valid credentials
    Given user should be able go to the website
    When user should be able to enter valid credential
    When the user on a main page should be able go to the orders functionality
    When user should be able fill all field to make the order "<customerName>" "<street>" "<city>" "<state>" "<zipcode>" "<cardNumber>" "<expirationDate>"
    Then Verify if the user did the order and able to see in a list on the main page "<customerName>"
    Examples:
      | customerName      | street               | city          | state | zipcode | cardNumber           | expirationDate |
      | Cristiano Ronaldo | 2525 E Morison steet | Des Plaines   | IL    | 60024   | 1111222233334444     | 10/26          |
      | Leonel Messi      | 2525 E Thacker steet | Oklahoma city | OK    | 24523   | 55556666777788889999 | 03/23          |
      | Batista Cruze     | 789 E Vasia steet    | Dallas        | TX    | 75465   | 0987098709870987     | 09/29          |
