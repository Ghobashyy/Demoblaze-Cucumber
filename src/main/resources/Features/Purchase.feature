Feature: Test Purchase functionality

  Background:
    Given Homepage should be opened

  @Positive
  Scenario: verify user can signup successfully
    When user click on signup
    And User enter valid username and password
    And user click on signup button
    Then Successful alert "Sign up successful." should be displayed

  @Positive
  Scenario: Verify that Two Products Are Purchased Successfully
    When user click on login
    And user enter valid "MostafaGhobashy" and "Ghobash11"
    And user click on login button
    Then user should be back to homepage and welcome user's name "Welcome MostafaGhobashy" should be displayed
    When user click on laptops categories
    And user click on product1
    And user click on add product1 to cart
    Then Product1 added alert "Product added" should be displayed
    When user accept product1 alert and goes to cart page
    Then product1 name "Sony vaio i5" and price "790" should be displayed
    Then user back to homepage
    When user click on laptops categories
    And user click on product2
    And user click on add product2 to cart
    Then Product2 added alert "Product added" should be displayed
    When user accept product2 alert and goes to cart page
    Then product2 name "Sony vaio i7" and price "790" should be displayed
    And total price should be "1580"
    When click on place order
    And enter "Mostafa Ghobashy" "Egypt" "Cairo" "41139874025698" "01" "2025"
    And click on Purchase
    Then successful purchase message "Thank you for your purchase!" should be displayed