package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.annotations.Test;

public class ChoiceAccountSecond extends BaseTest {
    ChoiceAccountSecond(){
        super();
    }

    @Test
    public void checkValidAcc(){
        do{
            commonHelper.textInInputSearch();
            commonHelper.toChoiceandomAcc();
        }while (pageProfHelper.toSendAmountPosts() < 10);
    }
}
