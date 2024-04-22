Feature: Login to SauceDemo application

  @smoke
  Scenario Outline:  Check login to application is successful
    Given User is on login page
    When User enters a valid "<username>" and "<password>"
    And Click on submit button
    Then User is navigated to Home page
    And Close the browser



    Examples:
      | username  | password |
      | standard_user | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | performance_glitch_user | secret_sauce |

@smoke
  Scenario: Test1 from scenario1
    Given:
    When:
    Then:










