package com.pageobjects.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceHome {
    private WebDriver driver;
    
    @FindBy(xpath =  "//div[text()='Swag Labs']")
    private WebElement saucelab;
    
    public SauceHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public boolean isWelcomeMessageDisplayed() {
        return saucelab.isDisplayed();
    }
}