package AppTests;

import Steps.LoginPageSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Managed()
    WebDriver browser;

   @Test
    public void appLoginTest() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
    }

}
