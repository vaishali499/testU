package com.selenium.tests.junit.tests;

/**
 * Created by hammidfunsho on 1/13/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    private WebDriver driver;
    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By submitButtonLocator = By.cssSelector("button");
    By successMessageLocator = By.cssSelector(".flash.success");


    public Login(WebDriver driver){
        System.setProperty("webdriver.chrome.driver", "/Users/hammidfunsho/Downloads/chromedriver");
        this.driver = driver;
        driver.get("http://the-internet.herokuapp.com/login");
    }

    public void with(String username, String password){

        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(submitButtonLocator).click();
    }

    public boolean successMessage(){
        return driver.findElement(successMessageLocator).isDisplayed();
    }

}
