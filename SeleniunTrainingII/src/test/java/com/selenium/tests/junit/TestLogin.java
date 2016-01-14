package com.selenium.tests.junit.tests;


/**
 * Created by hammidfunsho on 1/13/16.
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import com.selenium.tests.junit.tests.Login;

public class TestLogin {

    private WebDriver driver;
    private Login login;

    //set up the browser and point to the path of the chromedriver

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/hammidfunsho/Downloads/chromedriver");
        driver = new ChromeDriver();
        login = new Login(driver);
    }

    //execute the main test method
    @Test
    public void succeeded(){

            login.with("tomsmith","SuperSecretPassword!");
            assertTrue("Success Message not present", driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
        //assert the success message is present
    }

    //shut down the browser and all related clean up tasks
    @After
    public void teardown(){
        driver.quit();

    }

}
