package hu.masterfield.steps;

import hu.masterfield.pageobjects.HomePage;
import hu.masterfield.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ChangeLanguage extends BaseTest {
    @Given("that the homepage is open")
    public void thatTheHomepageIsOpen() {
        driver.get(baseURL);
        homePage = new HomePage(driver);
        homePage.isLoaded();
        
    }

    @And("I accept all the cookies")
    public void iAcceptAllTheCookies() {
        
    }

    @Given("the selected language is Hungarian")
    public void theSelectedLanguageIsHungarian() {
        
    }

    @And("the English flag and text is visible")
    public void theEnglishFlagAndTextIsVisible() {
        
    }

    @When("I click on the English flag")
    public void iClickOnTheEnglishFlag() {
        
    }

    @Then("the page language changed to English")
    public void thePageLanguageChangedToEnglish() {
        
    }

    @Given("the selected language is English")
    public void theSelectedLanguageIsEnglish() {
        
    }

    @And("the Hungarian flag and text is visible")
    public void theHungarianFlagAndTextIsVisible() {
        
    }

    @When("I click on the Hungarian flag")
    public void iClickOnTheHungarianFlag() {
        
    }

    @Then("the page language changed to Hungarian")
    public void thePageLanguageChangedToHungarian() {
    }
}
