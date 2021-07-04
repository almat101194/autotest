package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.annotations.Test;

/**
 * Класс - Тест проверяющи функционал выхода из аккаунта после выполнения всех действий
 */

public class LogOut extends BaseTest {
    LogOut(){
        super();
    }

    @Test
    public void logOut(){
        commonHelper.toLogOut();
    }
}
