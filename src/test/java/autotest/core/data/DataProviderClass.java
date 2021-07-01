package autotest.core.data;

import autotest.core.base.BaseTest;
import org.testng.annotations.DataProvider;

public class DataProviderClass extends BaseTest {
    @DataProvider
    public Object[][] searchData() {
        return new Object[][] {
                {"How to automate site using selenium"}
        };
    }
}
