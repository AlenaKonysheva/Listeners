package driver.impl;

import driver.InterfaceDriverFactory;
import exeptions.DriverTypeNotSupported;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.logging.Level;

public class FirefoxWebDriver implements InterfaceDriverFactory {

    @Override
    public WebDriver getDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--no-sandbox");
        firefoxOptions.addArguments("--ignore-certificate-errors");
        firefoxOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        firefoxOptions.setCapability(CapabilityType.VERSION, System.getProperty("browser.version", "117.0"));
        firefoxOptions.setCapability(CapabilityType.BROWSER_NAME, System.getProperty("browser", "firefox"));

        LoggingPreferences logPref = new LoggingPreferences();
        logPref.enable(LogType.PERFORMANCE, Level.INFO);
        firefoxOptions.setCapability(CapabilityType.LOGGING_PREFS, logPref);

//        if (getRemoutUrl() == null) {
//            try {
//                downloadLocalWebDriver(DriverManagerType.CHROME);
//            } catch (DriverTypeNotSupported ex) {
//                ex.printStackTrace();
//            }
//            return new ChromeDriver(firefoxOptions);
//        } else
        return new FirefoxDriver(firefoxOptions);

    }
}
