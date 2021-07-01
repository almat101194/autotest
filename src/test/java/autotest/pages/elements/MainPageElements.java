package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageElements extends CommonElements {

    @Getter
    @DescriptionOfElement("Иконка дома - Home Icon")
    @FindBy(xpath = "//a[@href=\"/\"]/*[name()='svg']")
    private WebElement homeIconBtn;
}
