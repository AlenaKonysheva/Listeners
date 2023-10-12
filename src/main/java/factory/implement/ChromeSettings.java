package factory.implement;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSettings implements IBrowserSettings {
    @Override
    public ChromeOptions configurationDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-fullscreen");
        chromeOptions.addArguments("--ignore-certificate-error");
        return chromeOptions;
    }
}
