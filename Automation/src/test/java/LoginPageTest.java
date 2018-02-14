import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn();
        // открывем модалку с логином
        loginPage.openModalWindow();
        // заполняем пароль и логин поля
        loginPage.fillUpLoginData("n.padrukhina@space307.com", "123123");
//        loginPage.clickReCapcha();
        // жмакаем кнопку вход
        loginPage.pushSignInButton();
        // ждем загрузки страницы платформы
        TradePage tradePage = new TradePage(driver);
        // открываем выпадйку с индикаторами
        tradePage.openIndicatorDropdown();
        // жмакаем первый индикатор (SMA)
        tradePage.pushSMAIndicator();
    }
}
