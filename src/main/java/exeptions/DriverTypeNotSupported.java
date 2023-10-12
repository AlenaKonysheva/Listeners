package exeptions;

public class DriverTypeNotSupported extends Exception{
    public DriverTypeNotSupported(String browserType) {
        super(String.format("Browser type %s is not supported ",browserType));
    }
}
