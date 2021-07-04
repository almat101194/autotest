package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static autotest.core.base.BaseTest.instantiateDriver;

/**
 * Класс описывает общие WebElement-ы всех страниц Instagram
 */

public class CommonElements {

    public CommonElements(){
        PageFactory.initElements(instantiateDriver(), this);
    }

    @Getter
    @DescriptionOfElement("Save Your Login Info?")
    @FindBy(xpath = "//div[text()=\"Save Your Login Info?\"]")
    private WebElement saveLogIn;

    @Getter
    @DescriptionOfElement("Search")
    @FindBy(xpath = "//input[@type=\"text\" and @placeholder=\"Search\"]")
    private WebElement inputSearch;

    @Getter
    @DescriptionOfElement("рандомный акк - Random Account")
    @FindBy(xpath = "//a[@class=\"-qQT3\"]")
    private List<WebElement> linkAcc;

    @Getter
    @DescriptionOfElement("элемент - Profile")
    @FindBy(xpath = "//div[@class=\"Fifk5\"]/span")
    private WebElement elmProf;

    @Getter
    @DescriptionOfElement("линка - Log Out")
    @FindBy(xpath = "//div[text()=\"Log Out\"]")
    private WebElement linkLogOut;
}
