package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.business.User;
import autotest.pages.elements.CommonElements;
import org.openqa.selenium.Keys;

public class CommonElementsHelper extends BasePage {
    private final CommonElements commonElements = new CommonElements();
    public CommonElementsHelper() {
        super();
    }

    public void clickLogIn(User user){
        waitForElementVisibility(commonElements.getLogInText());
        commonElements.getLogInText().sendKeys(user.getEmail()+ Keys.ENTER);
        sleep(2000);
        waitForElementVisibility(commonElements.getPasswordText());
        commonElements.getPasswordText().sendKeys(user.getPassword());
        sleep(1000);
        waitForElementVisibility(commonElements.getLogInBtn());
        commonElements.getLogInBtn().click();
    }

}
