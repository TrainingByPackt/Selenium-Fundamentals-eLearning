package com.beginningselenium.examples.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePage  {

    //WebElements
    private MenuPage menu;

    ///WebDriver
    private WebDriver driver;
    private String url = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_7/activity_7_C-1.html";

    //Class Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods to open and close the WebDriver
    public void open() {
        this.driver.get(url);
    }
    public void close() {
        this.driver.quit();
    }

    // Methods to navigate the menu navigation
    public ProductsPage goToProducts(){
        menu = new MenuPage(driver);
        return menu.goToProducts();
    }

    // Methods to read the banner
    public String getMainInfo(){
        return new BannerPage(this.driver).getMainInfo();
    }

    public String getSecondaryInfo(){
        return new BannerPage(this.driver).getSecondaryInfo();
    }


}