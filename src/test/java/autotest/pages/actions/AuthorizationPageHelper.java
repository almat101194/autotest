package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.base.Page;
import autotest.core.business.User;
import autotest.pages.elements.AuthorizationPageElements;
import org.openqa.selenium.Keys;


/**
 * Класс наследуемый от абстрактного класса BasePage,
 * описывает действия над WebElement-ми страницы авторизации
 */
public class AuthorizationPageHelper extends BasePage {
    private final AuthorizationPageElements authorizationPageElements = new AuthorizationPageElements();
    public AuthorizationPageHelper(){
        super();
    }

    public CommonHelper toAuthorize(User user){
        waitForElementVisibility(authorizationPageElements.getInputLogIn());
        authorizationPageElements.getInputLogIn().sendKeys(user.getEmail()+ Keys.ENTER);
        sleep(1000);
        waitForElementVisibility(authorizationPageElements.getInputPassword());
        authorizationPageElements.getInputPassword().sendKeys(user.getPassword());
        sleep(1000);
        waitForElementVisibility(authorizationPageElements.getBtnLogIn());
        authorizationPageElements.getBtnLogIn().click();
        Page.logger.info("Log In button was clicked");
        return new CommonHelper();
    }
}
