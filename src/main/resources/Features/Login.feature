Feature: Test Login functionality

Background:
  Given Homepage should be opened

  @Positive
  Scenario: verify user can login successfully
    When user click on login
    And user enter valid "MostafaGhobashy" and "Ghobash11"
    And user click on login button
    Then user should be back to homepage and welcome user's name "Welcome MostafaGhobashy" should be displayed

  @Negative
  Scenario Outline: validate user can't login with invalid data
    When user click on login
    And user enter invalid "<username>" and "<password>"
    And user click on login button
    Then Login alert "<message>" should be displayed
    Examples:
      | username        | password    | message              |
      | MostafaGhobashy | M1we32s     | Wrong password.      |
      | Med21Hit0       | MonsterX220 | User does not exist. |