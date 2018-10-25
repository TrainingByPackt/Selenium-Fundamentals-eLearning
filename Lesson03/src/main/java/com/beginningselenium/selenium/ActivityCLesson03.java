package com.beginningselenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActivityCLesson03 {

  public static void main(String[] args) {
    FillingFormAndSubmitting();
  }

  private static void FillingFormAndSubmitting() {

    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/exercise_3_1.html");

      WebElement firstName = driver.findElement(By.id("firstName"));
      firstName.sendKeys("John");
      WebElement lastName = driver.findElement(By.id("lastName"));
      lastName.sendKeys("Doe");

      Select dayOfBirth = new Select(driver.findElement(By.id("dayOfBirth")));
      dayOfBirth.selectByVisibleText("20");
      Select monthOfBirth = new Select(driver.findElement(By.id("monthOfBirth")));
      monthOfBirth.selectByVisibleText("March");
      WebElement yearOfBirth = driver.findElement(By.id("yearOfBirth"));
      yearOfBirth.sendKeys("1990");

      Select hobbies = new Select(driver.findElement(By.id("hobbies")));
      hobbies.selectByVisibleText("Reading");
      hobbies.selectByVisibleText("Sports");

      WebElement masters = driver.findElement(By.cssSelector("input[value='masters']"));
      masters.click();

      WebElement emailUpdates = driver.findElement(By.id("emailUpdates"));
      emailUpdates.click();

      WebElement aboutYourself = driver.findElement(By.id("aboutYourself"));
      aboutYourself.sendKeys("I think Selenium is getting easier and easier!");

      WebElement submit = driver.findElement(By.id("submit"));
      submit.click();


    } finally {
      driver.quit();
    }
  }

}

