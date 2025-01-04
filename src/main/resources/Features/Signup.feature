Feature: Test Signup functionality

  Background:
    Given Homepage should be opened

  @Positive
  Scenario: verify user can signup successfully
    When user click on signup
    And User enter valid username and password
    And user click on signup button
    Then Successful alert "Sign up successful." should be displayed

  @Negative
  Scenario: validate user can't signup with invalid data
    When User enter invalid "MostafaGhobashy" and "WeMb21"
    And user click on signup button
    Then Error Signup alert "This user already exist." should be displayed