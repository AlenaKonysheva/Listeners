package driver.impl;

import driver.InterfaceDriverFactory;
import exeptions.DriverTypeNotSupported;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.logging.Level;

public class ChromeWebDriver implements InterfaceDriverFactory {



    @Override
    public WebDriver getDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(CapabilityType.VERSION, System.getProperty("browser.version", "117.0"));
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME, System.getProperty("browser", "chrome"));

        LoggingPreferences logPref = new LoggingPreferences();
        logPref.enable(LogType.PERFORMANCE, Level.INFO);
        chromeOptions.setCapability(CapabilityType.LOGGING_PREFS, logPref);

//        if (getRemoutUrl() == null) {
//            try {
//                downloadLocalebDriver(DriverManagerType.CHROME);
//            } catch (DriverTypeNotSupported ex) {
//                ex.printStackTrace();
//            }
//            return new ChromeDriver(chromeOptions);
//        } else
            return  new ChromeDriver(chromeOptions);

    }
}
 