package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageElements extends CommonElements {

    @Getter
    @DescriptionOfElement("рандомный акк - Random Account")
    @FindBy(xpath = "//a[@class=\"FPmhX notranslate MBL3Z\"]")
    private List<WebElement> randomAcc;
}
