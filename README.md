# Demoblaze Automation

## Overview
This project automates test cases for the [Demoblaze website](https://demoblaze.com/) using Java, Selenium WebDriver, and the Page Object
Model (POM) design pattern. It validates key functionalities, including user signup, user login, product purchasing, and cart
operations, ensuring the system performs as expected.


## Test Scenarios


1.  User Signup

  * Ensure that the user can sign up successfully.
  * Ensure that a successful message is displayed "Sign up successful."


2. User Login
   
  * Ensure that the user can log in with an existing account.
  * Ensure that the user logged in successfully.


3. Purchase Products

 * Step 1: Go to the Laptops category.

   * Select a product to purchase.


 * Step 2: Add Products to Cart

   * Confirms products are successfully added to the cart.


 * Step 3: Cart Validation
  
   * Ensure that all products are displayed in the cart
   * Validate that the correct products are added with name and price.

  
 * Step 4: Place The Order

   * Validates the total amount is correct.
   * Completes the purchase with confirmation: "Thank you for your purchase!"


# Tools used in the Project

* Programming Language: Java
* Automation Framework: Selenium WebDriver
* Test Framework: Behavior-Driven Development (BDD)
* Tool: Cucumber
