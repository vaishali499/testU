package com.selenium.tests.pages;

/**
 * Created by hammidfunsho on 1/13/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ChromeDriverTest {

    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "/Users/hammidfunsho/Downloads/chromedriver");

        try {

            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com/xhtml");
            Thread.sleep(5000);  // Let the user actually see something!
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Cheese");
            searchBox.submit();
            Thread.sleep(5000);  // Let the user actually see something!
            driver.quit();
        } catch (Exception e) {System.out.println("An exception has occurred" + e);}
    }
    }

