package hu.masterfield.pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driverInPageObject;

    public BasePage(WebDriver inputDriver) {

        this.driverInPageObject = inputDriver;
    }

    public BasePage() {
    }
}