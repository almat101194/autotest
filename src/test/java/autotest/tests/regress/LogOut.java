package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.annotations.Test;

public class LogOut extends BaseTest {
    LogOut(){
        super();
    }

    @Test
    public void logOut(){
        commonHelper.toLogOut();
    }
}
