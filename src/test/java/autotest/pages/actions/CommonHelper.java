package autotest.pages.actions;

import autotest.core.base.BasePage;
import autotest.core.base.Page;
import autotest.core.helper.Randomizer;
import autotest.pages.elements.CommonElements;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;

public class CommonHelper extends BasePage {
    private final CommonElements commonElements = new CommonElements();
    public CommonHelper(){
        super();
    }

    public String checkForInvalidAuthorize(){
        waitForElementVisibility(commonElements.getSaveLogIn());
        return commonElements.getSaveLogIn().getText();
    }


    public void textInInputSearch(){
       waitForElementVisibility(commonElements.getInputSearch());
       commonElements.getInputSearch().sendKeys(RandomStringUtils.randomAlphabetic(3)
               .toLowerCase() + Keys.ARROW_DOWN + Keys.ENTER);
        Page.logger.info("Random letters were texted");
        sleep(1000);
    }

    public void toChoiceandomAcc(){
        waitForElementVisibility(commonElements.getLinkAcc().get(Randomizer.randInt(1, commonElements.getLinkAcc().size()+1)));
        commonElements.getLinkAcc().get(Randomizer.randInt(1, commonElements.getLinkAcc().size()+1)).click();
        Page.logger.info("Random person was chosen");
    }

}
