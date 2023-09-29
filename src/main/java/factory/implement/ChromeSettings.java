package factory.implement;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSettings implements IBrowserSettings{
    @Override
    public void configurationDriver(){
        ChromeOptions chromeOptions=new ChromeOptions();
    }
}
