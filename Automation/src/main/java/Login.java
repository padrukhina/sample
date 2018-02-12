import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePageObject<Login> {

    private static final String URL = "http://olimptrade.com/ru-ru/home";
    private By modalWindow = By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/div/a");
    private By emailField = By.xpath("//*[@id=\"auth\"]/div[2]/form/div[1]/input");
    private By emailField2 = By.cssSelector("#auth > div.form-content > form > div:nth-child(1) > input");
    private By passwordField = By.xpath("//*[@id=\"auth\"]/div[2]/form/div[2]/input");
    private By reCapcha = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]");
    private By reCapcha2 = By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark");
    private By signInButton = By.xpath("//*[@id=\"auth\"]/div[2]/form/div[5]/button");


    public Login(WebDriver webDriver) {
        super(webDriver);
    }

    public void logIn() {
        getPage(URL);
    }

    public void openModalWindow() {
        click(modalWindow);
    }

    public void fillUpLoginData(String email, String password) {
        type(email, emailField2);
        type(password, passwordField);
    }

    public void clickReCapcha() {
        click(reCapcha2);
    }

    public void pushSignInButton() {
        click(signInButton);
    }
}
