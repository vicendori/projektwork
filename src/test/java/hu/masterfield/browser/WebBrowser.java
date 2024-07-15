package hu.masterfield.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import static hu.masterfield.browser.WebBrowserType.*;

public class WebBrowser {
    public static WebDriver createDriver(WebBrowserType type) {
        WebDriver driver = null;
        FirefoxOptions ffOptions = null;
        ChromeOptions chromeOptions = null;
        EdgeOptions edgeOptions = null;

        switch (type) {
            case Chrome:
                System.setProperty("webdriver.chrome.driver", WebBrowserSettings.getPathToChromeDriver());
                chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"
                        , "disable-logging"});
                chromeOptions.setBinary(WebBrowserSettings.getPathToChrome());
                chromeOptions.addArguments("--remote-allow-origins=*");
//                chromeOptions.addArguments("--incognito");
//                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case ChromeSM:
                chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"
                        , "disable-logging"});
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;
            case Firefox:
                System.setProperty("webdriver.gecko.driver", WebBrowserSettings.getPathToGeckoDriver());
                ffOptions = new FirefoxOptions();
                ffOptions.setBinary(WebBrowserSettings.getPathToFirefox());
                driver = new FirefoxDriver(ffOptions);
                break;
            case FirefoxSM:
                // Selenium Manager
                driver = new FirefoxDriver();
                break;
//            case SafariWDM:
//                // WebDriverManager
//                WebDriverManager.safaridriver().setup();
//                driver = new SafariDriver();
//                break;
//            case EdgeWDM:
//                // WebDriverManager
//                edgeOptions = new EdgeOptions();
//                edgeOptions.addArguments("--remote-allow-origins=*");
//                edgeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
////                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver(edgeOptions);
//                break;
            default:
                break;
        }
        Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
        String webBrowserName = capabilities.getBrowserName();
        String webBrowserVersion = capabilities.getBrowserVersion();
        System.out.printf("Browser is: " + webBrowserName + "  " + webBrowserVersion);
        return driver;
    }
}
