package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageElements extends CommonElements {

    @Getter
    @DescriptionOfElement("элемент хранешие себе табы - Posts, REELS, IGTV, TAGGED")
    @FindBy(xpath = "//div[@class=\"fx7hk\"]")
    private WebElement tabElm;

    @Getter
    @DescriptionOfElement("кнопка - Follow")
    @FindBy(xpath = "//div/span/span/button[text()=\"Follow\"]")
    private WebElement followBtn;

    @Getter
    @DescriptionOfElement("первый пост - POST")
    @FindBy(xpath = "//div[@class=\"Nnq7C weEfm\"][1]/div[1]/a")
    private WebElement post;

    @Getter
    @DescriptionOfElement("кнопка нарвится - Like Button")
    @FindBy(xpath = "//section/span/button[1]")
    private WebElement likeBtn;

    @Getter
    @DescriptionOfElement("кнопка - Next")
    @FindBy(xpath = "//a[text()=\"Next\"]")
    private WebElement nextBtn;
}
