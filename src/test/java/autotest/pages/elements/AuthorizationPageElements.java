package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий WebElement - ы страницы авторизации, такие как:
 * Ввод логина (Phone number, username, or email)
 * Ввод пороля (Password)
 * Кнопка входа на страницу
 */
public class AuthorizationPageElements extends CommonElements {

    @Getter
    @DescriptionOfElement("поле ввода  - Phone number, username, or email")
    @FindBy(xpath = "//input[@aria-label=\"Phone number, username, or email\" and @name=\"username\"]")
    private WebElement inputLogIn;

    @Getter
    @DescriptionOfElement("поле ввода - Password")
    @FindBy(xpath = "//input[@aria-label=\"Password\" and @name=\"password\"]")
    private WebElement inputPassword;

    @Getter
    @DescriptionOfElement("кнопка - Log In")
    @FindBy(xpath = "//div[text()='Log In']")
    private WebElement btnLogIn;
}
