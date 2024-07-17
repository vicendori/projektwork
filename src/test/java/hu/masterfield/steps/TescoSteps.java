package hu.masterfield.steps;

import hu.masterfield.pageobjects.HomePage;
import hu.masterfield.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class TescoSteps extends BaseTest {

    private static final String ENGLISH_LANGUAGE = "English";
    private static final String HUNGARIAN_LANGUAGE = "Hungarian";
    private static final String LANGUAGE_ELEMENT_ENGLISH_TEXT = "Quick and convenient shopping";
    private static final String LANGUAGE_ELEMENT_HUNGARIAN_TEXT = "Gyors és kényelmes bevásárlás";


    @Before
    public void setup () {
        super.setup();
    }

    @After
    public void tearDown () {
        super.tearDown();
    }

    @Given("that the homepage is open")
    public void thatTheHomepageIsOpen() {
        driver.get(baseURL);
        homePage = new HomePage(driver);
        homePage.isLoaded();

    }

    @And("I accept all the cookies")
    public void iAcceptAllTheCookies() {
        driver.findElement(By.xpath("//button[@class='styled__StyledTextButton-sc-8hxn3m-0 jyQVJq ddsweb-cookies-notification__button ddsweb-button ddsweb-button--text-button']")).click();

    }

    @Given("the selected language is Hungarian")
    public void theSelectedLanguageIsHungarian() {

    }


    @And("the English flag and text is visible")
    public void theEnglishFlagAndTextIsVisible() {

    }

    @When("I change the language to English")
    public void iChangeTheLanguageToEnglish() {


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

    @When("I change the language to Hungarian")
    public void iChangeTheLanguageToHungarian() {
    }


    @Then("the page language changed to Hungarian")
    public void thePageLanguageChangedToHungarian() {
    }


}
