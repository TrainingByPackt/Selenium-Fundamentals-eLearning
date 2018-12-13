package com.beginningselenium.examples.tests;

import com.beginningselenium.examples.pageobjects.HomePage;
import com.beginningselenium.examples.pageobjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiganticStoreTest {

  private WebDriver driver;

  @BeforeMethod
  public void setUpWebDriver() {
    driver = new ChromeDriver();
  }

  @AfterMethod(alwaysRun = true)
  public void teardownWebDriver() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void verifyProductsPageInformation() {
    HomePage homePage = new HomePage(driver);
    homePage.open();
    ProductsPage productsPage = homePage.goToProducts();

    // Verify results in products page
    String expectedProductsMainInfo = "Here's the stuff we sell";
    Assert.assertEquals(productsPage.getMainInfo(), expectedProductsMainInfo, "Product page main info was not the expected one.");
    String expectedProductsSecondaryInfo = "We have everything... everything";
    Assert.assertEquals(productsPage.getSecondaryInfo(), expectedProductsSecondaryInfo, "Product page secondary info was not the expected one.");
  }

  @Test
  public void verifyHomePageInformation() {
    HomePage homePage = new HomePage(driver);
    homePage.open();

    String expectedHomePageMainInfo = "Our best selling product";
    Assert.assertEquals(homePage.getMainInfo(), expectedHomePageMainInfo, "Home page main info was not the expected one.");
    String expectedHomePageSecondaryInfo = "Buy it before it's too late";
    Assert.assertEquals(homePage.getSecondaryInfo(), expectedHomePageSecondaryInfo, "Home page secondary info was not the expected one.");
  }

}

