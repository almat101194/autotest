package autotest.tests.regress;

import autotest.core.base.BaseTest;
import autotest.core.base.Page;
import org.testng.annotations.Test;

/**
 * Класс - Тест проверяющи функционал подписки на страницу,
 * так же открывает пследние 10 постов и оценивает их.
 * Вторая итерация
 */

public class ActionOnProfileSecond extends BaseTest {
    ActionOnProfileSecond(){
        super();
    }

    @Test
    public void following(){
        pageProfHelper.toClickFollow();
    }

    @Test
    public void clickPostAndLike(){
        pageProfHelper.toClickPost();
        for(int i = 0; i < 10; i++) {
            pageProfHelper.toLike();
            Page.logger.info("Post " + (i+1) + " was liked!");
            if (i == 9) {
                continue;
            }
            pageProfHelper.toNext();
        }
        pageProfHelper.toClose();
    }
}
