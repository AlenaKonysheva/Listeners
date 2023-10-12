package exeptions;

public class BrowserNotSupportedExceptions extends Exception{
    public BrowserNotSupportedExceptions(String browserName){
        super(String.format("Browser %s is not supported ",browserName));
    }
}
