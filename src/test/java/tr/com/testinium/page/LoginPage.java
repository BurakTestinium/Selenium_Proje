package tr.com.testinium.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import tr.com.testinium.methods.Methods;

public class LoginPage {

    Methods methods;

    public LoginPage(){
     methods = new Methods();

    }


    public void login(){
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"),"burakdemir96@gmail.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-password"),"12345678");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-form-buttons"));
        methods.waitBySeconds(20);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
        methods.waitBySeconds(5);
    }

}
