package autotest.tests.regress;

import autotest.core.base.BaseTest;
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
    public void checkValidAcc(){
        do{
            commonHelper.textInInputSearch();
            commonHelper.toChoiceandomAcc();
        }while (pageProfHelper.toSendAmountPosts() < 10);
    }
}
