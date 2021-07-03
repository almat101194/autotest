package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.base.Page;
import autotest.pages.elements.PageProfElements;

public class PageProfHelper extends BasePage {
    private final PageProfElements pageProfElements = new PageProfElements();
    public PageProfHelper(){
        super();
    }

    public String getBtnFollowText(){
        waitForElementVisibility(pageProfElements.getBtnFollow());
        Page.logger.info("Follow test was taken!");
        return pageProfElements.getBtnFollow().getText();
    }

    public String getDivMessageText(){
        waitForElementVisibility(pageProfElements.getDivMessage());
        Page.logger.info("Message text was taken!");
        return pageProfElements.getDivMessage().getText();
    }

    public void toClickFollow(){
//        waitForElementToBeClickable(profilePageElements.getFollowBtn());
        waitForElementVisibility(pageProfElements.getBtnFollow());
        sleep(500);
        pageProfElements.getBtnFollow().click();
        Page.logger.info("Follow button was clicked!");
        sleep(1000);
    }

    public void toScroll() {
        for(int i = 0; i < 2; i++){
            waitForElementVisibility(pageProfElements.getElmDiv());
            scrollToWebElement();
            sleep(1000);
        }
        Page.logger.info("Posts were scrolled!");
    }

    public void toClickPost(){
        waitForElementVisibility(pageProfElements.getElmPost());
        sleep(2000);
        pageProfElements.getElmPost().click();
        Page.logger.info("First post was clicked");
    }
}
