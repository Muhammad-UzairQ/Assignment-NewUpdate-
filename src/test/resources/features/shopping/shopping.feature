Feature: Shopping
  As a user I would like to Buy moisturizers or sunscreens

  Scenario Outline: User buy items
    Given user is on weather shopper page
    And user checks temperature
    When user navigates to items page
    When user selects items
    And click carts
    Then verify user is on checkout page
    And user verifies item details
    And user pays with card
    When user enters account credentials <parameters>
  #<email>, <card_number1>, <card_number2>, <card_number3>, <card_number4>, <Month>, <Year>, <cvc> and <postal_code>
    Then payment should be successful

    Examples:
    |parameters|
    |Uzair Account Credentials|
  #    |email|card_number1|card_number2|card_number3|card_number4|Month|Year|cvc|postal_code|
  #    |muhammaduzair111111@gmail.com|4000|0027|6000|3184|01|2025|123|496000|
  #    |muhammad.uzair@emumba.com|4000|0027|6000|3184|01|2028|133|476000|



