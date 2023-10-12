package factory.implement;

import org.openqa.selenium.opera.OperaOptions;

public class OperaSettings implements IBrowserSettings {

    public OperaOptions configurationDriver() {
        OperaOptions operaOptions=new OperaOptions();
        operaOptions.addArguments("--start-fullscreen");
        operaOptions.addArguments("--ignore-certificate-error");
        return operaOptions;
    }
}
