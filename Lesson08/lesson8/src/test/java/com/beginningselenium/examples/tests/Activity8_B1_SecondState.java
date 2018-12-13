package com.beginningselenium.examples.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity8_B1_SecondState {

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
  public void TimingTest() throws Exception {
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_8/activity_8-B-1.html");
    
    System.out.println("Waiting for the first button");
    WebElement firstButton = driver.findElement(By.id("firstButton"));
    System.out.println("Clicking on the first button");
    firstButton.click();

    System.out.println("Waiting for the second button");
    WebElement secondButton = driver.findElement(By.id("secondButton"));
    System.out.println("Clicking on the second button");
    secondButton.click();

    System.out.println("Waiting for the third button");
    WebElement thirdButton = driver.findElement(By.id("thirdButton"));
    System.out.println("Clicking on the third button");
    thirdButton.click();

    System.out.println("Waiting for the fourth button");
    WebElement fourthButton = driver.findElement(By.id("fourthButton"));
    System.out.println("Clicking on the fourth button");
    fourthButton.click();

    System.out.println("Waiting for the final status");
    WebElement instruction = driver.findElement(By.id("instruction"));
    Assert.assertEquals(instruction.getText(), "Activity completed!");

  }

}
