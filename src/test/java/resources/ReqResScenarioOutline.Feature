Feature: API Scenario outline Testing for Practice
  As an api tester
  I want to test get and post methods
  so that I can see desired multiple results
  Background:
  Given User is on reqres\.in
  Scenario Outline:
    When user type "<endpoints>"
    Then User should be able to see "<response codes>".
    Examples:
      |endpoints|response codes|
      |https://reqres.in/api/users?page=2|200|
      |https://reqres.in/api/users/2|200|
      | https://reqres.in/api/users/23|404|
      |https://reqres.in/api/unknown|200|
      |https://reqres.in/api/unknown/2|200|
      |https://reqres.in/api/unknown/23|404|
      |https://reqres.in/api/users?delay=3|200|

