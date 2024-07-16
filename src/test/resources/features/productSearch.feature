Feature: Using the search function in order to find a product.

  Rule: If I search for an existing product, it will be displayed in the search result page.

#    Background:
#      Given I open the homepage
#      And I accept the cookies
#      Then Click into the search field.

    Scenario: Search for an existing product - gyertya
      Given I open the homepage
      And I accept the cookies
      Then Click into the search field.
      When I search for "gyertya"
      Then 18 products are displayed
      And the product's name contains "gyertya"


    Scenario: Search for an existing product - társasjáték
      Given I open the homepage
      And I accept the cookies
      And Click into the search field.
      When I search for "társasjáték"
      Then 29 products are displayed
      And the product's name contains "társasjáték"

  # Alternative solution with scenario outline and example
#    Scenario Outline: Search for an existing product
#      When I search for <existing product>
#      Then <Positive result amount> products are displayed
#      And the product's name contains <existing product>
#
#      Examples:
#
#        | Product name | Positive result amount |
#        | gyertya      | 18                     |
#        | társasjáték  | 29                     |

  Rule: If I search for a non-existing product, it will be displayed in the search result page.

#    Background:
#      Given I open the homepage
#      And I accept the cookies
#      Then Click into the search field.


    Scenario: Search for a non-existing product - polip
      Given I open the homepage
      And I accept the cookies
      Then Click into the search field.
      When I search for "polip"
      Then No product is displayed
      And "Sajnos nem található olyan termék, amely a “polip” keresési feltételnek megfelelne. Kérjük, ellenőrizd le, hogy jól írtad-e be a keresett szót, vagy próbálj általánosabb keresési kifejezéseket!"message is displayed

  Rule: If I enter only one letter into the search field, all the products contains that letter separately will be displayed in the search result page.

#    Background:
#      Given I open the homepage
#      And I accept the cookies
#      Then Click into the search field.

    Scenario: Search for a product - k
      Given I open the homepage
      And I accept the cookies
      Then Click into the search field.
      When I search for "k"
      Then 7 products are displayed
      And the product's names contain the letter k separately