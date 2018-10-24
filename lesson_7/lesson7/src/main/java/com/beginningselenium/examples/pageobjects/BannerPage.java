package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BannerPage {

    //WebElements
    private WebElement mainInfo;
    private WebElement secondaryInfo;

    ///WebDriver
    private WebDriver driver;

    //Class Constructor
    public BannerPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to read info of the banner
    public String getMainInfo(){
        mainInfo = driver.findElement(By.id("mainInfo"));
        return mainInfo.getText();
    }

    public String getSecondaryInfo(){
        secondaryInfo = driver.findElement(By.id("secondaryInfo"));
        return secondaryInfo.getText();
    }
}
