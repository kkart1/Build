package com.pageobjects.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceTest {
    WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    
    @Test
    public void testLogin() {
        SauceLogin loginPage = new SauceLogin(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        
        SauceHome homePage = new SauceHome(driver);
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed());
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}