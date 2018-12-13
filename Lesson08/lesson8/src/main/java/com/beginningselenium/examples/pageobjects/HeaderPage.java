package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
    //WebElements
    private WebElement home;

    ///WebDriver
    private WebDriver driver;

    //Class Constructor
    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to navigate the header
    public HomePage goToHome(){
        home = driver.findElement(By.id("home"));
        home.click();
        return new HomePage(this.driver);
    }
}
