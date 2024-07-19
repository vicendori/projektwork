package hu.masterfield.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BasePage {
    WebDriver driver;


    @FindBy(xpath = "//button[@class='styled__StyledTextButton-sc-8hxn3m-0 jyQVJq ddsweb-cookies-notification__button ddsweb-button ddsweb-button--text-button']")
    WebElement cookieNotificationElement;
    @FindBy(xpath = "//button[@id='utility-header-language-switch-link']")
    WebElement switchLanguageElement;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void acceptCookies() {
        driver.findElement(By.xpath("//button[@class='styled__StyledTextButton-sc-8hxn3m-0 jyQVJq ddsweb-cookies-notification__button ddsweb-button ddsweb-button--text-button']")).click();

    }

    public void isLoaded() {
    }

    public void checkEnglishFlag() {
        WebElement englishFlagElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
        if (englishFlagElement.isDisplayed()) {
            System.out.println("The English flag is visible.");
        }
    }

    public void changeLanguageToEng() {
        WebElement languageChangeElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
        if (driver.getCurrentUrl().contains("/groceries/hu-HU/")) {
            languageChangeElement.click();
        }

    }

    public void checkLanguageChangedToEng() {
        if (driver.getCurrentUrl().equals("https://bevasarlas.tesco.hu/groceries/en-GB/")) ;
        {
            System.out.println("Language changed to English.");
        }

    }

    public void checkHungarianFlag() {
        WebElement englishFlagElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
        if (englishFlagElement.isDisplayed()) {
            System.out.println("The Hungarian flag is visible.");
        }
    }

    public void changeLanguageToHun() {
        WebElement languageChangeElement = driver.findElement(By.xpath("//button[@id='utility-header-language-switch-link']"));
        if (driver.getCurrentUrl().contains("/groceries/en-GB/")) {
            languageChangeElement.click();
        }
    }

    public void checkLanguageChangedToHun() {
        if (driver.getCurrentUrl().equals("https://bevasarlas.tesco.hu/groceries/hu-HU/")) ;
        {
            System.out.println("Language changed to Hungarian.");
        }

    }
}

