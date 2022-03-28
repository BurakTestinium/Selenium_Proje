package tr.com.testinium.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import tr.com.testinium.methods.Methods;

public class ProductPage {


    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {

        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//*[@id=\"product-596239\"]/div[1]/div[1]/div/a/img"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-572810\"]/div[2]/div[3]/a[5]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-580553\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-570901\"]/div[2]/div[3]/a[5]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-596239\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select"), "Yüksek Oylama");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-276007\"]/div[3]/div/a/img"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"button-cart\"]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-580553\"]/div[2]/div[3]/a[3]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"button-cart\"]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"js-cart\"]"));
        methods.waitBySeconds(1);

        methods.sendKeys(By.xpath("//*[@id=\"address-firstname-companyname\"]"), "Burak");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-lastname-title\"]"), "DEMİR");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"address-zone-id\"]"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"address-county-id\"]"), "BEYLİKDÜZÜ");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"district\"]"), "BARIŞ MAH");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-address-text\"]"), "BEYLİKDÜZÜ");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-postcode\"]"), "34560");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-telephone\"]"), "05343432133");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-mobile-telephone\"]"), "5343543546");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-tax-id\"]"), "43432435435");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"logo\"]/a/img"));
        methods.waitBySeconds(2);

    }




    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text : " +attribute);
        logger.info("Alınan text :" +attribute);
        methods.waitBySeconds(1);
    }

    public void textControl(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text : " +text);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text : " + value);
        logger.info("Alınan text : " +value);
        Assert.assertEquals("testinium",value);
        methods.waitBySeconds(5);
    }



}
