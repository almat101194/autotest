package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionOnProfile extends BaseTest {
    ActionOnProfile(){
        super();
    }

    @Test
    public void following(){
        pageProfHelper.toClickFollow();
        String text = pageProfHelper.getDivMessageText();
        Assert.assertEquals(text, "Message");
    }

    @Test
    public void clickPostAndLike(){
        pageProfHelper.toScroll();
        pageProfHelper.toClickPost();
    }
}
