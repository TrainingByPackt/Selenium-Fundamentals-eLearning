package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise03Concept04 {

  public static void main(String[] args) {
    interactingWithCheckBox();
  }

  private static void interactingWithCheckBox() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");

      WebElement emailUpdates = driver.findElement(By.id("emailUpdates"));
      if (emailUpdates.isEnabled() && emailUpdates.isDisplayed()) {
        System.out.println("The email updates checkbox is enabled and visible.");
        if (!emailUpdates.isSelected()) {
          emailUpdates.click();
          if (emailUpdates.isSelected()) {
            System.out.println("It worked, the checkbox to get email updates was selected");
          } else {
            System.out.println("Something went wrong, the email updates checkbox was not selected.");
          }
        }

      } else {
        System.out.println("Something went wrong, checkbox was not enabled and visible.");
      }
    } finally {
      driver.quit();
    }
  }

}

