package com.beginningselenium.examples.tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class OnlineStoreTest {
  @BeforeGroups("Login")
  public void setupLogin() {
    System.out.println("setupLogin()");
  }

  @Test(groups = { "Login" })
  public void loginTest1() {
    System.out.println("Login Functionality - Test 1");
  }

  @Test (groups = { "Login" })
  public void loginTest2() {
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
  public void searchTest1() {
    System.out.println("Search Functionality - Test 1");
  }

  @Test (groups = { "Search" })
  public void searchTest2() {
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
  public void paymentTest1() {
    System.out.println("Payment Functionality - Test 1");
  }

  @Test (groups = { "Payment" })
  public void paymentTest2() {
    System.out.println("Payment Functionality - Test 2");
  }

  @AfterGroups("Payment")
  public void cleanUpPayment() {
    System.out.println("CleanUp Payment()");
  }
}
