Feature: Test Add Product functionality

  Background:
    Given Homepage should be opened

    Scenario: verify product quantity
      When user click on laptops categories
      And user click on product1
      And user click on add product1 to cart
      Then Product1 added alert "Product added" should be displayed
      When user accept first product alert
      And user click on add product1 again to cart
      Then Product1 added alert "Product added" should be displayed
      When user accept product1 alert and goes to cart page
      Then Product quantity should be 2


