Feature: US05
  Background: Ortak stepler
    Given The user logs in
    And User clicks Subscription Button


  Scenario: TC01-Display the subscriptions in subscription module

    Then User should see the subscription is displayed

  Scenario: TC02-Access the subscription information in Subscription Module

    And User clicks on GM3 Dev
    Then User should see Subscription Informations is displayed

  Scenario: TC03-Access the one information  in 'Subscription  Informations' (Subscription ID)

    And User clicks on GM3 Dev
    Then User should see the Subs ID is displayed in Subs Informations Page

  Scenario: TC04-Access the one information  in 'Subscription  Informations' (Subscription Type)

    And User clicks on GM3 Dev
    Then User should see the Subscription Type is Ali in Subscription Informations Page