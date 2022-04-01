package com.meyoung.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgDemo1 {


    WebDriver webdriver;
    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\自动化下载包\\GoogleChrome_65.0.3325.146_PortableSoft\\ChromePortable\\App\\Google Chrome\\chromedriver.exe");
        webdriver = new ChromeDriver();
    }

    @Test
    public void getUrl() throws InterruptedException {
        webdriver.get("https://www.baidu.com");
        String url = webdriver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.baidu.com/");
        Thread.sleep(5000);


    }
    @AfterMethod
    public void quitChrome(){
        webdriver.quit();
    }
}
