package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.base.Page;
import autotest.pages.elements.PageProfElements;

/**
 * Класс описывает действия над WebElement-ми профиля аккаунта пользователя
 */
public class PageProfHelper extends BasePage {
    private final PageProfElements pageProfElements = new PageProfElements();
    public PageProfHelper(){
        super();
    }

    /**
     * Функция для нажатие кнопки Follow и подписки на пользователя
     */
    public void toClickFollow(){
        waitForElementToBeClickable(pageProfElements.getBtnFollow());
        sleep(2000);
        pageProfElements.getBtnFollow().click();
        Page.logger.info("Follow button was clicked!");
        sleep(1000);
    }

    /**
     * Получить количество постов на профиле аккаунта для определение валидности аккаунта для дальнейших действий
     */
    public int toSendAmountPosts(){
        String text = new Integer(pageProfElements.getElmArrPosts().size()).toString();
        Page.logger.info(text);
        return pageProfElements.getElmArrPosts().size();
    }

    /**
     * Открывает первый пост на профиле аккаунта
     */
    public void toClickPost(){
        waitForElementVisibility(pageProfElements.getElmPost());
        sleep(2000);
        pageProfElements.getElmPost().click();
        Page.logger.info("First post was clicked");
    }

    /**
     * Лайкает посты
     */
    public void toLike(){
        waitForElementToBeClickable(pageProfElements.getLinkIconLike());
        pageProfElements.getLinkIconLike().click();
        sleep(1000);
    }

    /**
     * Переход на следующии пост
     */
    public void toNext(){
        waitForElementVisibility(pageProfElements.getLinkIconNext());
        waitForElementToBeClickable(pageProfElements.getLinkIconNext());
        pageProfElements.getLinkIconNext().click();
    }

    /**
     * Закрывает пост
     */
    public void toClose(){
        waitForElementVisibility(pageProfElements.getLinkIconClose());
        waitForElementToBeClickable(pageProfElements.getLinkIconClose());
        pageProfElements.getLinkIconClose().click();
    }
}
