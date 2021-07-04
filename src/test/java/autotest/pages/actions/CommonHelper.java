package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.base.Page;
import autotest.core.helper.Randomizer;
import autotest.pages.elements.CommonElements;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;

/**
 * Описываает действия всех WebElement-ов содержащий в каждой странице Инстаграмма
 */

public class CommonHelper extends BasePage {
    private final CommonElements commonElements = new CommonElements();
    public CommonHelper(){
        super();
    }

    /**
     * Возвращает значение "Save Your Login Info?" для проверки правильности авторизации
     */
    public String checkForInvalidAuthorize(){
        waitForElementVisibility(commonElements.getSaveLogIn());
        return commonElements.getSaveLogIn().getText();
    }

    /**
     * Набор в Search поискавике рандомного текста для нахождение рандомного пользователя
     */
    public void textInInputSearch(){
       waitForElementVisibility(commonElements.getInputSearch());
       commonElements.getInputSearch().sendKeys(RandomStringUtils.randomAlphabetic(1)+ Keys.ENTER);
       sleep(1000);
       commonElements.getInputSearch().clear();
        Page.logger.info("Random letters were texted");
        sleep(2000);
    }

    /**
     * Кликает на рандомного пользователя
     */
    public void toChoiceandomAcc(){
        Page.logger.info(new Integer(commonElements.getLinkAcc().size()).toString());
        sleep(1000);
        commonElements.getLinkAcc().get(1).click();
        sleep(2000);
        Page.logger.info("Random person was chosen");
    }

    /**
     * Выход из аккаунта
     */
    public void toLogOut(){
        sleep(2000);
        waitForElementVisibility(commonElements.getElmProf());
        commonElements.getElmProf().click();
        Page.logger.info("Profile icon was clicked!");
        sleep(1000);
        waitForElementVisibility(commonElements.getLinkLogOut());
        if(commonElements.getLinkLogOut().isDisplayed()){
            commonElements.getLinkLogOut().click();
            Page.logger.info("Log out was clicked!");
        }

    }

}
