package com.beginningselenium.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity8_B1_FirstState {

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
  public void timingTest() throws InterruptedException {
    driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_8/activity_8-B-1.html");

    // Sleeping 15 seconds because the button does not seem to take longer than that
    System.out.println("Waiting for the first button");
    Thread.sleep(15 * 1000);
    WebElement firstButton = driver.findElement(By.id("firstButton"));
    System.out.println("Clicking on the first button");
    firstButton.click();

    // Sleeping again until the next button shows up
    System.out.println("Waiting for the second button");
    Thread.sleep(15 * 1000);
    WebElement secondButton = driver.findElement(By.id("secondButton"));
    System.out.println("Clicking on the second button");
    secondButton.click();

    // Sleeping again until the next button shows up
    System.out.println("Waiting for the third button");
    Thread.sleep(15 * 1000);
    WebElement thirdButton = driver.findElement(By.id("thirdButton"));
    System.out.println("Clicking on the third button");
    thirdButton.click();

    // Sleeping again until the next button shows up
    Thread.sleep(15 * 1000);
    System.out.println("Waiting for the fourth button");
    WebElement fourthButton = driver.findElement(By.id("fourthButton"));
    System.out.println("Clicking on the fourth button");
    fourthButton.click();

    // Sleeping again until the next button shows up
    System.out.println("Waiting for the final status");
    Thread.sleep(8 * 1000);
    WebElement instruction = driver.findElement(By.id("instruction"));
    Assert.assertEquals(instruction.getText(), "Activity completed!");

  }

}
