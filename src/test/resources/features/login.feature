Feature: Login

  @validData
  Scenario:Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on the Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User quites browser

#    так делать нельзя в логине,для регистрации
  @invalidPassword
  Scenario Outline:Login with valid email,invalid password
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on the Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error is displayed
    And User quites browser
    Examples:
      | email               | password |
      | siyabtest@gmail.com | Sa12345  |
      | siyabtest@gmail.com | S112345! |
      | siyabtest@gmail.com | sa12345! |
      | siyabtest@gmail.com | Saqwert! |