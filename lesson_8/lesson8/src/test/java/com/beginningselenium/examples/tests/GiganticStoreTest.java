package com.beginningselenium.examples.tests;

import com.beginningselenium.examples.pageobjects.HomePage;
import com.beginningselenium.examples.pageobjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
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

  @BeforeGroups("Login")
  public void setupLogin() {
    System.out.println("setupLogin()");
  }

  @Test(groups = { "Login" }, enabled = false)
  public void LoginTest1() {
    System.out.println("Login Functionality - Test 1");
  }

  @Test (groups = { "Login" })
  public void LoginTest2() {
    System.out.println("Login Functionality - Test 2");
  }

  @AfterGroups("Login")
  public void cleanUpLogin() {
    System.out.println("cleanUpLogin()");
  }

  @BeforeGroups("Search")
  public void setupSearch() {
    System.out.println("setupSearch()");
  }

  @Test (groups = { "Search" })
  public void SearchTest1() {
    System.out.println("Search Functionality - Test 1");
  }

  @Test (groups = { "Search" }, enabled = false)
  public void SearchTest2() {
    System.out.println("Search Functionality - Test 2");
  }

  @AfterGroups("Search")
  public void cleanUpSearch() {
    System.out.println("CleanUp Search()");
  }

  @BeforeGroups("Payment")
  public void setupPayment() {
    System.out.println("setupPayment()");
  }

  @Test (groups = { "Payment" })
  public void PaymentTest1() {
    System.out.println("Payment Functionality - Test 1");
  }

  @Test (groups = { "Payment" })
  public void PaymentTest2() {
    System.out.println("Payment Functionality - Test 2");
  }

  @AfterGroups("Payment")
  public void cleanUpPayment() {
    System.out.println("CleanUp Payment()");
  }


}

