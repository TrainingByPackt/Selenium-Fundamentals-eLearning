package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise03Concept01 {

  public static void main(String[] args) {
    interactingWithTextAreas();
  }

  private static void interactingWithTextAreas() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");

      WebElement textArea = driver.findElement(By.id("aboutYourself"));

      if (textArea.isEnabled() && textArea.isDisplayed()) {
        System.out.println("The text area is visible and displayed");

        // Checking for an empty text area
        if ("".equals(textArea.getAttribute("value"))) {
          System.out.println("The text area is empty");
        } else {
          System.out.println("Something is wrong, the text area NOT empty");
        }

        textArea.sendKeys("This is a sample text.");

        if ("This is a sample text.".equalsIgnoreCase(textArea.getAttribute("value"))) {
          System.out.println("Text was correctly typed into the text area.");
        } else {
          System.out.println("Something went wrong, text was not typed into the text area.");
        }

        textArea.clear();
        if ("".equals(textArea.getAttribute("value"))) {
          System.out.println("The text area is empty after cleaning it though a Selenium command");
        } else {
          System.out.println("Something went wrong, the text area was not cleaned");
        }

      } else {
        System.out.println("Something went wrong, the text area is not visible and displayed");
      }

    } finally {
      driver.quit();
    }
  }

}