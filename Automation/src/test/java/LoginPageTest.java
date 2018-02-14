import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn();
        loginPage.openModalWindow();
        loginPage.fillUpLoginData("n.padrukhina@space307.com", "123123");
//        loginPage.clickReCapcha();
        loginPage.pushSignInButton();
        TradePage tradePage = new TradePage(driver);
        tradePage.openIndicatorDropdown();
        tradePage.pushSMAIndicator();
    }
}
