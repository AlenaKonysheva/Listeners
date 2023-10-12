package waiters;

import org.openqa.selenium.support.ui.ExpectedCondition;

public interface WaiterInterface {
    long IMPLICITLY_WAIT_SECOND = Integer.parseInt(System.getProperty("webdriver.timeout.implicitlywait", "5000"));

    boolean waitForCondition(ExpectedCondition expectedCondition);
}
