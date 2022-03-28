package tr.com.testinium.test;

import org.junit.Test;
import tr.com.testinium.driver.BaseTest;
import tr.com.testinium.page.LoginPage;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();

    }


}
