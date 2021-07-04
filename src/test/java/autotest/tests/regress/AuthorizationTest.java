package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс - Тест проверяющи функционал авторизации и вход на гостевую страницу Инстаграмма
 */

public class AuthorizationTest extends BaseTest {
    AuthorizationTest(){
        super();
    }

    /**
     * Тест по авторизации для входа в личный аккаунт
     * возвращает значение для проверки валидности входа
     */
    @Test
    public void toAuthorization(){
       String saveLog =  authorizationPageHelper.toAuthorize(getAddUserName()).checkForInvalidAuthorize();
       Assert.assertEquals(saveLog, "Save Your Login Info?");
    }

}
