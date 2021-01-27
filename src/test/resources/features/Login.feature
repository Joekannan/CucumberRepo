@Login
Feature: User Login on website
  I want to use this template for my feature file

  @Smoke
  Scenario: Successful Login
    Given I am on the Home Page
    When I enter my "shireenkamra@gmail.com" and "Shireen12"
    Then I should see the MyAccount page

  Scenario Outline: Successful Login
    Given I am on the Home Page
    When I enter my "<UserName>" and "<Password>"
    Then I should see the MyAccount page

    Examples: 
      | UserName                | Password  |
      | shireenkamra@gmail.com  | Shireen12 |
      | arijitlahiri5@gmail.com | Arijit12  |
