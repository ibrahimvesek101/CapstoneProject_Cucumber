Feature: US06
  Background: Ortak stepler
    Given The user logs inn
    And User clicks Company Button
    And User clicks the edit button

Scenario: TC01- Edit the registered company name in the Company module.(Change the name)

    And User changes company name with Her Company
    And User clicks save button
    Then User should see the company name is Her Company

  Scenario: TC02- Edit the registered company name in the Company module.(No name)

    And User deletes company name
    And User clicks save buttonn
    Then User should see the Please enter a name for company text.

  Scenario:  TC03- Edit the registered company name in the Company module.(Blank space)
    #Bug-->Fail#
    And User edits company name with blank space
    And User clicks save button
    Then Please enter a name for company text should have seen

  Scenario:  TC04- Edit email field in the Company module.(Email: hello)
    #Bug2-->Fail#
    And User edits company email with Hello
    And User clicks save button
    Then User should see an error about it is not a valid email

  Scenario: TC05- Edit the email field in the Company module.(Email : gulertuzuner@gmail.com)

    And User edits company email with gulertuzuner@gmail.com
    And User clicks save button
    Then User should see the this email address is displayed.

  Scenario: TC06-  Edit the name field and verify the error message disappears.
    #Bug3-->Fail#

    And User deletes company name
    And User clicks save button
    And User should see the Please enter a name for company text.
    And User clicks the cancel button
    Then User should see the old name appears.
    Then User should see the error message disappears.

  Scenario: TC07-  Edit the name field and verify name is changed on profile dropdown

    And User changes company name with Queen Company
    And User clicks the save button
    And User logs out
    And The user logs in again
    Then User should see the name is changed on profile dropdown








