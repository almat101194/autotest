package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.pages.elements.ProfilePageElements;

import java.util.List;

public class ProfilePageHelper extends BasePage {
    private final ProfilePageElements profilePageElements = new ProfilePageElements();
    private List<String> posts_urls;
    public ProfilePageHelper() {
        super();
    }

    public void toScroll() {
        for(int i = 0; i < 2; i++){
            waitForElementVisibility(profilePageElements.getTabElm());
            scrollToWebElement();
            sleep(1000);
        }
    }

    public void clickFollow(){
//        waitForElementToBeClickable(profilePageElements.getFollowBtn());
//        waitForElementVisibility(profilePageElements.getFollowBtn());
//        sleep(3000);
        profilePageElements.getFollowBtn().click();
    }

    public void clickPost(){
        waitForElementVisibility(profilePageElements.getPost());
        sleep(4000);
        profilePageElements.getPost().click();
    }

    public void clickLike(){
//        waitForElementVisibility(profilePageElements.getLikeBtn());
//        sleep(4000);
        waitForElementToBeClickable(profilePageElements.getLikeBtn());
        profilePageElements.getLikeBtn().click();
        sleep(2000);
    }

    public void clickNextPost(){
        waitForElementVisibility(profilePageElements.getNextBtn());
        waitForElementToBeClickable(profilePageElements.getNextBtn());
        profilePageElements.getNextBtn().click();
    }

}
//https://www.instagram.com/explore/people/suggested/