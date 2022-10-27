package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin() {
       $("#email").sendKeys("abilash@gmail.com");
       $("#passwd").sendKeys("testing123");
       $("#SubmitLogin").click();
    }

    public String accountPageIsVisible() {

        return $("div#center_column h1") .getText();
    }
}
