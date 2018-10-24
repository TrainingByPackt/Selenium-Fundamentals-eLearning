package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    // WebDriver
    private WebDriver driver;
    private WebElement linkText;
    private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/activity_6_B-1.html";

    //Methods to open and close the WebDriver
    public void open() {
        this.driver.get(url);
    }
    public void close() {
        this.driver.quit();
    }

    // Class Constructor
    public HomePage(WebDriver webDriver){
        driver = webDriver;
    }

    // Clicks on an clickable option of the homepage
    private void clickOption(String option){
        linkText = driver.findElement(By.linkText(option));
        linkText.click();
    }

    public DealsPage clickDeals(){
        this.clickOption("Deals");
        return new DealsPage(driver);
    }
}
