import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageObject<T> {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePageObject(WebDriver webDriver) {
        this.driver = webDriver;
        wait = new WebDriverWait(driver, 40);
    }

    @SuppressWarnings("unchecked")
    /**
     * открыть страницу по урлу
     */
    protected T getPage(String url) {
        driver.get(url);
        return (T) this;
    }

    /**
     * впечатать в инпут данные
     * @param text текст
     * @param element css, xpath
     */
    protected void type(String text, By element) {
        find(element).sendKeys(text);
    }

    /**
     * найти элемент
     * @param element элемент (xpath, css, etc)
     * @return element
     */
    private WebElement find(By element) {
        return driver.findElement(element);
    }

    /**
     * нажатие на что либо
     * @param element css, xpath
     */
    public void click(By element) {
        find(element).click();
    }

    /**
     * метод поиска и нажатия элемента в списке
     * @param element css, xpath
     */
    public void clickFirstItem(By element) {
        List<WebElement> indicatorsList = driver.findElements(element);
        indicatorsList.stream().findFirst().ifPresent(e -> e.click());
    }
}
