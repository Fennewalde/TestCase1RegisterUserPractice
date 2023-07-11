Feature: User Registration and Account Deletion
  User Story: As a user, I should be able to create an account, successfully login, and delete my account

  Scenario: Register User
    Given User is on the homepage
    And User can see homepage successfully
    Then User clicks on the Signuplogin button
    And User can see the New User Signup message
    When User enters "name" in the textfield and "email" in the email textfield
    When User clicks Signup Button
    Then User can see ENTER ACCOUNT INFORMATION
    When User selects their title by clicking radio button
    When User enters "password" in the password textfield
    When User enters a "July" "4" "1999" by using dropdown menus
    When User selects checkbox for the newsletter signup and special offers
    When User enters "first name" and "last name"
    When User enters company "name"
    When User enters "address" in address line
    When User enters "address" in second address line
    When User selects "country" from dropdown list
    When User enters "state", "city", and "zipcode"
    When User enters "phone number"
    When User clicks the Create Account Button
    Then User can see Account Created message
    When User clicks continue button
    Then User can see the Logged in as username message
    When User clicks the Delete Account Button
    Then User can see the Account Deleted message
    Then User clicks the Continue button


