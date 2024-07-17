Feature: Using the search function in order to find a product.

  Rule: If I search for an existing product, it will be displayed in the search result page.

    Background:
      Given I open the homepage
      And I accept the cookies
      Then Click into the search field.

    Scenario Outline: Search for an existing product

      When I search for <Existing product>
      Then <Result amount> products are displayed
      And the product's name contains <Existing product>

      Examples:

        | Existing product | Result amount |
        | gyertya      | 18                     |
        | társasjáték  | 29                     |