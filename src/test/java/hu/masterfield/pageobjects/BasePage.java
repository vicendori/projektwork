package hu.masterfield.pageobjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait wait;

//    protected boolean isLoaded(WebElement element){
//        return wait.withTimeout(Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf());

    public boolean isLoaded(WebElement element) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (TimeoutException e) {
            fail(e);
            return false;
        }
    }

    protected WebDriver driverInPageObject;

    public BasePage(WebDriver inputDriver) {

        this.driverInPageObject = inputDriver;
    }

    public BasePage() {
    }
}