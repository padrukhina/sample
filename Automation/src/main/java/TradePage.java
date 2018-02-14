import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradePage extends BasePageObject<TradePage> {

    private By indicators = By.xpath("//*[@id=\"graphs\"]/div/div/div[1]/div/div[3]/div/div[1]/div/span/span");
    private By cssBtnSMAIndicator = By.cssSelector("#graphs > div > div > div.graph-settings > div > div.indicators.indicators-menu > div > div.drop-down-plain-content > div > ul > li:nth-child(1) > span > button");


    public TradePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openIndicatorDropdown() {
        click(indicators);
    }

    public void pushSMAIndicator() {
        click(cssBtnSMAIndicator);
    }
 }
