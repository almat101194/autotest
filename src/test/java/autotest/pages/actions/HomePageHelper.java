package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.helper.Randomizer;
import autotest.pages.elements.HomePageElements;

public class HomePageHelper extends BasePage {
    private final HomePageElements homePageElements = new HomePageElements();
    public HomePageHelper(){
        super();
    }

    public void clickRandomAcc(){
        waitForElementVisibility(homePageElements.getRandomAcc().get(Randomizer.randInt(1, 30)));
        homePageElements.getRandomAcc().get(Randomizer.randInt(1, 30)).click();
    }


}
