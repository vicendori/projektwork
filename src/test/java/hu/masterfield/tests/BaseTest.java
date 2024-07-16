package hu.masterfield.tests;

import hu.masterfield.browser.WebBrowser;
import hu.masterfield.browser.WebBrowserSettings;
import hu.masterfield.browser.WebBrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

    public class BaseTest {

        protected WebDriver driver;
        protected String baseURL;
        protected Actions builder;
        protected WebBrowserType webBrowserType;


        @BeforeEach
        public void setup() {
            webBrowserType = WebBrowserType.Chrome;
            driver = WebBrowser.createDriver(webBrowserType);
            driver.manage().window().setPosition(new Point(1500, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            baseURL = WebBrowserSettings.getBaseURL();
            builder = new Actions(driver);
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }

        protected void showWebElementInfos(String id, WebElement webElement) {
            System.out.println();
            System.out.println(id + "'s tagname: " + webElement.getTagName());
            System.out.println(id + "'s location: " + webElement.getLocation());
            System.out.println(id + "'s text: " + webElement.getText());
            System.out.println(id + " displayed: " + webElement.isDisplayed());
            System.out.println(id + " enabled: " + webElement.isEnabled());
            System.out.println(id + " selected: " + webElement.isEnabled());
        }

        protected boolean isElementPresent(By locator) {
            try {
                driver.findElement(locator);
                System.out.println("Element found.");
                return true;
            } catch (NoSuchElementException ex) {
                System.out.println("Element not found.");
                return false;
            }
        }

        protected WebElement myFindWebElement(By[] locators) throws InterruptedException{
            long timeout = 10_000;
            boolean isElementExist = false;
            long maxTime = System.currentTimeMillis() + timeout;
            WebElement resultWebElement = null;

            while ((System.currentTimeMillis() <= maxTime) && (!isElementExist)) {
                for (By locator : locators) {
                    try {
                        resultWebElement = driver.findElement(locator);
                        isElementExist = true;
                        break;
                    } catch (NoSuchElementException ex) {
                        System.out.println("Element not found");
                    }
                }
                Thread.sleep(500);
            }
            return resultWebElement;
        }
}
