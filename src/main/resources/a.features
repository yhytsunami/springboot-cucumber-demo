Feature: the greeting msg can be retrieved
  Scenario: client makes call to GET /greeting
    Given name is "User"
    When the client calls /greeting
    Then the client receives status code of 200
    And the client receives content "Hello, User!"