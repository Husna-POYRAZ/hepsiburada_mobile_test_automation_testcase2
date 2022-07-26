import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{
    LoginHomePageTest loginHomePageTest;
    SuperPricePageTest superPricePageTest;
    ProductPageTest productPageTest;
    LoginEmailPageTest loginEmailPageTest;
    CheckLoginPageTest checkLoginPageTest;



    @Test
    public void test_add_task() throws MalformedURLException, InterruptedException {
        setUp();
        Thread.sleep(10000);
        loginHomePageTest.loginHomePageTest();
        superPricePageTest.superPricePageTest();
        productPageTest.addFavourityProduct();
        loginEmailPageTest.loginEmailTest();
        checkLoginPageTest.loginCheckTest();
    }
}
