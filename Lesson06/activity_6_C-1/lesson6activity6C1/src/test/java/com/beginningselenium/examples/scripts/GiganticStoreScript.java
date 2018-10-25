package com.beginningselenium.examples.scripts;

import com.beginningselenium.examples.pageobjects.HomePage;
import com.beginningselenium.examples.pageobjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiganticStoreScript {
    public static void main(String[] args) {
        checkGiganticStore();
    }

    private static void checkGiganticStore() {

        WebDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        homePage.open();
        ProductsPage productsPage = homePage.goToProducts();

        // Verify results in products page
        String productsMainInfo = "Here's the stuff we sell";
        if (productsMainInfo.equalsIgnoreCase(productsPage.getMainInfo())) {
            System.out.println("Products main info is correct!");
        } else {
            System.out.println("Products main info is NOT correct!");
        }
        String productsSecondaryInfo = "We have everything... everything";
        if (productsSecondaryInfo.equalsIgnoreCase(productsPage.getSecondaryInfo())) {
            System.out.println("Products secondary info is correct!");
        } else {
            System.out.println("Products secondary info is NOT correct!");
        }

        // Go back home
        homePage = productsPage.goToHome();

        // Verify results in home page
        String homePageMainInfo = "Our best selling product";
        if (homePageMainInfo.equalsIgnoreCase(homePage.getMainInfo())) {
            System.out.println("HomePage main info is correct!");
        } else {
            System.out.println("HomePage main info is NOT correct!");
        }
        String homePageSecondaryInfo = "Buy it before it's too late";
        if (homePageSecondaryInfo.equalsIgnoreCase(homePage.getSecondaryInfo())) {
            System.out.println("HomePage secondary info is correct!");
        } else {
            System.out.println("HomePage secondary info is NOT correct!");
        }

        // Close the page
        homePage.close();
    }
}
