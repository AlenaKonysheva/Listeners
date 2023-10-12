package factory;

import exeptions.BrowserNotSupportedExceptions;
import factory.implement.ChromeSettings;
import factory.implement.IBrowserSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FactoryWebDriver {
    private String browserName = System.getProperty("browser", "chrome ");

    public WebDriver create() {


        switch (browserName) {
            case "chrome": {
                IBrowserSettings chromeOptions = new ChromeSettings();
                return new ChromeDriver(chromeOptions.configurationDriver());
            }
            case "firefox":{

            }
            case "opera":{

            }
            default:
                try {
                    throw new BrowserNotSupportedExceptions(this.browserName);
                } catch (BrowserNotSupportedExceptions ex) {
                    ex.printStackTrace();
                    return null;
                }
        }
    }
}
