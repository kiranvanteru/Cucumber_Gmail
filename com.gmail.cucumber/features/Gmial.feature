Feature: Gmail login Test

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When enter un valid "<username>"
    When enter pw valid "<password>"
    Then click on loginButton


    Examples: 
      | username         | password    |
      | sharanyareddy555 |  7842555424 |
      | kk23vanteru      | infoguyusad |
