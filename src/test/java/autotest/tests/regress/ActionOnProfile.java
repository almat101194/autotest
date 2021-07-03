package autotest.tests.regress;

import autotest.core.base.BaseTest;
import autotest.core.base.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionOnProfile extends BaseTest {
    ActionOnProfile(){
        super();
    }

    @Test
    public void following(){
        int x = pageProfHelper.toSendAmountPosts();
        if(x > 10){
            pageProfHelper.toClickFollow();
//            String text = pageProfHelper.getDivMessageText();
//            switch (text){
//                case "Message":
//                    Assert.assertEquals(text, "Message");
//                    break;
//                case "Following":
//                    Assert.assertEquals(text, "Following");
//                    break;
//            }
//            Assert.assertEquals(text, "Message");
        }
    }

    @Test
    public void clickPostAndLike(){
        pageProfHelper.toScroll();
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
