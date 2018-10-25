package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.WebDriver;

public class ProductsPage {
    //WebElements
    private HeaderPage header;

    ///WebDriver
    private WebDriver driver;
    
    //Class Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to navigate the header
    public HomePage goToHome(){
        header = new HeaderPage(this.driver);
        return header.goToHome();
    }

    // Methods to read the banner
    public String getMainInfo(){
        return new BannerPage(this.driver).getMainInfo();
    }

    public String getSecondaryInfo(){
        return new BannerPage(this.driver).getSecondaryInfo();
    }
}
