package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise03Concept02 {

  public static void main(String[] args) {
    interactingWithDropDown();
  }

  private static void interactingWithDropDown() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");

      Select singleChoiceList = new Select(driver.findElement(By.id("monthOfBirth")));

      if (!singleChoiceList.isMultiple() && singleChoiceList.getOptions().size() == 13) {
        System.out.println("The list does not accept multiple choices and contains 13 options (including 'Choose...').");
        singleChoiceList.selectByVisibleText("February");
        if (singleChoiceList.getFirstSelectedOption().getText().equalsIgnoreCase("February")) {
          System.out.println("It worked, February was selected as the month.");
        } else {
          System.out.println("Something went wrong, February is not selected.");
        }
      } else {
        System.out.println("Something went wrong, the selection list is not configured as expected");
      }

      Select multipleChoiceList = new Select(driver.findElement(By.id("hobbies")));

      if (multipleChoiceList.isMultiple() && multipleChoiceList.getOptions().size() == 4) {
        System.out.println("The list does accept multiple choices and contains 4 options.");
        multipleChoiceList.selectByVisibleText("Reading");
        multipleChoiceList.selectByVisibleText("Sports");
        multipleChoiceList.selectByVisibleText("Traveling");

        multipleChoiceList.deselectByVisibleText("Sports");

        if (multipleChoiceList.getAllSelectedOptions().size() == 2) {
          System.out.println("It worked, 2 options have been chosen");
        } else {
          System.out.println("Something went wrong, a different number from 2 options have been chosen");
        }

        List<String> expectedSelection = Arrays.asList("Reading", "Traveling");
        List<String> actualSelection = new ArrayList<String>();

        for (WebElement element : multipleChoiceList.getAllSelectedOptions()) {
          actualSelection.add(element.getText());
        }

        if (actualSelection.containsAll(expectedSelection)) {
          System.out.println("It worked, all expected elements were selected.");
        } else {
          System.out.println("Something went wrong, not all the expected elements were selected.");
        }
      } else {
        System.out.println("Something went wrong, the multiple selection list is not configured as expected");
      }

    } finally {
      driver.quit();
    }
  }

}