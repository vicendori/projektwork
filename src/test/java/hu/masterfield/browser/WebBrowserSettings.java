package hu.masterfield.browser;

public class WebBrowserSettings {
    private static final String pathToGeckoDriver = "C:\\Users\\A200119538\\DT\\WebBrowsers\\FirefoxDriver\\126\\geckodriver.exe";
    private static final String pathToFirefox = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
    private static final String pathToChromeDriver = "C:\\Users\\A200119538\\DT\\WebBrowsers\\ChromeDriver\\126\\chromedriver.exe";
    private static final String pathToChrome = "C:\\Users\\A200119538\\DT\\WebBrowsers\\ChromeBin\\126\\chrome.exe";

    private static final String baseURL = "https://testautomation.masterfield.hu/SeleniumPractices/index.html";

    private static final String pathToScreenshots = "c:\\DT\\Screenshots\\";

    public static String getPathToGeckoDriver() {
        return pathToGeckoDriver;
    }

    public static String getPathToFirefox() {
        return pathToFirefox;
    }

    public static String getPathToChromeDriver() {
        return pathToChromeDriver;
    }

    public static String getPathToChrome() {
        return pathToChrome;
    }

    public static String getBaseURL() {
        return baseURL;
    }

    public static String getPathToScreenshots() {
        return pathToScreenshots;
    }
}
