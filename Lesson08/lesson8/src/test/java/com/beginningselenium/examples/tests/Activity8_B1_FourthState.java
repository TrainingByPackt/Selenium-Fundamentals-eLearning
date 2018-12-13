package com.beginningselenium.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8_B1_FourthState {

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
  public void TimingTest() {
    driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_8/activity_8-B-1.html");

    WebDriverWait wait = new WebDriverWait(driver, 15);

    System.out.println("Waiting for the first button");
    WebElement firstButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstButton")));
    System.out.println("Clicking on the first button");
    firstButton.click();

    System.out.println("Waiting for the second button");
    WebElement secondButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secondButton")));
    System.out.println("Clicking on the second button");
    secondButton.click();

    System.out.println("Waiting for the third button");
    WebElement thirdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("thirdButton")));
    System.out.println("Clicking on the third button");
    thirdButton.click();

    System.out.println("Waiting for the fourth button");
    WebElement fourthButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fourthButton")));
    System.out.println("Clicking on the fourth button");
    fourthButton.click();

    System.out.println("Waiting for the final status");
    wait.until(ExpectedConditions.textToBe(By.id("instruction"), "Activity completed!"));
  }

}
