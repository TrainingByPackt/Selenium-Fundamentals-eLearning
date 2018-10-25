package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.WebDriver;

public class ProductsPage {
    //WebElements
    private HeaderPage header;

    ///WebDriver
    private WebDriver driver;
    private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/products.html";

    //Class Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods to open and close the WebDriver
    public void open() {
        this.driver.get(url);
    }

    public void close() {
        this.driver.quit();
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
