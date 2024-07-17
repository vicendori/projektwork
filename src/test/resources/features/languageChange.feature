Feature: Change the language of the page

  Rule: It is possible to change the language of the page between Hungarian and English

    Background:
      Given that the homepage is open
      And I accept all the cookies

    Scenario1:  Change the language to English
      Given the selected language is Hungarian
      And the English flag and text is visible
      When I click on the English flag
      Then the page language changed to English

    Scenario2:  Change the language to Hungarian
      Given the selected language is English
      And the Hungarian flag and text is visible
      When I click on the Hungarian flag
      Then the page language changed to Hungarian