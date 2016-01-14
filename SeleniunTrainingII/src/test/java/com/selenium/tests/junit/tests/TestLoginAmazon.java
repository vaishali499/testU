package com.selenium.tests.junit.tests;

/**
 * Created by hammidfunsho on 1/13/16.
 */

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestLoginAmazon {

    private WebDriver driver;

    @Before
    public void setupII(){
        System.setProperty("webdriver.chrome.driver", "/Users/hammidfunsho/Downloads/chromedriver");
        driver = new ChromeDriver();
    }



    @Test
    public void succeded (){
        driver.get("http://www.amazon.com");
        driver.findElement(By.id("nav-link-yourAccount")).click();
        driver.findElement(By.id("ap_email")).sendKeys("testautomation233@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("hammid");
        driver.findElement(By.id("signInSubmit")).click();
    }




    @After
    public void teardown(){
        driver.quit();
    }


}
