import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
