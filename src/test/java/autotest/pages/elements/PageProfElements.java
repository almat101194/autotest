package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProfElements extends CommonElements {

//    @Getter
//    @DescriptionOfElement("элемент - Followers")
//    @FindBy(xpath = "//a[text()=\" followers\"]")
//    private WebElement elmFollowers;

    @Getter
    @DescriptionOfElement("тэг - Message")
    @FindBy(xpath = "//div[text()=\"Message\"]")
    private WebElement divMessage;

    @Getter
    @DescriptionOfElement("элемент хранешие себе табы - Posts, REELS, IGTV, TAGGED")
    @FindBy(xpath = "//div[@class=\"fx7hk\"]")
    private WebElement elmDiv;

    @Getter
    @DescriptionOfElement("кнопка - Follow")
    @FindBy(xpath = "//button[text()=\"Follow\"]")
    private WebElement btnFollow;

    @Getter
    @DescriptionOfElement("первый пост - POST")
    @FindBy(xpath = "//div[@class=\"Nnq7C weEfm\"][1]/div[1]/a")
    private WebElement elmPost;
}
////div/span/span/button[text()="Follow"]