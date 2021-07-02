package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest {
    AuthorizationTest(){
        super();
    }

    @Test
    public void toAuthorization(){
       String saveLog =  authorizationPageHelper.toAuthorize(getAddUserName()).checkForInvalidAuthorize();
       Assert.assertEquals(saveLog, "Save Your Login Info?");
    }

}
