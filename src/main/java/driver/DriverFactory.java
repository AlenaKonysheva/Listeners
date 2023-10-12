package driver;

import driver.impl.ChromeWebDriver;
import driver.impl.FirefoxWebDriver;
import driver.impl.OperaWebDriver;
import exeptions.DriverTypeNotSupported;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Locale;

public class DriverFactory implements InterfaceDriverFactory {
    private String browserType = System.getProperty("browser").toLowerCase(Locale.ROOT);

    @Override
    public EventFiringWebDriver getDriver() {
        switch (this.browserType) {
            case "chrome": {
                return new EventFiringWebDriver(new ChromeWebDriver().getDriver());
            }
            case "firefox": {
                return new EventFiringWebDriver(new FirefoxWebDriver().getDriver());
            }
            case "opera": {
                return new EventFiringWebDriver(new OperaWebDriver().getDriver());
            }
            default:
                try {
                    throw new DriverTypeNotSupported(this.browserType);
                } catch (DriverTypeNotSupported ex) {
                    ex.printStackTrace();
                    return null;
                }
        }
    }
}
