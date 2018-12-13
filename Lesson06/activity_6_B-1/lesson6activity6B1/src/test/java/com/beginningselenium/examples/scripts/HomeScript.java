package com.beginningselenium.examples.scripts;

import com.beginningselenium.examples.pageobjects.DealsPage;
import com.beginningselenium.examples.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeScript {
    public static void main(String[] args) {
        checkHomeAndDealsPage();
    }

    private static void checkHomeAndDealsPage(){
        // Instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // Create an instance of HomePage class and open it
        HomePage homePage = new HomePage(driver);
        homePage.open();

        // Start the test
        DealsPage dealsPage = homePage.clickDeals();

        // Verify the quote
        String quote = "We have cheap stuff that will break in a few days";
        if (quote.equalsIgnoreCase(dealsPage.getQuote())) {
            System.out.println("Quote is correct!");
        } else {
            System.out.println("Quote is NOT correct!");
        }

        //Close the page
        dealsPage.close();
    }
}
