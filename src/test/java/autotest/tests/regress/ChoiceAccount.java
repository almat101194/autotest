package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс - Тест проверяющи функционал проверяющий правильность аккаунта на количество постов(не менее 10 штук)
 * в противном случае набирает занова рандомного пользователя до тех про пока условие не выполнится.
 * Первая итерация
 */

public class ChoiceAccount extends BaseTest {
    ChoiceAccount(){
        super();
    }

    /**
     * Проверяет количество постов на профиле аккаунта
     * В случае не валидности количество постов продолжает
     * Пойск аккаунта
     */
    @Test
    public void checkValidAcc() throws InterruptedException {
        commonHelper.textInInputSearch();
        commonHelper.toChoiceandomAcc();
        int num = pageProfHelper.toSendAmountPosts();
        while (!((num >= 10))){
            Thread.sleep(1000);
            commonHelper.textInInputSearch();
            commonHelper.toChoiceandomAcc();
            num = pageProfHelper.toSendAmountPosts();
        }
        String text = pageProfHelper.getPostsText();
        Assert.assertEquals(text, "POSTS");
    }
}
