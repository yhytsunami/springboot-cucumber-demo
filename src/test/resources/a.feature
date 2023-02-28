Feature: the greeting msg can be retrieved
  Scenario: client makes call to GET /greeting
    When the client calls /greeting
    Then the client receives answer contains <times>
    Examples:
        | times |
        | 1 |
        | 2 |
        | 3 |