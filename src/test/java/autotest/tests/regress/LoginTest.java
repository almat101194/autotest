package autotest.tests.regress;

import autotest.core.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginTest(){
        super();
    }

    @Test
    public void login() {
        commonElementsHelper
            .clickLogIn(getAddUserName());
    }

    @Test
    public void clickHomeIcon() {
        mainPageHelper
                .clickHomeIcon();
    }

    @Test
    public void clickAcc(){
        homePageHelper
                .clickRandomAcc();
    }

    @Test
    public void toClickFollow(){
        profilePageHelper.clickFollow();
    }

    @Test
    public void scrollElm(){
        profilePageHelper.toScroll();
    }

    @Test
    public void toClickPost() {
        profilePageHelper.clickPost();
    }

//    @Test
//    public void toClickLike(){
//        profilePageHelper.clickLike();
//    }
//
//    @Test
//    public void goNextPost(){
//        profilePageHelper.clickNextPost();
//    }

    @Test
    public void likeLastTenPost(){


        int i = 0;
        do{
            profilePageHelper.clickLike();
            profilePageHelper.clickNextPost();
            i++;
        }while (i < 10);
    }
}
