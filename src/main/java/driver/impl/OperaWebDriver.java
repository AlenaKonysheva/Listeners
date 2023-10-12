package driver.impl;

import driver.InterfaceDriverFactory;
import exeptions.DriverTypeNotSupported;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.logging.Level;

public class OperaWebDriver implements InterfaceDriverFactory {

    @Override
    public WebDriver getDriver() {
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.addArguments("--no-sandbox");
        operaOptions.addArguments("--ignore-certificate-errors");
        operaOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        operaOptions.setCapability(CapabilityType.VERSION, System.getProperty("browser.version", "117.0"));
        operaOptions.setCapability(CapabilityType.BROWSER_NAME, System.getProperty("browser", "opera"));

        LoggingPreferences logPref = new LoggingPreferences();
        logPref.enable(LogType.PERFORMANCE, Level.INFO);
        operaOptions.setCapability(CapabilityType.LOGGING_PREFS, logPref);

//        if (getRemoutUrl() == null) {
//            try {
//                downloadLocalWebDriver(DriverManagerType.CHROME);
//            } catch (DriverTypeNotSupported ex) {
//                ex.printStackTrace();
//            }
//            return new ChromeDriver(operaOptions);
//        } else
            return new OperaDriver(operaOptions);
    }
}
