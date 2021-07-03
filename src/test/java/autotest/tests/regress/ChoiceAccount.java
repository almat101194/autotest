package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChoiceAccount extends BaseTest {
    ChoiceAccount(){
        super();
    }

    @Test
    public void seekAndChoiceAcc(){
        commonHelper.textInInputSearch();
        commonHelper.toChoiceandomAcc();
        String text = pageProfHelper.getBtnFollowText();
        Assert.assertEquals(text, "Follow");
    }
}
