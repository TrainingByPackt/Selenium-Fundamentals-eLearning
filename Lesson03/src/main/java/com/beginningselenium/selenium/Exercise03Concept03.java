package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise03Concept03 {

  public static void main(String[] args) {
    interactingWithRadioButton();
  }

  private static void interactingWithRadioButton() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");

      WebElement masters = driver.findElement(By.cssSelector("input[value='masters']"));
      if (masters.isEnabled() && masters.isDisplayed()) {
        System.out.println("The radio button is enabled and visible.");
        if (!masters.isSelected()) {
          masters.click();
          if (masters.isSelected()) {
            System.out.println("It worked, the 'Masters' option was selected");
          } else {
            System.out.println("Something went wrong, 'Masters' was not selected.");
          }
        }

      } else {
        System.out.println("Something went wrong, the element 'Masters' was not enabled and visible.");
      }
    } finally {
      driver.quit();
    }
  }

}