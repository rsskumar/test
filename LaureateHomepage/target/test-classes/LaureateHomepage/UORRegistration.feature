Feature: Check the UOR Registration

 Scenario: Launch UOR Home page
   Given I navigate to ChromeBrowser
   When I enter UOR URL
   Then UOR Home should be displayed
   
# Scenario: Verify Create account page is displayed
#   Given I navigate to create account
#   When I clicked on Create account button
#   Then UOR registration page should be displayed
