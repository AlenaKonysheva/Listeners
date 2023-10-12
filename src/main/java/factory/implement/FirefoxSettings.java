package factory.implement;


import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxSettings implements IBrowserSettings {

    @Override
    public FirefoxOptions configurationDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--start-fullscreen");
        firefoxOptions.addArguments("--ignore-certificate-error");
        return firefoxOptions;
    }
}
