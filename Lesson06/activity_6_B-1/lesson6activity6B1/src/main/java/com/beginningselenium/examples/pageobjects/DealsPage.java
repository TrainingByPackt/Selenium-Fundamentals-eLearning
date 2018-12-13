package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealsPage {

    private WebDriver driver;
    // WebElements
    private WebElement quote;

    public DealsPage (WebDriver webDriver) {
        this.driver = webDriver;
        if (!"Deals".equalsIgnoreCase(this.driver.getTitle())){
            
        }
    }


    public void close() {
        this.driver.quit();
    }

    public String getQuote() {
        quote = driver.findElement(By.id("quote"));
        return quote.getText();
    }
}
