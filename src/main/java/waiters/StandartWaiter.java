package waiters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StandartWaiter implements WaiterInterface {
    private WebDriver driver = null;

    public StandartWaiter(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean waitForCondition(ExpectedCondition expectedCondition) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, IMPLICITLY_WAIT_SECOND);
        try {
            webDriverWait.until(expectedCondition);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public boolean waitForElementsVisible(WebElement webElement) {
        return waitForCondition(ExpectedConditions.visibilityOf(webElement));
    }

    public boolean waitForElementInvisible(WebElement webElement) {
        return waitForCondition(ExpectedConditions.invisibilityOf(webElement));
    }

}
