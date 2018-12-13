package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    //WebElements
    private WebElement products;

    ///WebDriver
    private WebDriver driver;

    //Class Constructor
    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to navigate the menu
    public ProductsPage goToProducts(){
        products = driver.findElement(By.id("products"));
        products.click();
        return new ProductsPage(this.driver);
    }
}
