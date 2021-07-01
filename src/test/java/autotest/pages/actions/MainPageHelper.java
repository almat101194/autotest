package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.pages.elements.MainPageElements;

public class MainPageHelper extends BasePage {
    private final MainPageElements mainPageElements = new MainPageElements();
    public MainPageHelper(){
        super();
    }

    public void clickHomeIcon(){
        waitForElementVisibility(mainPageElements.getHomeIconBtn());
        mainPageElements.getHomeIconBtn().click();
    }
}
