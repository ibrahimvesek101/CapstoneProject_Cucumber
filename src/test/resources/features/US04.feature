Feature:  US04 User profile editable
  Background:  Common steps for all scenarios
    Given User logs in

  Scenario: Changing password for an account

    And I click on the Change Password button
    And I click on the New password
    And I enter the new password
    And I click on the New password again
    And I enter the new password again
    And I click on the Confirm button
    Then I should see the Subscription displayed


  Scenario: Change password and verify subscription display

    And I click the Change Password button
    And I click the New password box
    And I enter the new invalid password
    And I click the New password box again
    And I enter the new invalid password again
    And I click the Confirm button
    Then I should see the error masage

  Scenario: Change password password and verify subscription display

    And I click click the Change Password button
    And I click click the New password box
    And I enter enter the new password
    And I click enter the New password box again
    And I enter enter the new password again
    And I click click the Confirm button
    Then I should should see the Subscription displayed

  Scenario: Change the password and verify subscription display

    And I click the the Change Password button
    And I click the the New password box
    And I enter the the new password
    And I click the the New password box again
    And I enter the the new password again
    And I click the the Confirm button
    Then I should see the the Subscription displayed

  Scenario: Changing Password and Verify Subscription Display

    And I am clicking the Change Password button
    And I am clicking the New password box
    And I am entering the new password
    And I am clicking the New password box again
    And I am entering the new password again
    And I am clicking the Confirm button
    Then I should see the Subscription displayedd


  Scenario: TC04_Changing password and verifying subscription

    And I click on the "Change Password" button
    And I click on the "New password" box
    And I enter the "new password"
    And I click on the "New password" box again
    And I enter the "new password" again
    And I click on the "Confirm" button
    Then I should see the "Warning Text" displayed

  Scenario: TC06_ Changing Password and Verifying Subscription

    And I click on the "Change Password" button
    And I click on the "New password" field
    And I enter a new password
    And I click on the "New password" field again
    And I re-enter the new password
    And I click on the "Confirm" button
    Then I should see that the "Warning Text" is displayed

  Scenario: TC07_Changing Password and Verifying Subscription

    And I click on the Change Password button
    And I click on the New password
    And I enter the new password
    And I click on the New password again
    And I enter the new password
    And I click on the Confirm button
    Then I should see the Subscription displayed




