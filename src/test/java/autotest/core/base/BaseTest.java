package autotest.core.base;

import autotest.core.business.User;
import autotest.core.manager.ChromeWebDriver;
import autotest.pages.actions.AuthorizationPageHelper;
import autotest.pages.actions.CommonHelper;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static SuiteConfiguration config;
    private static WebDriver driver;

    // страниц действий
    public CommonHelper commonHelper;
    public AuthorizationPageHelper authorizationPageHelper;

    public BaseTest(){
        commonHelper = PageFactory.initElements(BasePage.getWebDriver(), CommonHelper.class);
        authorizationPageHelper = PageFactory.initElements(BasePage.getWebDriver(), AuthorizationPageHelper.class);
    }

    public static WebDriver instantiateDriver() {
        try{
            if (driver == null) config = new SuiteConfiguration();
            if (config.getProperty("browser").equalsIgnoreCase("chrome")) driver = ChromeWebDriver.getInstance();
        }catch (IOException ex){
            System.out.println(ex);
        }

        return driver;
    }

    //Входные данные
    @Getter
    private User addUserName = new User("kavalenko.andrie@mail.ru", "yelamanov.almat");


    @BeforeSuite
    public void setUp(){
        if (driver!=null) driver.get(config.getProperty("url"));
        if (driver!=null) driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitlyWait")), TimeUnit.SECONDS);
    }

    @BeforeClass
    public void setUpClass(){
        String className = this.getClass().getName();
        Page.logger.info("RUN class: "+ className);
    }

    @BeforeMethod
    public static void setUpMethod(Method method){
        String testName = method.getName();
        Page.logger.info("RUN test method: "+ testName);
    }

//    @AfterSuite
//    public void tearDown() {
//        if (driver!= null) {
//            driver.quit();
//        }
//
//        Page.logger.info("test execution completed.");
//
//    }
}
