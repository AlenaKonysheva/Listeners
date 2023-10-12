package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbsBasePage <MainPage> {

    public MainPage(WebDriver driver) {
        super(driver,"/");

    }

    private final static String HEADER_POPULAR_COURSE = "//*[contains(text(),'Популярные курсы')]";
    private final static String MORE_POPULAR_COURSE = "//*[contains(@href,'https://otus.ru/catalog/courses')]/button";



    @FindBy(xpath = HEADER_POPULAR_COURSE)
    private WebElement elementHeaderPopularCourseButton;

    @FindBy(xpath = MORE_POPULAR_COURSE)
    private WebElement elementMorePopularCourseButton;



    public MainPage clickMorePopularCourse() {
        elementMorePopularCourseButton.click();
        return this;
    }
}
