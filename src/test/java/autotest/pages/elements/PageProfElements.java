package autotest.pages.elements;

import autotest.core.annotations.DescriptionOfElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @Getter
    @DescriptionOfElement("иконка - Like")
    @FindBy(xpath = "//section/span/button[1]")
    private WebElement linkIconLike;

    @Getter
    @DescriptionOfElement("иконка - Next")
    @FindBy(xpath = "//a[text()=\"Next\"]")
    private WebElement linkIconNext;

    @Getter
    @DescriptionOfElement("иконка - Close")
    @FindBy(xpath = "//button/div/*[@aria-label=\"Close\" and name()='svg']")
    private WebElement linkIconClose;

    @Getter
    @DescriptionOfElement("")
    @FindBy(xpath = "//div[@class=\"v1Nh3 kIKUG  _bz0w\"]")
    private List<WebElement> elmArrPosts;
}
////div/span/span/button[text()="Follow"]