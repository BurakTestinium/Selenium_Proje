package tr.com.testinium.test;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import tr.com.testinium.driver.BaseTest;
import tr.com.testinium.page.LoginPage;
import tr.com.testinium.page.ProductPage;

public class ProductTest extends BaseTest {

    @Test

    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.selectProduct();

    }

    @Test
    public void getAttributeTest(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.textControl();

    }

    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();
        productPage.valueControlTest();
    }


}
