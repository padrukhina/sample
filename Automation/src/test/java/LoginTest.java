import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        Login login = new Login(driver);
        login.logIn();
        login.openModalWindow();
        login.fillUpLoginData("n.padrukhina@space307.com", "123123");
//        login.clickReCapcha();
        login.pushSignInButton();
    }
}
