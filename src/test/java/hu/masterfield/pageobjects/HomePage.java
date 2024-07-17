package hu.masterfield.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class HomePage extends BasePage {
        WebDriver driver;


        @FindBy(xpath = "//button[@class='styled__StyledTextButton-sc-8hxn3m-0 jyQVJq ddsweb-cookies-notification__button ddsweb-button ddsweb-button--text-button']")
        WebElement cookieNotificationElement;
//        @FindBy(xpath = "//input[@id='search-input']")
//        WebElement searchInputElement;



        public HomePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }


        public void acceptCookies() {
            if (cookieNotificationElement.isDisplayed()) {
                cookieNotificationElement.click();
            }
        }

        public void isLoaded() {
        }



    }

