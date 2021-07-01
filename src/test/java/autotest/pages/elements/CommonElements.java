package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static autotest.core.base.BaseTest.instantiateDriver;

public class CommonElements {

    public CommonElements() {
        PageFactory.initElements(instantiateDriver(), this);
    }

    @Getter
    @DescriptionOfElement("логотип - Instagram")
    @FindBy(xpath = "//h1[text()='Instagram']")
    private WebElement logo;

    @Getter
    @DescriptionOfElement("поле ввода  - Phone number, username, or email")
    @FindBy(xpath = "//input[@aria-label=\"Phone number, username, or email\" and @name=\"username\"]")
    private WebElement logInText;

    @Getter
    @DescriptionOfElement("поле ввода - Password")
    @FindBy(xpath = "//input[@aria-label=\"Password\" and @name=\"password\"]")
    private WebElement passwordText;

    @Getter
    @DescriptionOfElement("линка - Sign In")
    @FindBy(xpath = "//a[@tabindex=\"0\"]/span[text()=\"Sign up\"]")
    private WebElement signInLink;

    @Getter
    @DescriptionOfElement("кнопка - Log In")
    @FindBy(xpath = "//div[text()='Log In']")
    private WebElement logInBtn;

}
