package autotest.core.base;

import org.openqa.selenium.WebElement;

import java.util.logging.Logger;

public interface Page {
    Logger logger = Logger.getLogger("logging");

    //webElement waiting methods
    void waitForElementToBeClickable(WebElement webElement);
    void waitForElementVisibility(WebElement webElement);
    void sleep(int millis);

    //webElement manipulation
    void scrollToWebElement();

    //webElement checking
    boolean checkIsElementEditable(WebElement webElement);
    void checkIsElementDisabled(WebElement webElement);
    void checkIsAttributeOfElementNotEmpty(String attribute, WebElement webElement);
    void checkIsTextOfElementNotEmpty(WebElement webElement);
}
