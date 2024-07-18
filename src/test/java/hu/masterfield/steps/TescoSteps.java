package hu.masterfield.steps;

import hu.masterfield.pageobjects.HomePage;
import hu.masterfield.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TescoSteps extends BaseTest {

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
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");

    }


    @And("the English flag and text is visible")
    public void theEnglishFlagAndTextIsVisible() {
        WebElement englishFlagElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
        if (englishFlagElement.isDisplayed()) {
            System.out.println("The English flag is visible.");
        }
    }

    @When("I change the language to English")
    public void iChangeTheLanguageToEnglish() {
            WebElement languageChangeElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
                if (driver.getCurrentUrl().contains("/groceries/hu-HU/")) {
                    languageChangeElement.click();
                }

    }

    private void clickOnHungarianFlag() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/nav[2]/div/div/div/ul/form")).click();
    }

    @Then("the page language changed to English")
    public void thePageLanguageChangedToEnglish() {

    }

    @Given("the selected language is English")
    public void theSelectedLanguageIsEnglish() {
        driver.get("https://bevasarlas.tesco.hu/groceries/en-GB/");

    }

    @And("the Hungarian flag and text is visible")
    public void theHungarianFlagAndTextIsVisible() {
        WebElement englishFlagElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
        if (englishFlagElement.isDisplayed()) {
            System.out.println("The Hungarian flag is visible.");
        }

    }

    @When("I change the language to Hungarian")
    public void iChangeTheLanguageToHungarian() {
            WebElement languageChangeElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
            if (driver.getCurrentUrl().contains("/groceries/en-GB/")) {
                languageChangeElement.click();
            }
        }

    private void clickOnEnglishFlag() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/nav[2]/div/div/div/ul/form")).click();
    }


    @Then("the page language changed to Hungarian")
    public void thePageLanguageChangedToHungarian() {
    }


}
