import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class MainPageTest {
    private static WebDriver driver;
    private static MainPage mainPage;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://otus.ru/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void pressMorePopularCourseButton() throws InterruptedException {
        mainPage.clickMorePopularCourse();
        Thread.sleep(1000);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
