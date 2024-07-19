package hu.masterfield.steps;

import hu.masterfield.pageobjects.HomePage;
import hu.masterfield.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class TescoSteps extends BaseTest {

    @Before
    public void setup() {
        super.setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
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
        homePage.acceptCookies();
    }

    @Given("the selected language is Hungarian")
    public void theSelectedLanguageIsHungarian() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");

    }


    @And("the English flag and text is visible")
    public void theEnglishFlagAndTextIsVisible() {
        homePage.checkEnglishFlag();
    }

    @When("I change the language to English")
    public void iChangeTheLanguageToEnglish() {
        homePage.changeLanguageToEng();
    }

    @Then("the page language changed to English")
    public void thePageLanguageChangedToEnglish() {
        homePage.checkLanguageChangedToEng();

    }

    @Given("the selected language is English")
    public void theSelectedLanguageIsEnglish() {
        driver.get("https://bevasarlas.tesco.hu/groceries/en-GB/");

    }

    @And("the Hungarian flag and text is visible")
    public void theHungarianFlagAndTextIsVisible() {
        homePage.checkHungarianFlag();

    }

    @When("I change the language to Hungarian")
    public void iChangeTheLanguageToHungarian() {
        homePage.changeLanguageToHun();
    }


    @Then("the page language changed to Hungarian")
    public void thePageLanguageChangedToHungarian() {
        homePage.checkLanguageChangedToHun();
    }


}
