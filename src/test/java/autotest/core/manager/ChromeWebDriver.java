package autotest.core.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {
    private static WebDriver driver;
    public static WebDriver getInstance(){
        if (driver==null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--use-fake-ui-for-media-stream");
            options.addArguments("--disable-user-media-security");
            options.addArguments("--disable-web-security");
            options.addArguments("--disable-notifications");
            options.addArguments("--reduce-security-for-testing");
            options.addArguments("--use-fake-device-for-media-stream");
            options.addArguments("--allow-file-access-from-files");
            options.addArguments("--lang=en");
//            options.addArguments("--use-file-for-fake-video-capture="+System.getProperty("");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/executables/chromedriver.exe");
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
