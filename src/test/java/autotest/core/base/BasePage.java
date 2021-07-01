package autotest.core.base;

import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.logging.Level;

public abstract class BasePage implements Page {
    @Getter
    private final static WebDriver webDriver = BaseTest.instantiateDriver();
    private WebDriverWait webDriverWait;

    protected Actions make;

    @Override
    public void waitForElementToBeClickable(WebElement webElement) {
        webDriverWait = new WebDriverWait(webDriver, 60);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    @Override
    public void waitForElementVisibility(WebElement webElement) {
        webDriverWait = new WebDriverWait(webDriver, 60);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    @Override
    public void sleep(int millis) {
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e) {
            logger.log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
    }

//    @Override
//    public void scrollToWebElement(WebElement webElement) {
//        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
//    }

    @Override
    public void scrollToWebElement() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Override
    public boolean checkIsElementEditable(WebElement webElement) {
        waitForElementVisibility(webElement);
        return webElement.isEnabled();
    }

    @Override
    public void checkIsElementDisabled(WebElement webElement) {
        waitForElementVisibility(webElement);
        if(webElement.isEnabled()) Assert.fail();
    }

    @Override
    public void checkIsAttributeOfElementNotEmpty(String attribute, WebElement webElement) {
        waitForElementVisibility(webElement);
        if(webElement.getAttribute("value").isEmpty()) Assert.fail();
    }

    @Override
    public void checkIsTextOfElementNotEmpty(WebElement webElement) {
        waitForElementVisibility(webElement);
        if(webElement.getText().isEmpty()) Assert.fail();
    }
}
